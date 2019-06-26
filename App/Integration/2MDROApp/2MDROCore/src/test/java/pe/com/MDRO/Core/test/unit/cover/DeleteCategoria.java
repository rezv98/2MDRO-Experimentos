package pe.com.MDRO.Core.test.unit.cover;

import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import pe.com.MDRO.Core.Entity.Categoria;
import pe.com.MDRO.Core.Service.CategoriaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class DeleteCategoria {
	CategoriaService instance;
	
	@Before
	public void BeforeMethod()
	{
		 instance= new CategoriaService();
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
	public void eliminarCategoriaCP1() {
		boolean resultado = instance.eliminar(1);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void eliminarCategoriaCP2() {
		//out of range
		boolean resultado = instance.eliminar(100);
		assertEquals(false, resultado);
	}
	//camino 3
	@Test
	public void eliminarCategoriaCP3() {
		//negative
		boolean resultado = instance.eliminar(-5);
		assertEquals(false, resultado);
	}
	//camino 4
	@Test
	public void eliminarCategoriaCP4() {
		//negative
		boolean resultado = instance.eliminar(0);
		assertEquals(false, resultado);
	}
}
