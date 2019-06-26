package pe.com.MDRO.Core.test.unit.cover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;

import pe.com.MDRO.Core.Entity.Categoria;
import pe.com.MDRO.Core.Service.CategoriaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
@Category(PruebasUnitariasTestCover.class)
public class UpdateCategoria {
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
	public void actualizarCategoriaCP1() {
		Categoria obj = new Categoria();
		obj.setId(1);
		obj.setNombre("Cat1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void actualizarCategoriaCP2() {
		Categoria obj = new Categoria();
		obj.setId(5);
		obj.setNombre("Cat1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 3
	@Test
	public void actualizarCategoriaCP3() {
		Categoria obj = new Categoria();
		obj.setId(-5);
		obj.setNombre("Cat1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 4
	@Test
	public void actualizarCategoriaCP4() {
		Categoria obj = new Categoria();
		obj.setId(0);
		obj.setNombre("Cat1new");
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 5
	@Test
	public void actualizarCategoriaCP5() {
		Categoria obj = new Categoria();
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	
	//camino 6
	@Test
	public void actualizarCategoriaCP6() {
		Categoria obj = new Categoria();
		obj.setId(1);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 7
	@Test
	public void actualizarCategoriaCP7() {
		Categoria obj = new Categoria();
		obj.setId(-1);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 8
	@Test
	public void actualizarCategoriaCP8() {
		Categoria obj = new Categoria();
		obj.setId(0);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 9
	@Test
	public void actualizarCategoriaCP9() {
		Categoria obj = new Categoria();
		obj.setId(10);
		boolean resultado = instance.actualizar(obj);
		assertEquals(false, resultado);
	}
	//camino 10
	@Test
	public void actualizarCategoriaCP10() {

		boolean resultado = instance.actualizar(null);
		assertEquals(false, resultado);
	}
}
