package pe.com.MDRO.Core.test.unit.cover;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;

import pe.com.MDRO.Core.Service.JuegoService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
import pe.com.MDRO.Core.Entity.Juego;
import static org.junit.Assert.assertEquals;
@Category(PruebasUnitariasTestCover.class)
public class AddJuego {

	
	JuegoService instance = new JuegoService();
	//camino 1
	@Test
	public void agregarJuegoCP1() {
		Juego obj = new Juego();
		obj.setNombre("Jue1");
		boolean resultado = instance.crear(obj);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void agregarJuegoCP2() {
		Juego obj = new Juego();
		obj.setId(1);
		obj.setNombre("Jue2");
		boolean resultado = instance.crear(obj);
		assertEquals(false, resultado);
	}
	
	
	//camino 3
	@Test
	public void agregarJuegoCP3() {
		Juego obj = new Juego();
		boolean resultado = instance.crear(obj);
		assertEquals(false, resultado);
	}
	
	//camino 4
	@Test
	public void agregarJuegoCP4() {
		boolean resultado = instance.crear(null);
		assertEquals(false, resultado);
	}

}
