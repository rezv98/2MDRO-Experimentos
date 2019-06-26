package pe.com.MDRO.test.system.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.com.MDRO.test.system.selenium.driver.VisorDriver;

public class crearPage {
	private WebDriver webDriver = null;
	private By inputnom = By.xpath("/html/body/div/div/div/div/form/div/div[1]/input");
	private By inputdes = By.xpath("/html/body/div/div/div/div/form/div/div[2]/input");
	private By botoncrear = By.xpath("/html/body/div/div/div/div/form/div/div/button");
	private By mensajeRespuesta = By.xpath("/html/body/div/div/div/div/form/div/div/ul/li/span[1]");
	public crearPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public String insertar(String nombre , String descripcion) throws Exception {
		webDriver.findElement(inputnom).clear();
		webDriver.findElement(inputnom).sendKeys(nombre);
		webDriver.findElement(inputdes).clear();
		webDriver.findElement(inputdes).sendKeys(descripcion);
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
