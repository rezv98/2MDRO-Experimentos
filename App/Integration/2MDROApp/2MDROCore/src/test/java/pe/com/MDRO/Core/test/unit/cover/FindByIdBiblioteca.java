package pe.com.MDRO.Core.test.unit.cover;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;

import pe.com.MDRO.Core.Entity.Biblioteca;
import pe.com.MDRO.Core.Service.BibliotecaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class FindByIdBiblioteca {
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
	public void buscarporidBiblioCP1() {
		Biblioteca resultado = instance.buscarPorID(1);
		Assert.assertNotNull(resultado);
	}
	//camino 2
	@Test
	public void buscarporidBiblioCP2() {
		//negative
		Biblioteca resultado = instance.buscarPorID(-5);
		Assert.assertNull(resultado);
	}
	//camino 3
	@Test
	public void buscarporidBiblioCP3() {
		//out of range
		Biblioteca resultado = instance.buscarPorID(10);
		Assert.assertNull(resultado);
	}
	//camino 4
	@Test
	public void buscarporidBiblioCP4() {
		//cero
		Biblioteca resultado = instance.buscarPorID(0);
		Assert.assertNull(resultado);
	}
}
