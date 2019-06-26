package pe.com.MDRO.Core.test.unit.cover;
import org.junit.Test;
import org.junit.experimental.categories.Category;


import pe.com.MDRO.Core.Service.CategoriaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
import pe.com.MDRO.Core.Entity.Categoria;
import static org.junit.Assert.assertEquals;
@Category(PruebasUnitariasTestCover.class)
public class AddCategoria {

	
	CategoriaService instance = new CategoriaService();
	//camino 1
	@Test
	public void agregarCategoriaCP1() {
		Categoria obj = new Categoria();
		obj.setNombre("Cat1");
		boolean resultado = instance.crear(obj);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void agregarCategoriaCP2() {
		Categoria obj = new Categoria();
		obj.setId(1);
		obj.setNombre("Cat2");
		boolean resultado = instance.crear(obj);
		assertEquals(false, resultado);
	}
	
	//camino 3
	@Test
	public void agregarCategoriaCP3() {
		Categoria obj = new Categoria();
		boolean resultado = instance.crear(obj);
		assertEquals(false, resultado);
	}
	
	//camino 4
	@Test
	public void agregarCategoriaCP4() {
		boolean resultado = instance.crear(null);
		assertEquals(false, resultado);
	}

}
