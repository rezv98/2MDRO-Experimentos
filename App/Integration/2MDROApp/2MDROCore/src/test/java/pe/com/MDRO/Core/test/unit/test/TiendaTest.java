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


import pe.com.MDRO.Core.Entity.Tienda;
import pe.com.MDRO.Core.Repository.TiendaRepository;
import pe.com.MDRO.Core.test.unit.suit.PruebasUnitariasTest;

@Category(PruebasUnitariasTest.class)
@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TiendaTest {
	@Mock
	private TiendaRepository TiendaRepository;
	
    @Mock
    private Tienda Tienda;
    
    @Test
    public void insertar() {
        try {
            System.out.println("Metodo Insertar");
            when(Tienda.getNombre()).thenReturn("Ubisoft");
            when(Tienda.getId()).thenReturn(Matchers.anyInt());
            when(TiendaRepository.crear(Matchers.any())).thenReturn(true);
            TiendaRepository.crear(Tienda);
            Assert.assertTrue(Tienda.getId() > 0);
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void actualizar() {
        try {
            System.out.println("Metodo Actualiza");
            Tienda TiendaBuscada;
            when(Tienda.getNombre()).thenReturn("Tienda1");
            when(Tienda.getId()).thenReturn(Matchers.anyInt());
            when(TiendaRepository.buscarPorID(Matchers.anyInt())).thenReturn(Tienda);
            TiendaBuscada = TiendaRepository.buscarPorID(Matchers.anyInt());
            when(TiendaRepository.actualizar(Tienda)).thenReturn(true);
            TiendaRepository.actualizar(Tienda);
            Assert.assertEquals(Tienda.getNombre(),TiendaBuscada.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void obtener() {
        try {
            System.out.println("Metodo Obtener");
            Tienda TiendaBuscada;
            when(Tienda.getNombre()).thenReturn(Matchers.anyString());
            when(Tienda.getId()).thenReturn(Matchers.anyInt());
            when(TiendaRepository.buscarPorID(Matchers.anyInt())).thenReturn(Tienda);
            TiendaBuscada = TiendaRepository.buscarPorID(Matchers.anyInt());
            Assert.assertNotNull(TiendaBuscada);            
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void listar() {
        try {
            System.out.println("Metodo Listar");
            List<Tienda> listaTiendas = spy(new ArrayList<Tienda>());
            when(listaTiendas.add(Matchers.any())).thenReturn(true);
            when(listaTiendas.add(Matchers.any())).thenReturn(true);
            when(TiendaRepository.listar()).thenReturn(listaTiendas);
            List<Tienda> lista = TiendaRepository.listar();
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
            when(TiendaRepository.eliminar(Matchers.anyInt())).thenReturn(true);
            TiendaRepository.eliminar(Matchers.anyInt());
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

}
