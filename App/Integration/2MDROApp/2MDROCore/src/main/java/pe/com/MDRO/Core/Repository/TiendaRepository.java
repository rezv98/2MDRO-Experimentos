package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import pe.com.MDRO.Core.Entity.Tienda;

public class TiendaRepository implements Serializable,ITiendaRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmSingleton ef= EmSingleton.get_instance();
	private EntityManager em= ef.get_em();
	@Override
	public boolean crear(Tienda obj) {
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
	public List<Tienda> listar() {
		List<Tienda> listado = new ArrayList<Tienda>();
		
		try {
		
			TypedQuery<Tienda> tq = (TypedQuery<Tienda>) em.createQuery("Select a from Tienda a");
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
			Tienda obj = this.buscarPorID(id);
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
	public Tienda buscarPorID(int id) {
		Tienda tienda = null;
		try {
			tienda = em.find(Tienda.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return tienda;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tienda> buscarPorName(String name) {
		List<Tienda> listado = new ArrayList<Tienda>();
		
		try {
			
			TypedQuery<Tienda> tq = 
					(TypedQuery<Tienda>) em.createQuery("Select a from Tienda a Where a.nombre= :name")
			.setParameter("name",name);
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return listado;
	}

	@Override
	public boolean actualizar(Tienda obj) {
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
