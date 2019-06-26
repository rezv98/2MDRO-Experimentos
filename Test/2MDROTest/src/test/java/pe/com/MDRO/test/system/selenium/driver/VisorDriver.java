package pe.com.MDRO.test.system.selenium.driver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class VisorDriver {

	
	public final static WebDriver inicializarDriver(String navegador) {
		WebDriver webDriver = null;
		try {

			switch (navegador) {
			case "firefox":

				System.setProperty("webdriver.gecko.driver", "C:\\ProgramasInstalados\\geckodriver.exe");
				webDriver = new FirefoxDriver();

				break;
			case "chrome":

				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
				webDriver = new ChromeDriver();

				break;
			}
			webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return webDriver;
	}

	public final static void cerrarPagina(WebDriver webDriver) {
		if (webDriver != null) {
			webDriver.quit();
		}
	}

}
