package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import pe.com.MDRO.Core.Entity.Etiqueta;

public class EtiquetaRepository implements Serializable,IEtiquetaRepository{

	private EmSingleton ef= EmSingleton.get_instance();
	private EntityManager em= ef.get_em();
	private static final long serialVersionUID = 1L;

	@Override
	public boolean crear(Etiqueta obj) {
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
	public List<Etiqueta> listar() {
		List<Etiqueta> listado = new ArrayList<Etiqueta>();
		
		try {
		
			TypedQuery<Etiqueta> tq = (TypedQuery<Etiqueta>) em.createQuery("Select a from Etiqueta a");
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
			Etiqueta obj = this.buscarPorID(id);
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
	public Etiqueta buscarPorID(int id) {
		Etiqueta etiqueta = null;
		try {
			etiqueta = em.find(Etiqueta.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return etiqueta;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Etiqueta> buscarPorName(String name) {
		List<Etiqueta> listado = new ArrayList<Etiqueta>();
		
		try {
			
			TypedQuery<Etiqueta> tq = 
					(TypedQuery<Etiqueta>) em.createQuery("Select a from Etiqueta a Where a.nombre= :name")
			.setParameter("name",name);
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return listado;
	}

	@Override
	public boolean actualizar(Etiqueta obj) {
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
