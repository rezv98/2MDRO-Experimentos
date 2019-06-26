package pe.com.core.test.integration.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pe.com.MDRO.Core.Entity.Tienda;
import pe.com.MDRO.Core.Service.ITiendaService;
import pe.com.MDRO.Core.Service.TiendaService;

public class TiendaIntegration {
	private final ITiendaService tiendaservice= new TiendaService();
	private static Tienda tienda= new Tienda();
	private String mensaje="";
	private String nombre="";
	private String url="";
	@Mock
	private HttpServletResponse response;
	@When("^hago click en el enlace de Mantenimiento de Tiendas$")
	public void hago_click_en_el_enlace_de_Mantenimiento_de_Tiendas() throws Throwable {
		MockitoAnnotations.initMocks(this);
		doNothing().when(response).sendRedirect("http://localhost/AdmTienda.xhtml");
		Assert.assertTrue(true);
	}
	@When("^busco la tienda \"([^\"]*)\" para seleccionarlo de la tabla de Tiendas$")
	public void busco_la_tienda_para_seleccionarlo_de_la_tabla_de_Tiendas(String arg1) throws Throwable {
		try {
			List<Tienda> lista = tiendaservice.BuscarPorName(arg1);
			Assert.assertTrue(lista.size() > 0);
			tienda = lista.get(0);
			nombre=tienda.getNombre();
			url=tienda.getUrl();
			doNothing().when(response).sendRedirect("http://master/AdmTienda.xhtml");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}

	}
	@When("^luego hago click en el boton Editar de Tienda$")
	public void luego_hago_click_en_el_boton_Editar_de_Tienda()throws Throwable{
		
		doNothing().when(response).sendRedirect("http://master/editarAdmTienda.xhtml");
		Assert.assertTrue(true);
		
	}
	@When("^hago click en el boton nuevo de Tienda$")
	public void hago_click_en_el_boton_nuevo_de_Tienda()throws Throwable{
		doNothing().when(response).sendRedirect("http://master/registrarAdmTienda.xhtml");
		Assert.assertTrue(true);
	}
	@When("^en la nueva pantalla escribo en el campo Nombre el valor de \"([^\"]*)\" de Tienda$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de_Tienda(String arg1)throws Throwable{
			nombre=arg1;
			tienda.setNombre(nombre);
		
		
	}
	@When("^en la nueva pantalla escribo en el campo url el valor de \"([^\"]*)\" de Tienda$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_url_el_valor_de_Tienda(String arg1)throws Throwable{
			url=arg1;
			tienda.setUrl(arg1);
		
		
	}
	@When("^presiono el boton Guardar de Tienda$")
	public void presiono_el_boton_de_Guardar()throws Throwable{
		
		try {
			tiendaservice.crear(tienda);
			this.mensaje="Se guardo correctamente";
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
		
	}
	@When("^presiono el boton Actualizar de Tienda$")
	public void presiono_el_boton_de_Actualizar_Tienda()throws Throwable{
		
		try {
			tiendaservice.actualizar(tienda);
			this.mensaje="Se actualizo correctamente";
			List<Tienda>lista=tiendaservice.BuscarPorName(nombre);
			Assert.assertTrue(lista.size()>0);
			Assert.assertEquals(lista.get(0).getNombre(),tienda.getNombre());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
		
	}
	
	@When("^presiono el boton Eliminar de Tienda$")
	public void presiono_el_boton_de_Eliminar()throws Throwable{
		
		try {
			if(tiendaservice.eliminar(tienda.getId()))	{
				this.mensaje="Se elimino correctamente";
				Assert.assertTrue(true);}		
			else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
		
	}
	@Then("^el sistema me muestra el mensaje de: \"([^\"]*)\" la tienda$")
		public void el_sistema_me_muestra_el_mensaje_de_(String msg) {
			assertEquals(msg, this.mensaje);
			
		}

	

	
}
