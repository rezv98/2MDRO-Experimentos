package pe.com.MDRO.test.system.selenium.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pe.com.MDRO.test.system.selenium.page.indexPage;
import pe.com.MDRO.test.system.selenium.page.listaTiendaPage;

public class MListaTiendaPage {
	private String urlInicial = "http://localhost:8080/2MDROApp/";
	private indexPage indexPage;
	private listaTiendaPage listatiendapage;
	
	@BeforeTest
	
	public void inicioClase() throws Exception {
		this.indexPage = new indexPage( this.urlInicial);
		this.listatiendapage = new listaTiendaPage(this.indexPage.getWebDriver());
	}
	
	@Test
	public void editar_tienda_flujoBasico() throws Exception{
		try {
			String valorEsperado = "Tienda editada";
			indexPage.irlistarTien();
			String valorObtenido = listatiendapage.editar("EA", "EA.com");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	/*@Test
	public void eliminar_tienda_flujoBasico() throws Exception{
		try {
			String valorEsperado = "Tienda eliminada";
			String valorObtenido = listatiendapage.eliminar();
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}*/
	
	@AfterTest
	public void tearDown() throws Exception {
		listatiendapage.cerrarPagina();
	}
}
