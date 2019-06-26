package pe.com.MDRO.test.system.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.com.MDRO.test.system.selenium.driver.VisorDriver;

public class listaTiendaPage {
	private WebDriver webDriver = null;
	private By btnEditar = By.xpath("/html/body/div/div/div/div/form/div/div/table/tbody/tr[1]/td[4]/div/a[1]");
	private By btnEliminar = By.xpath("/html/body/div/div/div/div/form/div/div/table/tbody/tr[4]/td[5]/a");
	private By mensaje = By.xpath("/html/body/div/div/div/div/form/div/div/ul/li/span[1]");
	private By inputeditnom = By.id("form:j_idt51:0:j_idt59");
	private By inputediturl = By.id("form:j_idt51:0:j_idt63");
	private By btnguardar = By.xpath("/html/body/div/div/div/div/form/div/div/table/tbody/tr[1]/td[4]/div/a[2]");
	
	public listaTiendaPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public String editar(String nombre , String URL) throws Exception {
		webDriver.findElement(btnEditar).click();
		Thread.sleep(2000);
		webDriver.findElement(inputeditnom).clear();
		webDriver.findElement(inputeditnom).sendKeys(nombre);
		webDriver.findElement(inputediturl).clear();
		webDriver.findElement(inputediturl).sendKeys(URL);
		webDriver.findElement(btnguardar).click();
		Thread.sleep(2000);
		return webDriver.findElement(mensaje).getText();
	}
	
	public String eliminar() throws Exception{
		webDriver.findElement(btnEliminar).click();
		Thread.sleep(2000);
		return webDriver.findElement(mensaje).getText();
	}
	
	
	public void cerrarPagina(){
		VisorDriver.cerrarPagina(webDriver);
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
}
