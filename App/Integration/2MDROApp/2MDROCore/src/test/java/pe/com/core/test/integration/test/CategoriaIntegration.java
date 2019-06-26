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
import pe.com.MDRO.Core.Entity.Categoria;
import pe.com.MDRO.Core.Service.CategoriaService;
import pe.com.MDRO.Core.Service.ICategoriaService;

public class CategoriaIntegration {
private final ICategoriaService categoriaservice= new CategoriaService();
	private static Categoria categoria= new Categoria();
	private String mensaje="";
	private String nombre="";
	private String descripcion="";
	@Mock
	private HttpServletResponse response;
	
	
	@When("^hago click en el enlace de Mantenimiento de Categoria$")
	public void hago_click_en_el_enlace_de_Mantenimiento_de_Categoria() throws Throwable {
		MockitoAnnotations.initMocks(this);
		doNothing().when(response).sendRedirect("http://localhost/AdmCategoria.xhtml");
		Assert.assertTrue(true);
	}
	@When("^busco la categoria \"([^\"]*)\" para seleccionarlo de la tabla de Categorias$")
	public void busco_la_categoria_para_seleccionarlo_de_la_tabla_de_Categoria(String arg1) throws Throwable {
		try {
			List<Categoria> lista = categoriaservice.BuscarPorName(arg1);
			Assert.assertTrue(lista.size() > 0);
			categoria = lista.get(0);
			nombre=categoria.getNombre();
			doNothing().when(response).sendRedirect("http://master/AdmCategoria.xhtml");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}

	}
	@When("^luego hago click en el boton Editar de Categoria$")
	public void luego_hago_click_en_el_boton_Editar_de_Categoria()throws Throwable{
		
		doNothing().when(response).sendRedirect("http://master/editarAdmCategoria.xhtml");
		Assert.assertTrue(true);
		
	}
	@When("^hago click en el boton nuevo de Categoria$")
	public void hago_click_en_el_boton_nuevo_de_Categoria()throws Throwable{
		doNothing().when(response).sendRedirect("http://master/registrarAdmCategoria.xhtml");
		Assert.assertTrue(true);
	}
	@When("^en la nueva pantalla escribo en el campo Nombre el valor de \"([^\"]*)\" de la categoria$" )
	public void en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de_la_categoria(String arg1)throws Throwable{
			nombre=arg1;
			categoria.setNombre(nombre);
		
		
	}
	@When("^en la nueva pantalla escribo en el campo Descripcion el valor de \"([^\"]*)\" de la categoria$" )
	public void en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_el_valor_de_la_categoria(String arg1)throws Throwable{
			descripcion=arg1;
			categoria.setDescripcion(descripcion);
		
		
	}
	@When("^presiono el boton de Guardar de Categoria$")
	public void presiono_el_boton_de_Guarda_de_Categoriar()throws Throwable{
		
		try {
			categoriaservice.crear(categoria);
			this.mensaje="Se guardo correctamente";
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
		
	}
	@When("^presiono el boton de Actualizar de Categoria$")
	public void presiono_el_boton_de_Actualizar_de_Categoria()throws Throwable{
		
		try {
			categoriaservice.actualizar(categoria);
			this.mensaje="Se actualizo correctamente";
			List<Categoria>lista=categoriaservice.BuscarPorName(nombre);
			Assert.assertTrue(lista.size()>0);
			Assert.assertEquals(lista.get(0).getNombre(),categoria.getNombre());
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getLocalizedMessage().toString());
		}
		
	}
	@When("^presiono el boton de Eliminar de Categoria$")
	public void presiono_el_boton_de_Eliminar_de_Categoria()throws Throwable{
		
		try {
			if(categoriaservice.eliminar(categoria.getId()))	{
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
	@Then("^el sistema me muestra el mensaje de: \"([^\"]*)\" la categoria$")
	public void el_sistema_me_muestra_el_mensaje_de_(String msg) {
		assertEquals(msg, this.mensaje);
		
	}

	
}
