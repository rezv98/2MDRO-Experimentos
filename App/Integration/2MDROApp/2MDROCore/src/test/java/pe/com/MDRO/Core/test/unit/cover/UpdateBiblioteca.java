package pe.com.MDRO.Core.test.unit.cover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;

import pe.com.MDRO.Core.Entity.Biblioteca;
import pe.com.MDRO.Core.Service.BibliotecaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class UpdateBiblioteca {
	BibliotecaService instance = new BibliotecaService();
	@Before
	public void BeforeMethod()
	{
		//autoset id 1
		Biblioteca obj = new Biblioteca();
		obj.setNombre("Bib1");
		//autoset id 2
		Biblioteca obj2 = new Biblioteca();
		obj2.setNombre("Bib2");
		//autoset id 3
		Biblioteca obj3 = new Biblioteca();
		obj3.setNombre("Bib3");
		instance.crear(obj);
		instance.crear(obj2);
		instance.crear(obj3);
	}
	//camino 1
	@Test
	public void actualizarBiblioCP1() {
		Biblioteca obj = new Biblioteca();
		obj.setId(1);
		obj.setNombre("Bib1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void actualizarBiblioCP2() {
		Biblioteca obj = new Biblioteca();
		obj.setId(5);
		obj.setNombre("Bib1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 3
	@Test
	public void actualizarBiblioCP3() {
		Biblioteca obj = new Biblioteca();
		obj.setId(-5);
		obj.setNombre("Bib1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 4
	@Test
	public void actualizarBiblioCP4() {
		Biblioteca obj = new Biblioteca();
		obj.setId(0);
		obj.setNombre("Bib1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 5
	@Test
	public void actualizarBiblioCP5() {
		Biblioteca obj = new Biblioteca();
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	
	//camino 6
	@Test
	public void actualizarBiblioCP6() {
		Biblioteca obj = new Biblioteca();
		obj.setId(1);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 7
	@Test
	public void actualizarBiblioCP7() {
		Biblioteca obj = new Biblioteca();
		obj.setId(-1);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 8
	@Test
	public void actualizarBiblioCP8() {
		Biblioteca obj = new Biblioteca();
		obj.setId(0);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 9
	@Test
	public void actualizarBiblioCP9() {
		Biblioteca obj = new Biblioteca();
		obj.setId(10);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 10
	@Test
	public void actualizarBiblioCP10() {

		boolean resultado = instance.actualizar(null);
		assertEquals(false, resultado);
	}
}
