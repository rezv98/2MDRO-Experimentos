package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import pe.com.MDRO.Core.Entity.Biblioteca;

public class BibliotecaRepository implements IBibliotecaRepository,Serializable {

	
	private static final long serialVersionUID = 1L;
	private EmSingleton ef= EmSingleton.get_instance();
	private EntityManager em= ef.get_em();
	
	@Override
	public boolean crear(Biblioteca obj) {
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
	public List<Biblioteca> listar() {
			List<Biblioteca> listado = new ArrayList<Biblioteca>();
		
		try {
		
			TypedQuery<Biblioteca> tq = (TypedQuery<Biblioteca>) em.createQuery("Select a from Biblioteca a");
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
			Biblioteca obj = this.buscarPorID(id);
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
	public Biblioteca buscarPorID(int id) {
		Biblioteca biblioteca = null;
		try {
			biblioteca = em.find(Biblioteca.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return biblioteca;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Biblioteca> buscarPorName(String name) {
List<Biblioteca> listado = new ArrayList<Biblioteca>();
		
		try {
			
			TypedQuery<Biblioteca> tq = 
					(TypedQuery<Biblioteca>) em.createQuery("Select a from Biblioteca a Where a.nombre= :name")
			.setParameter("name",name);
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return listado;
	}

	@Override
	public boolean actualizar(Biblioteca obj) {
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
