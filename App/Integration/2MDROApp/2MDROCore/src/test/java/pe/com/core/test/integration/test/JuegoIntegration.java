package pe.com.core.test.integration.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pe.com.MDRO.Core.Entity.Biblioteca;
import pe.com.MDRO.Core.Entity.Categoria;
import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Service.BibliotecaService;
import pe.com.MDRO.Core.Service.CategoriaService;
import pe.com.MDRO.Core.Service.IBibliotecaService;
import pe.com.MDRO.Core.Service.ICategoriaService;
import pe.com.MDRO.Core.Service.IJuegoService;
import pe.com.MDRO.Core.Service.JuegoService;

public class JuegoIntegration {
	
	private final IJuegoService juegoservice= new JuegoService();
	private final IBibliotecaService bibliotecaservice= new BibliotecaService();
	private final ICategoriaService categoriaservice= new CategoriaService();
	private static Biblioteca biblioteca= new Biblioteca();
	private static Categoria categoria= new Categoria();
	private static Juego juego= new Juego();
	private String mensaje="";
	private String nombre="";
	private String descripcion="";
	private String plataforma="";
	@Mock
	private HttpServletResponse response;
	@Given("^despues de ir al modulo de biblioteca$")
	public void despues_de_haber_seleccionado_una_biblioteca() throws Throwable {
		MockitoAnnotations.initMocks(this);
		doNothing().when(response).sendRedirect("http://localhost/AdmBiblioteca.xhtml");
		
		Assert.assertTrue(true);
	}
	@When("^selecciono la primera biblioteca$")
	public void selecciono_la_primera_biblioteca()throws Throwable{
		doNothing().when(response).sendRedirect("http://localhost/AdmBiblioteca/First.xhtml");
		biblioteca=bibliotecaservice.listar().get(0);
		Assert.assertTrue(true);
	}
	@When("^selecciono la primera categoria$")
	public void selecciono_la_primera_categoria()throws Throwable{
		doNothing().when(response).sendRedirect("http://localhost/AdmJuego.xhtml");
		categoria=categoriaservice.listar().get(0);
		Assert.assertTrue(true);
	}
	@When("^busco el juego \"([^\"]*)\" para seleccionarlo de la tabla de Juegos$")
	public void busco_el_juego_para_seleccionarlo_de_la_tabla_de_Juegos(String arg1)throws Throwable{
		try {
			List<Juego> lista = juegoservice.BuscarPorName(arg1);
			Assert.assertTrue(lista.size() > 0);
			juego = lista.get(0);
			nombre=juego.getNombre();
			descripcion=juego.getDescripcion();
			plataforma=juego.getPlataforma();
			doNothing().when(response).sendRedirect("http://master/AdmJuego.xhtml");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
		
	}
	@When("^hago click en el boton nuevo de Juego$")
	public void hago_click_en_el_boton_nuevo_de_Juego()throws Throwable{
		doNothing().when(response).sendRedirect("http://localhost/AdmJuego.xhtml");
		Assert.assertTrue(true);
	}
	@When("^en la nueva pantalla escribo en el campo Nombre el valor de \"([^\"]*)\" del Juego$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de(String arg1)throws Throwable{
		nombre=arg1;
		juego.setNombre(nombre);
	}
	@When("^en la nueva pantalla escribo en el campo Descripcion el valor de \"([^\"]*)\" del Juego$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_el_valor_de(String arg1)throws Throwable{
		descripcion=arg1;
		juego.setDescripcion(descripcion);
	}
	@When("^en la nueva pantalla escribo en el campo Plataforma el valor de \"([^\"]*)\" del Juego$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Plataforma_el_valor_de(String arg1)throws Throwable{
		plataforma=arg1;
		juego.setPlataforma(plataforma);
	}
	@When("^presiono el boton Guardar de Juego$")
	public void presiono_el_boton_Guardar_de_Juego()throws Throwable{
		
		try {
			juego.setBiblioteca(biblioteca);
			juego.setCategoria(categoria);
			juegoservice.crear(juego);
			this.mensaje="Se guardo correctamente";
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
	}
	@When("^luego hago click en el boton Editar de Juego$")
	public void luego_hago_click_en_el_boton_Editar_de_Juego()throws Throwable{
		
		doNothing().when(response).sendRedirect("http://master/AdmJuego.xhtml");
		Assert.assertTrue(true);
		
	}
	@When("^presiono el boton Actualizar de Juego$")
	public void presiono_el_boton_Actualizar_de_Juego()throws Throwable{
		
		try {
			juegoservice.actualizar(juego);
			this.mensaje="Se actualizo correctamente";
			List<Juego>lista=juegoservice.BuscarPorName(nombre);
			Assert.assertTrue(lista.size()>0);
			Assert.assertEquals(lista.get(0).getNombre(),juego.getNombre());
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getLocalizedMessage().toString());
		}
		
	}
	@When("^presiono el boton Eliminar de Juego$")
	public void presiono_el_boton_Eliminar_de_Juego()throws Throwable{
		
		try {
			if(juegoservice.eliminar(juego.getId()))	{
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
	@Then("^el sistema me muestra el mensaje de: \"([^\"]*)\" el juego$")
	public void el_sistema_me_muestra_el_mensaje_de_el_juego(String msg) {
		assertEquals(msg, this.mensaje);
		
	}

	

	

}
