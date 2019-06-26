package pe.com.MDRO.Core.test.unit.cover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;

import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Service.JuegoService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class UpdateJuego {
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
	public void actualizarJuegoCP1() {
		Juego obj = new Juego();
		obj.setId(1);
		obj.setNombre("Jue1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void actualizarJuegoCP2() {
		Juego obj = new Juego();
		obj.setId(5);
		obj.setNombre("Jue1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 3
	@Test
	public void actualizarJuegoCP3() {
		Juego obj = new Juego();
		obj.setId(-5);
		obj.setNombre("Jue1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 4
	@Test
	public void actualizarJuegoCP4() {
		Juego obj = new Juego();
		obj.setId(0);
		obj.setNombre("Jue1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 5
	@Test
	public void actualizarJuegoCP5() {
		Juego obj = new Juego();
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	
	//camino 6
	@Test
	public void actualizarJuegoCP6() {
		Juego obj = new Juego();
		obj.setId(1);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 7
	@Test
	public void actualizarJuegoCP7() {
		Juego obj = new Juego();
		obj.setId(-1);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 8
	@Test
	public void actualizarJuegoCP8() {
		Juego obj = new Juego();
		obj.setId(0);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 9
	@Test
	public void actualizarJuegoCP9() {
		Juego obj = new Juego();
		obj.setId(10);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 10
	@Test
	public void actualizarJuegoCP10() {

		boolean resultado = instance.actualizar(null);
		assertEquals(false, resultado);
	}
}
