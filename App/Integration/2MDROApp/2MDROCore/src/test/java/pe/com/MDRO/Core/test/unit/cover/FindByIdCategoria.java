package pe.com.MDRO.Core.test.unit.cover;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;

import pe.com.MDRO.Core.Entity.Categoria;
import pe.com.MDRO.Core.Service.CategoriaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class FindByIdCategoria {
	CategoriaService instance = new CategoriaService();
	@Before
	public void BeforeMethod()
	{
		//autoset id 1
		Categoria obj = new Categoria();
		obj.setNombre("Cat1");
		//autoset id 2
		Categoria obj2 = new Categoria();
		obj2.setNombre("Cat2");
		//autoset id 3
		Categoria obj3 = new Categoria();
		obj3.setNombre("Cat3");
		instance.crear(obj);
		instance.crear(obj2);
		instance.crear(obj3);
	}
	//camino 1
	@Test
	public void buscarporidCategoriaCP1() {
		Categoria resultado = instance.buscarPorID(1);
		Assert.assertNotNull(resultado);
	}
	//camino 2
	@Test
	public void buscarporidCategoriaCP2() {
		//negative
		Categoria resultado = instance.buscarPorID(-5);
		Assert.assertNull(resultado);
	}
	//camino 3
	@Test
	public void buscarporidCategoriaCP3() {
		//out of range
		Categoria resultado = instance.buscarPorID(10);
		Assert.assertNull(resultado);
	}
	//camino 4
	@Test
	public void buscarporidCategoriaCP4() {
		//cero
		Categoria resultado = instance.buscarPorID(0);
		Assert.assertNull(resultado);
	}
}
