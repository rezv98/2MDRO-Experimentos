#!groovy
node {
    
    def repositorio = "C:\\Users\\mv579\\Documents\\GitHub" 
    def serverAplicaciones ="C:\\Software\\wildfly-17.0.0.Final\\bin"
	
	
    stage('Descargar Fuentes'){
        dir(repositorio) {
           
			git branch: 'master', credentialsId: 'USUARIO_PERSONAL_GIT', url: 'https://github.com/rezv98/2MDRO-Experimentos.git'

        }
    }
    
    stage('Compilar fuentes'){
        dir(repositorio + '\\App\\2MDROApp') {
            bat "mvn clean install"
        }
    }
    
    stage('Crear Entorno'){
        dir(repositorio + '\\DB\\2MDRODb') {
            bat "mvn flyway:clean -D2mdrodb.urlBaseDatos=localhost:3306 -D2mdrodb.baseDatos=2mdrodb -D2mdrodb.usuarioBaseDatos=root -D2mdrodb.claveBaseDatos=admin"
			bat "mvn flyway:migrate -D2mdrodb.urlBaseDatos=localhost:3306 -D2mdrodb.baseDatos=2mdrodb -D2mdrodb.usuarioBaseDatos=root -D2mdrodb.claveBaseDatos=admin"
		}
    }
    
    stage('Pruebas Unitarias'){
        dir(repositorio + '\\App\\Integration\\2MDROApp\\2MDROCore') {
			bat "mvn test -Dtest=*UnitSuite"
			bat "mvn sonar:sonar"
            step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/*.xml'])
        }
    }
	
	stage('Pruebas Integrales'){
        dir(repositorio + '\\1.App\\2MDROApp\\2MDROCore') {
			bat "mvn test -Dtest=*IntegrationSuite"
            cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/*.xml', conditionalCoverageTargets: '70, 0, 0', failUnhealthy: false, failUnstable: false, lineCoverageTargets: '80, 0, 0', maxNumberOfBuilds: 0, methodCoverageTargets: '80, 0, 0', onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false
			cucumber fileIncludePattern: '**/target/*.json', sortingMethod: 'ALPHABETICAL'
        }
    }
	
	stage('Desplegar QA'){
		bat "${serverAplicaciones}\\jboss-cli.bat -c --command=\"undeploy 2MDROApp.war\""
        bat "${serverAplicaciones}\\jboss-cli.bat -c --command=\"deploy ${repositorio}\\App\\2MDROApp\\2MDROWeb\\target\\2MDROApp.war\"
	}
	
	stage('Pruebas Funcionales'){
		dir(repositorio + '\\Test\\2MDROTest') {
			bat "mvn test"
			step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/*.xml'])
		}
	}

	    
    stage('Entregar Artefacto'){
        dir(repositorio + '\\App\\2MDROApp'){
            def server = Artifactory.server 'Artifactory'
            def workspace = pwd() 
            def uploadSpec = """{
             "files": [
                {
                  "pattern": "${repositorio}\\App\\2MDROApp\\2MDROWeb\\target\\*.war",
                  "target": "generic-local/2MDROApp/${BUILD_NUMBER}/"
                }
             ]
            }"""
            server.upload(uploadSpec)
        }
    }
   
}