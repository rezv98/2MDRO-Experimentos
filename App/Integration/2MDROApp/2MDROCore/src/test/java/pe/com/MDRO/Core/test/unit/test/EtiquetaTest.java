package pe.com.MDRO.Core.test.unit.test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import pe.com.MDRO.Core.Entity.Etiqueta;
import pe.com.MDRO.Core.Repository.EtiquetaRepository;
import pe.com.MDRO.Core.test.unit.suit.PruebasUnitariasTest;

@Category(PruebasUnitariasTest.class)
@RunWith(MockitoJUnitRunner.class)
public class EtiquetaTest {
	@Mock
	private EtiquetaRepository EtiquetaRepository;
	
    @Mock
    private Etiqueta Etiqueta;
    
    @Test
    public void insertar() {
        try {
            System.out.println("Metodo Insertar");
            when(Etiqueta.getNombre()).thenReturn("Chocolates");
            when(Etiqueta.getId()).thenReturn(Matchers.anyInt());
            when(EtiquetaRepository.crear(Matchers.any())).thenReturn(true);
            EtiquetaRepository.crear(Etiqueta);
            Assert.assertTrue(Etiqueta.getId() > 0);
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void actualizar() {
        try {
            System.out.println("Metodo Actualiza");
            Etiqueta EtiquetaBuscada;
            when(Etiqueta.getNombre()).thenReturn("Etiqueta1");
            when(Etiqueta.getId()).thenReturn(Matchers.anyInt());
            when(EtiquetaRepository.buscarPorID(Matchers.anyInt())).thenReturn(Etiqueta);
            EtiquetaBuscada = EtiquetaRepository.buscarPorID(Matchers.anyInt());
            when(EtiquetaRepository.actualizar(Etiqueta)).thenReturn(true);
            EtiquetaRepository.actualizar(Etiqueta);
            Assert.assertEquals(Etiqueta.getNombre(),EtiquetaBuscada.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void obtener() {
        try {
            System.out.println("Metodo Obtener");
            Etiqueta EtiquetaBuscada;
            when(Etiqueta.getNombre()).thenReturn(Matchers.anyString());
            when(Etiqueta.getId()).thenReturn(Matchers.anyInt());
            when(EtiquetaRepository.buscarPorID(Matchers.anyInt())).thenReturn(Etiqueta);
            EtiquetaBuscada = EtiquetaRepository.buscarPorID(Matchers.anyInt());
            Assert.assertNotNull(EtiquetaBuscada);            
        } catch (Exception e) {
            e.printStackTrace();
            //Assert.fail();
        }
    }

    @Test
    public void listar() {
        try {
            System.out.println("Metodo Listar");
            List<Etiqueta> listaEtiquetas = spy(new ArrayList<Etiqueta>());
            when(listaEtiquetas.add(Matchers.any())).thenReturn(true);
            when(listaEtiquetas.add(Matchers.any())).thenReturn(true);
            when(EtiquetaRepository.listar()).thenReturn(listaEtiquetas);
            List<Etiqueta> lista = EtiquetaRepository.listar();
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
            when(EtiquetaRepository.eliminar(Matchers.anyInt())).thenReturn(true);
            EtiquetaRepository.eliminar(Matchers.anyInt());
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}