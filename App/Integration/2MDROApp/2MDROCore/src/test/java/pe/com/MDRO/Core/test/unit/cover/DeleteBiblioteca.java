package pe.com.MDRO.Core.test.unit.cover;

import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import pe.com.MDRO.Core.Entity.Biblioteca;
import pe.com.MDRO.Core.Service.BibliotecaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class DeleteBiblioteca {
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
	public void eliminarBiblioCP1() {
		boolean resultado = instance.eliminar(1);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void eliminarBiblioCP2() {
		//out of range
		boolean resultado = instance.eliminar(100);
		assertEquals(false, resultado);
	}
	//camino 3
	@Test
	public void eliminarBiblioCP3() {
		//negative
		boolean resultado = instance.eliminar(-5);
		assertEquals(false, resultado);
	}
	//camino 4
	@Test
	public void eliminarBiblioCP4() {
		//negative
		boolean resultado = instance.eliminar(0);
		assertEquals(false, resultado);
	}
}
