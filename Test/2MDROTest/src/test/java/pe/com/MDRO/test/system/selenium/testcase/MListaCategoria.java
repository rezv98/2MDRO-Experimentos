package pe.com.MDRO.test.system.selenium.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pe.com.MDRO.test.system.selenium.page.indexPage;
import pe.com.MDRO.test.system.selenium.page.listaCatePage;

public class MListaCategoria {
	private String urlInicial = "http://localhost:8080/2MDROApp/";
	private indexPage indexPage;
	private listaCatePage listacatepage;
	
	@BeforeTest
	
	public void inicioClase() throws Exception {
		this.indexPage = new indexPage( this.urlInicial);
		this.listacatepage = new listaCatePage(this.indexPage.getWebDriver());
	}
	
	@Test
	public void editar_categoria_flujoBasico() throws Exception{
		try {
			String valorEsperado = "Categoria editada";
			indexPage.irlistarCate();
			String valorObtenido = listacatepage.editar("un jugador", "solo para uno");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void eliminar_categoria_flujoBasico() throws Exception{
		try {
			String valorEsperado = "Categoría eliminada";
			String valorObtenido = listacatepage.eliminar();
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		listacatepage.cerrarPagina();
	}

}
