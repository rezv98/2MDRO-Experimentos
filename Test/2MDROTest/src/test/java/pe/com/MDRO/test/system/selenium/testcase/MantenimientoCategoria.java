package pe.com.MDRO.test.system.selenium.testcase;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pe.com.MDRO.test.system.selenium.page.crearPage;
import pe.com.MDRO.test.system.selenium.page.indexPage;





public class MantenimientoCategoria {

	private String urlInicial = "http://localhost:8080/2MDROApp/";
	private indexPage indexPage;
	private crearPage crearPage;
	
	@BeforeTest
	
	public void inicioClase() throws Exception {
		this.indexPage = new indexPage( this.urlInicial);
		this.crearPage = new crearPage(this.indexPage.getWebDriver());
	}
	
	
	@Test
	public void insertarCategoria_FlujoBasico() throws Exception {
		try {
			String valorEsperado = "Categoría creada";
			indexPage.ircrearCate();
			String valorObtenido = crearPage.insertar("Accion", "accion pura");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	/*@Test(dependsOnMethods = {"insertarCategoria_FlujoBasico"})
	public void insertarCategoria_FlujoAlternativo() throws Exception {
		try {
			String valorEsperado = "Descripcion: Error de validación: se necesita un valor.";

			String valorObtenido = crearPage.insertar("Aventura", "");
			Assert.assertEquals(valorObtenido, valorEsperado);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}*/
	
	@AfterTest
	public void tearDown() throws Exception {
		crearPage.cerrarPagina();
	}
	
}


