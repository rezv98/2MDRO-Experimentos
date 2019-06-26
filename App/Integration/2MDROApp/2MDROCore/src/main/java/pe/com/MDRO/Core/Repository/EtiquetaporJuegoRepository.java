package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import pe.com.MDRO.Core.Entity.EtiquetaporJuego;

public class EtiquetaporJuegoRepository implements Serializable,IEtiquetaporJuegoRepository{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmSingleton ef= EmSingleton.get_instance();
	private EntityManager em= ef.get_em();
	@Override
	public boolean crear(EtiquetaporJuego obj) {
		boolean flag = false;
		
		try {	
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
			flag=true;
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;	
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<EtiquetaporJuego> listar() {
		List<EtiquetaporJuego> listado = new ArrayList<EtiquetaporJuego>();
		
		try {
		
			TypedQuery<EtiquetaporJuego> tq = (TypedQuery<EtiquetaporJuego>) em.createQuery("Select a from EtiquetaporJuego a");
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return listado;
	}

	@Override
	public boolean eliminar(int id) {
		boolean flag = false;
		try {
			EtiquetaporJuego obj = this.buscarPorID(id);
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public EtiquetaporJuego buscarPorID(int id) {
		EtiquetaporJuego etiqueta = null;
		try {
			etiqueta = em.find(EtiquetaporJuego.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return etiqueta;
	}
	
	@Override
	public List<EtiquetaporJuego> buscarPorName(String name) {
		
		return null;
	}

	@Override
	public boolean actualizar(EtiquetaporJuego obj) {
		boolean flag = false;
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

}
