package pe.com.MDRO.test.system.selenium.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pe.com.MDRO.test.system.selenium.page.indexPage;
import pe.com.MDRO.test.system.selenium.page.listaEtiPage;

public class MListaEtiqueta {
	private String urlInicial = "http://localhost:8080/2MDROApp/";
	private indexPage indexPage;
	private listaEtiPage listaetipage;
	
	@BeforeTest
	
	public void inicioClase() throws Exception {
		this.indexPage = new indexPage( this.urlInicial);
		this.listaetipage = new listaEtiPage(this.indexPage.getWebDriver());
	}
	
	@Test
	public void editar_etiqueta_flujoBasico() throws Exception{
		try {
			String valorEsperado = "Etiqueta editada";
			indexPage.irlistarEti();
			String valorObtenido = listaetipage.editar("battle royale");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void eliminar_etiqueta_flujoBasico() throws Exception{
		try {
			String valorEsperado = "Etiqueta eliminada";
			String valorObtenido = listaetipage.eliminar();
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		listaetipage.cerrarPagina();
	}

}
