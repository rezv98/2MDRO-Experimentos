package pe.com.MDRO.Core.test.unit.cover;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;

import pe.com.MDRO.Core.Service.BibliotecaService;
import pe.com.MDRO.Core.test.coverture.suit.PruebasUnitariasTestCover;
import pe.com.MDRO.Core.Entity.Biblioteca;
import static org.junit.Assert.assertEquals;
@Category(PruebasUnitariasTestCover.class)
public class AddBiblioteca {

	
	BibliotecaService instance = new BibliotecaService();
	//camino 1
	@Test
	public void agregarBiblioCP1() {
		Biblioteca obj = new Biblioteca();
		obj.setNombre("Bib1");
		boolean resultado = instance.crear(obj);
		assertEquals(true, resultado);
	}
	//camino 2
	@Test
	public void agregarBiblioCP2() {
		Biblioteca obj = new Biblioteca();
		obj.setId(1);
		obj.setNombre("Bib2");
		boolean resultado = instance.crear(obj);
		assertEquals(false, resultado);
	}
	
	//camino 3
	@Test
	public void agregarBiblioCP3() {
		Biblioteca obj = new Biblioteca();
		boolean resultado = instance.crear(obj);
		assertEquals(false, resultado);
	}
	
	//camino 4
	@Test
	public void agregarBiblioCP4() {
		boolean resultado = instance.crear(null);
		assertEquals(false, resultado);
	}

}
