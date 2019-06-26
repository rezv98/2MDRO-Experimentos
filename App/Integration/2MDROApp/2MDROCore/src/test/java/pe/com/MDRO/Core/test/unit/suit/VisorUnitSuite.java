package pe.com.MDRO.Core.test.unit.suit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import pe.com.MDRO.Core.test.unit.test.BibliotecaTest;
import pe.com.MDRO.Core.test.unit.test.CategoriaTest;
import pe.com.MDRO.Core.test.unit.test.EtiquetaTest;
import pe.com.MDRO.Core.test.unit.test.JuegoTest;
import pe.com.MDRO.Core.test.unit.test.TiendaTest;
@RunWith(Categories.class)
@IncludeCategory(PruebasUnitariasTest.class)
@SuiteClasses( { BibliotecaTest.class,CategoriaTest.class, EtiquetaTest.class,JuegoTest.class, TiendaTest.class})
public class VisorUnitSuite {

}
