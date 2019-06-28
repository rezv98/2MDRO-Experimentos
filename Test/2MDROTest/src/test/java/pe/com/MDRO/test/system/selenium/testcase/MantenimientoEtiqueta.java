package pe.com.MDRO.test.system.selenium.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pe.com.MDRO.test.system.selenium.page.etiquetaPage;
import pe.com.MDRO.test.system.selenium.page.indexPage;

public class MantenimientoEtiqueta {
	private String urlInicial = "http://localhost:8080/2MDROApp/";
	private indexPage indexPage;
	private etiquetaPage etiquetaPage;
	
	@BeforeTest
	
	public void inicioClase() throws Exception {
		this.indexPage = new indexPage( this.urlInicial);
		this.etiquetaPage = new etiquetaPage(this.indexPage.getWebDriver());
	}
	
	
	@Test
	public void insertarEtiqueta_FlujoBasico() throws Exception {
		try {
			String valorEsperado = "Etiqueta creada";
			indexPage.ircrearEti();
			String valorObtenido = etiquetaPage.insertar("Juego");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	/*@Test(dependsOnMethods = {"insertarEtiqueta_FlujoBasico"})
	public void insertarCategoria_FlujoAlternativo() throws Exception {
		try {
			String valorEsperado = "Nombre: Error de validación: se necesita un valor.";
			String valorObtenido = etiquetaPage.insertar("");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}*/
	
	@AfterTest
	public void tearDown() throws Exception {
		etiquetaPage.cerrarPagina();
	}

}
