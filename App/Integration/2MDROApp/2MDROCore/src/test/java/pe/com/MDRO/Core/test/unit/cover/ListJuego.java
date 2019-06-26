package pe.com.MDRO.Core.test.unit.cover;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;
import java.util.List;

import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Service.JuegoService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class ListJuego {
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
	public void listarJuegoCP1() {

		List<Juego> list=instance.listar();
		Assert.assertNotNull(list);
	}
}
