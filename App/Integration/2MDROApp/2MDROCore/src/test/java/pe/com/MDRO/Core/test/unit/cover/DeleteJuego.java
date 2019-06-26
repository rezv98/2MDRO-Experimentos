package pe.com.MDRO.Core.test.unit.cover;

import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Service.JuegoService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class DeleteJuego {
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
	public void eliminarJuegoCP1() {
		boolean resultado = instance.eliminar(1);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void eliminarJuegoCP2() {
		//out of range
		boolean resultado = instance.eliminar(100);
		assertEquals(false, resultado);
	}
	//camino 3
	@Test
	public void eliminarJuegoCP3() {
		//negative
		boolean resultado = instance.eliminar(-5);
		assertEquals(false, resultado);
	}
	//camino 4
	@Test
	public void eliminarJuegoCP4() {
		//negative
		boolean resultado = instance.eliminar(0);
		assertEquals(false, resultado);
	}
}
