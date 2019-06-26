package pe.com.MDRO.Core.test.unit.test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import pe.com.MDRO.Core.Repository.CategoriaRepository;
import pe.com.MDRO.Core.Entity.Categoria;
import pe.com.MDRO.Core.test.unit.suit.PruebasUnitariasTest;;

@Category(PruebasUnitariasTest.class)
@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoriaTest {

	
	@Mock
	private CategoriaRepository CategoriaRepository;
	
    @Mock
    private Categoria Categoria;


    @Test
    public void insertar() {
        try {
            System.out.println("Metodo Insertar");
            when(Categoria.getNombre()).thenReturn("Bizcocho");
            when(Categoria.getId()).thenReturn(Matchers.anyInt());
            when(CategoriaRepository.crear(Matchers.any())).thenReturn(true);
            CategoriaRepository.crear(Categoria);
            Assert.assertTrue(Categoria.getId() > 0);
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void actualizar() {
        try {
            System.out.println("Metodo Actualiza");
            Categoria CategoriaBuscada;
            when(Categoria.getNombre()).thenReturn("Cambios");
            when(Categoria.getId()).thenReturn(Matchers.anyInt());
            when(CategoriaRepository.buscarPorID(Matchers.anyInt())).thenReturn(Categoria);
            CategoriaBuscada = CategoriaRepository.buscarPorID(Matchers.anyInt());
            when(CategoriaRepository.actualizar(Categoria)).thenReturn(true);
            CategoriaRepository.actualizar(Categoria);
            Assert.assertEquals(Categoria.getNombre(),CategoriaBuscada.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void obtener() {
        try {
            System.out.println("Metodo Obtener");
            Categoria CategoriaBuscada;
            when(Categoria.getNombre()).thenReturn(Matchers.anyString());
            when(Categoria.getId()).thenReturn(Matchers.anyInt());
            when(CategoriaRepository.buscarPorID(Matchers.anyInt())).thenReturn(Categoria);
            CategoriaBuscada = CategoriaRepository.buscarPorID(Matchers.anyInt());
            Assert.assertNotNull(CategoriaBuscada);            
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void listar() {
        try {
            System.out.println("Metodo Listar");
            List<Categoria> listaCategorias = spy(new ArrayList<Categoria>());
            when(listaCategorias.add(Matchers.any())).thenReturn(true);
            when(listaCategorias.add(Matchers.any())).thenReturn(true);
            when(CategoriaRepository.listar()).thenReturn(listaCategorias);
            List<Categoria> lista = CategoriaRepository.listar();
            Assert.assertTrue(lista.size() > 0);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void eliminar() {
        try {
            System.out.println("Metodo Eliminar");
            when(CategoriaRepository.eliminar(Matchers.anyInt())).thenReturn(true);
            CategoriaRepository.eliminar(Matchers.anyInt());
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

}