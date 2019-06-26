package pe.com.MDRO.Core.test.unit.cover;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;

import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Service.JuegoService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class FindByIdJuego {
	JuegoService instance = new JuegoService();
	@Before
	public void BeforeMethod()
	{
		//autoset id 1
		Juego obj = new Juego();
		obj.setNombre("Jue1");
		//autoset id 2
		Juego obj2 = new Juego();
		obj2.setNombre("Jue2");
		//autoset id 3
		Juego obj3 = new Juego();
		obj3.setNombre("Jue3");
		instance.crear(obj);
		instance.crear(obj2);
		instance.crear(obj3);
	}
	//camino 1
	@Test
	public void buscarporidJuegoCP1() {
		Juego resultado = instance.buscarPorID(1);
		Assert.assertNotNull(resultado);
	}
	//camino 2
	@Test
	public void buscarporidJuegoCP2() {
		//negative
		Juego resultado = instance.buscarPorID(-5);
		Assert.assertNull(resultado);
	}
	//camino 3
	@Test
	public void buscarporidJuegoCP3() {
		//out of range
		Juego resultado = instance.buscarPorID(10);
		Assert.assertNull(resultado);
	}
	//camino 4
	@Test
	public void buscarporidJuegoCP4() {
		//cero
		Juego resultado = instance.buscarPorID(0);
		Assert.assertNull(resultado);
	}
}
