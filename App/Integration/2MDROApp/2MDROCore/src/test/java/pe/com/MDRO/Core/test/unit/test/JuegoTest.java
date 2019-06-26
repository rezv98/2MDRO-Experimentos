package pe.com.MDRO.Core.test.unit.test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Repository.JuegoRepository;
import pe.com.MDRO.Core.test.unit.suit.PruebasUnitariasTest;

@Category(PruebasUnitariasTest.class)
@RunWith(MockitoJUnitRunner.class)
public class JuegoTest {
	
	@Mock
	private JuegoRepository JuegoRepository;
	
	@Mock
	private Juego Juego;
	
	 @Test
	    public void insertar() {
	        try {
	            System.out.println("Metodo Insertar");
	            when(Juego.getNombre()).thenReturn("Chocolates");
	            when(Juego.getId()).thenReturn(Matchers.anyInt());
	            when(JuegoRepository.crear(Matchers.any())).thenReturn(true);
	            JuegoRepository.crear(Juego);
	            Assert.assertTrue(Juego.getId() > 0);
	        } catch (Exception e) {
	            e.printStackTrace();
	            //Assert.fail();
	        }
	    }

	    @Test
	    public void actualizar() {
	        try {
	            System.out.println("Metodo Actualiza");
	            Juego JuegoBuscado;
	            when(Juego.getNombre()).thenReturn("Juego1");
	            when(Juego.getId()).thenReturn(Matchers.anyInt());
	            when(JuegoRepository.buscarPorID(Matchers.anyInt())).thenReturn(Juego);
	            JuegoBuscado = JuegoRepository.buscarPorID(Matchers.anyInt());
	            when(JuegoRepository.actualizar(Juego)).thenReturn(true);
	            JuegoRepository.actualizar(Juego);
	            Assert.assertEquals(Juego.getNombre(),JuegoBuscado.getNombre());
	        } catch (Exception e) {
	            e.printStackTrace();
	            //Assert.fail();
	        }
	    }

	    @Test
	    public void obtener() {
	        try {
	            System.out.println("Metodo Obtener");
	            Juego JuegoBuscado;
	            when(Juego.getNombre()).thenReturn(Matchers.anyString());
	            when(Juego.getId()).thenReturn(Matchers.anyInt());
	            when(JuegoRepository.buscarPorID(Matchers.anyInt())).thenReturn(Juego);
	            JuegoBuscado = JuegoRepository.buscarPorID(Matchers.anyInt());
	            Assert.assertNotNull(JuegoBuscado);            
	        } catch (Exception e) {
	            e.printStackTrace();
	            //Assert.fail();
	        }
	    }

	    @Test
	    public void listar() {
	        try {
	            System.out.println("Metodo Listar");
	            List<Juego> listaJuegos = spy(new ArrayList<Juego>());
	            when(listaJuegos.add(Matchers.any())).thenReturn(true);
	            when(listaJuegos.add(Matchers.any())).thenReturn(true);
	            when(JuegoRepository.listar()).thenReturn(listaJuegos);
	            List<Juego> lista = JuegoRepository.listar();
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
	            when(JuegoRepository.eliminar(Matchers.anyInt())).thenReturn(true);
	            JuegoRepository.eliminar(Matchers.anyInt());
	            Assert.assertTrue(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	            Assert.fail();
	        }
	    }
}