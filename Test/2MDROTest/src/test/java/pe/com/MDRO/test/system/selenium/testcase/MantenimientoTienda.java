package pe.com.MDRO.test.system.selenium.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pe.com.MDRO.test.system.selenium.page.indexPage;
import pe.com.MDRO.test.system.selenium.page.TiendaPage;

public class MantenimientoTienda {
	private String urlInicial = "http://localhost:8080/2MDROApp/";
	private indexPage indexPage;
	private TiendaPage TiendaPage;
	
	@BeforeTest
	
	public void inicioClase() throws Exception {
		this.indexPage = new indexPage( this.urlInicial);
		this.TiendaPage = new TiendaPage(this.indexPage.getWebDriver());
	}
	
	
	@Test
	public void insertarTienda_FlujoBasico() throws Exception {
		try {
			String valorEsperado = "Tienda creada";
			indexPage.ircrearTi();
			String valorObtenido = TiendaPage.insertar("OSX", "osx.com");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(dependsOnMethods = {"insertarTienda_FlujoBasico"})
	public void insertarTienda_FlujoAlternativo() throws Exception {
		try {
			String valorEsperado = "Nombre: Error de validación: se necesita un valor.";
			String valorObtenido = TiendaPage.insertar("","activision.com");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(dependsOnMethods = {"insertarTienda_FlujoBasico"})
	public void insertarTienda_FlujoAlternativo2() throws Exception {
		try {
			String valorEsperado = "Url: Error de validación: se necesita un valor.";
			String valorObtenido = TiendaPage.insertar("bethesda","");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		TiendaPage.cerrarPagina();
	}


}
