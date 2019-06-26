package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import pe.com.MDRO.Core.Entity.Juego;

public class JuegoRepository implements IJuegoRepository,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmSingleton ef= EmSingleton.get_instance();
	private EntityManager em= ef.get_em();
	@Override
	public boolean crear(Juego obj) {
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
	public List<Juego> listar() {
		List<Juego> listado = new ArrayList<Juego>();
		
		try {
		
			TypedQuery<Juego> tq = (TypedQuery<Juego>) em.createQuery("Select a from Juego a");
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
			Juego obj = this.buscarPorID(id);
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
	public Juego buscarPorID(int id) {
		Juego juego = null;
		try {
			juego = em.find(Juego.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return juego;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Juego> buscarPorName(String name) {
		List<Juego> listado = new ArrayList<Juego>();
		
		try {
			
			TypedQuery<Juego> tq = 
					(TypedQuery<Juego>) em.createQuery("Select a from Juego a Where a.nombre= :name")
			.setParameter("name",name);
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return listado;
	}

	@Override
	public boolean actualizar(Juego obj) {
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
