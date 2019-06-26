package pe.com.core.test.integration.test;

public class EtiquetaIntegration {
	/*
	private final IJuegoService juegoservice= new JuegoService();
	private final IEtiquetaService etiquetaservice= new EtiquetaService();
	private final IEtiquetaporJuegoService etiqueta_juego= new EtiquetaporJuegoService(); 
	private static Juego juego= new juego();
	private static Etiqueta etiqueta= new Etiqueta();
	private static EtiquetaporJuego= new EtiquetaporJuego();
	private String mensaje="";
	private String nombre="";
	@Mock
	private HttpServletResponse response;
	@Given("^despues de iniciar sesion en la aplicacion$")
	public void despues_de_iniciar_sesion_en_la_aplicacion() throws Throwable {
		MockitoAnnotations.initMocks(this);
		doNothing().when(response).sendRedirect("http://localhost/Adm2MDROWeb");
		Assert.assertTrue(true);
	}
	@When("^hago click en el enlace de Mantenimiento de Biblioteca$")
	public void hago_click_en_el_enlace_de_Mantenimiento_de_Biblioteca() throws Throwable {
		doNothing().when(response).sendRedirect("http://localhost/AdmBiblioteca.xhtml");
		Assert.assertTrue(true);
	}
	@When("^busco el juego \"([^\"]*)\" para seleccionarlo de la tabla de Biblioteca$")
	public void busco_el_juego_para_seleccionarlo_de_la_tabla_de_Juegos(String arg1) throws Throwable {
		try {
			List<Biblioteca> lista = bibliotecaservice.buscarPorNombre(arg1);
			Assert.assertTrue(lista.size() > 0);
			biblioteca = lista.get(0);
			doNothing().when(response).sendRedirect("http://master/AdmBiblioteca.xhtml");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}

	}
	@When("^luego hago click en el boton Editar$")
	public void luego_hago_click_en_el_boton_Editar()throws Throwable{
		
		doNothing().when(response).sendRedirect("http://master/editarAdmBiblioteca.xhtml");
		Assert.assertTrue(true);
		
	}
	@When("^hago click en el boton nuevo$")
	public void hago_click_en_el_boton_nuevo()throws Throwable{
		doNothing().when(response).sendRedirect("http://master/registrarAdmCategoria.xhtml");
		Assert.assertTrue(true);
	}
	@When("^en la nueva pantalla escribo en el campo Nombre el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de(String arg1)throws Throwable{
			nombre=arg1;
			biblioteca.setNombre(nombre);
		
		
	}
	@When("^presiono el boton de Guardar$")
	public void presiono_el_boton_de_Guardar()throws Throwable{
		
		try {
			bibliotecaservice.crear(biblioteca);
			this.mensaje="Se guardo correctamente la Biblioteca";
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
		
	}
	@When("^presiono el boton de Actualizar$")
	public void presiono_el_boton_de_Actualizar()throws Throwable{
		
		try {
			bibliotecaservice.actualizar(biblioteca);
			this.mensaje="Se actualizo correctamente la Biblioteca";
			List<Biblioteca>lista=bibliotecaservice.buscarPorNombre(nombre);
			Assert.assertTrue(lista.size() > 0);
			Assert.assertEquals(lista.get(0).getNombre().toUpperCase(), 			biblioteca.getNombre().toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
		
	}
	@When("^presiono el boton de Eliminar$")
	public void presiono_el_boton_de_Eliminar()throws Throwable{
		
		try {
			if(bibliotecaservice.eliminar(biblioteca.getId()))	{
				this.mensaje="Se elimino correctamente la Biblioteca";
				Assert.assertTrue(true);}		
			else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
		
	}
*/
}
