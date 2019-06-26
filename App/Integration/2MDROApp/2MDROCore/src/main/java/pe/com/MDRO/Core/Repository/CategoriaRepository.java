package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import pe.com.MDRO.Core.Entity.Categoria;



public class CategoriaRepository implements Serializable,ICategoriaRepository {
	private static final long serialVersionUID = 1L;
	private EmSingleton ef= EmSingleton.get_instance();
	private EntityManager em= ef.get_em();
	
	@Override
	public boolean crear(Categoria obj) {
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
	public List<Categoria> listar() {
		List<Categoria> listado = new ArrayList<Categoria>();
		
		try {
		
			TypedQuery<Categoria> tq = (TypedQuery<Categoria>) em.createQuery("Select a from Categoria a");
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
			Categoria obj = this.buscarPorID(id);
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
	public Categoria buscarPorID(int id) {
		Categoria categoria = null;
		try {
			categoria = em.find(Categoria.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return categoria;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> buscarPorName(String name) {
		List<Categoria> listado = new ArrayList<Categoria>();
		
		try {
			
			TypedQuery<Categoria> tq = 
					(TypedQuery<Categoria>) em.createQuery("Select a from Categoria a Where a.nombre= :name")
			.setParameter("name",name);
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return listado;
	}
	@Override
	public boolean actualizar(Categoria obj) {
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
