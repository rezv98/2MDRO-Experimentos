package pe.com.MDRO.Core.test.coverture.suit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import pe.com.MDRO.Core.test.unit.cover.*;
@RunWith(Categories.class)
@IncludeCategory(PruebasUnitariasTestCover.class)
@SuiteClasses( {AddBiblioteca.class,AddCategoria.class,AddJuego.class,DeleteCategoria.class,DeleteBiblioteca.class,DeleteJuego.class,
	FindByIdBiblioteca.class,FindByIdCategoria.class,FindByIdJuego.class,ListBiblioteca.class,ListCategoria.class,ListJuego.class,
	UpdateBiblioteca.class,UpdateCategoria.class,UpdateJuego.class})
public class UnitSuiteCover {

}
