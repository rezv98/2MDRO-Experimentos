package pe.com.MDRO.test.system.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.com.MDRO.test.system.selenium.driver.VisorDriver;

public class indexPage {
	private By botonCrearCate = By.xpath("/html/body/div/div/div/div/nav[3]/a");
	private By botoncrearEti = By.xpath("/html/body/div/div/div/div/nav[2]/a");
	private By botoncrearTi = By.xpath("/html/body/div/div/div/div/nav[4]/a");
	private By botonlistaCate = By.xpath("/html/body/div/div/div/div/nav[8]/a");
	private By botonlistaEti = By.xpath("/html/body/div/div/div/div/nav[7]/a");
	private By botonlistaTie = By.xpath("/html/body/div/div/form/nav/div/ul[5]/li[2]/a");
private WebDriver webDriver = null;
private String urlInicial;
	
	public indexPage(String urlInicial) {
		this.webDriver = VisorDriver.inicializarDriver("chrome");
		this.urlInicial = urlInicial;
		this.webDriver.get(this.urlInicial);
	}

	
	public void ircrearCate() throws Exception {
		webDriver.findElement(botonCrearCate).click();
		Thread.sleep(2000);
	}
	
	public void ircrearEti() throws Exception {
		webDriver.findElement(botoncrearEti).click();
		Thread.sleep(2000);
	}
	public void ircrearTi() throws Exception {
		webDriver.findElement(botoncrearTi).click();
		Thread.sleep(2000);
	}
	
	public void irlistarCate() throws Exception {
		webDriver.findElement(botonlistaCate).click();
		Thread.sleep(2000);
	}
	
	public void irlistarEti() throws Exception {
		webDriver.findElement(botonlistaEti).click();
		Thread.sleep(2000);
	}
	
	public void irlistarTien() throws Exception {
		webDriver.findElement(botonlistaTie).click();
		Thread.sleep(2000);
	}
	public WebDriver getWebDriver() {
		return webDriver;
	}
}
