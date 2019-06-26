package pe.com.MDRO.Core.test.unit.cover;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;
import java.util.List;

import pe.com.MDRO.Core.Entity.Biblioteca;
import pe.com.MDRO.Core.Service.BibliotecaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class ListBiblioteca {
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
	public void listarBiblioCP1() {

		List<Biblioteca> list=instance.listar();
		Assert.assertNotNull(list);
	}
}
