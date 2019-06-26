package pe.com.MDRO.test.system.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.com.MDRO.test.system.selenium.driver.VisorDriver;

public class TiendaPage {
	private WebDriver webDriver = null;
	private By inputnom = By.id("j_idt51:nombre");
	private By inputurl = By.id("j_idt51:url");
	private By botoncrear = By.id("j_idt51:j_idt71");
	private By mensajeRespuesta = By.xpath("/html/body/div/div/div/div/form/div/div/ul/li/span[1]");
	
	public TiendaPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public String insertar(String nombre, String url ) throws Exception {
		webDriver.findElement(inputnom).clear();
		webDriver.findElement(inputnom).sendKeys(nombre);
		webDriver.findElement(inputurl).clear();
		webDriver.findElement(inputurl).sendKeys(url);
		webDriver.findElement(botoncrear).click();
		Thread.sleep(2000);
		return webDriver.findElement(mensajeRespuesta).getText();
	}
	
	public void cerrarPagina(){
		VisorDriver.cerrarPagina(webDriver);
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}

}
