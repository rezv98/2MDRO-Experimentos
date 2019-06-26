package pe.com.core.test.integration.suite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources",
	glue = {"pe.com.core.test.integration.test"},
	plugin = {
			"pretty",
			"html:target/cucumber",
			"json:target/cucumber.json",
			"junit:target/cucumber_junit_report.xml"
	},
	tags= {"@tag1"}
	
	
)
public class AppIntegrationSuite {

}
