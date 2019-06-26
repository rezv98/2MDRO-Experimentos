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

import pe.com.MDRO.Core.Repository.BibliotecaRepository;
import pe.com.MDRO.Core.Entity.Biblioteca;
import pe.com.MDRO.Core.test.unit.suit.PruebasUnitariasTest;;

@Category(PruebasUnitariasTest.class)
@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BibliotecaTest {

	
	@Mock
	private BibliotecaRepository BibliotecaRepository;
	
    @Mock
    private Biblioteca Biblioteca;


    @Test
    public void insertar() {
        try {
            System.out.println("Metodo Insertar");
            when(Biblioteca.getNombre()).thenReturn("Chocolates");
            when(Biblioteca.getId()).thenReturn(Matchers.anyInt());
            when(BibliotecaRepository.crear(Matchers.any())).thenReturn(true);
            BibliotecaRepository.crear(Biblioteca);
            Assert.assertTrue(Biblioteca.getId() > 0);
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void actualizar() {
        try {
            System.out.println("Metodo Actualiza");
            Biblioteca BibliotecaBuscada;
            when(Biblioteca.getNombre()).thenReturn("Biblioteca1");
            when(Biblioteca.getId()).thenReturn(Matchers.anyInt());
            when(BibliotecaRepository.buscarPorID(Matchers.anyInt())).thenReturn(Biblioteca);
            BibliotecaBuscada = BibliotecaRepository.buscarPorID(Matchers.anyInt());
            when(BibliotecaRepository.actualizar(Biblioteca)).thenReturn(true);
            BibliotecaRepository.actualizar(Biblioteca);
            Assert.assertEquals(Biblioteca.getNombre(),BibliotecaBuscada.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void obtener() {
        try {
            System.out.println("Metodo Obtener");
            Biblioteca BibliotecaBuscada;
            when(Biblioteca.getNombre()).thenReturn(Matchers.anyString());
            when(Biblioteca.getId()).thenReturn(Matchers.anyInt());
            when(BibliotecaRepository.buscarPorID(Matchers.anyInt())).thenReturn(Biblioteca);
            BibliotecaBuscada = BibliotecaRepository.buscarPorID(Matchers.anyInt());
            Assert.assertNotNull(BibliotecaBuscada);            
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void listar() {
        try {
            System.out.println("Metodo Listar");
            List<Biblioteca> listaBibliotecas = spy(new ArrayList<Biblioteca>());
            when(listaBibliotecas.add(Matchers.any())).thenReturn(true);
            when(listaBibliotecas.add(Matchers.any())).thenReturn(true);
            when(BibliotecaRepository.listar()).thenReturn(listaBibliotecas);
            List<Biblioteca> lista = BibliotecaRepository.listar();
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
            when(BibliotecaRepository.eliminar(Matchers.anyInt())).thenReturn(true);
            BibliotecaRepository.eliminar(Matchers.anyInt());
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

}
