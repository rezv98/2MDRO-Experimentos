package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import pe.com.MDRO.Core.Entity.Venta;

public class VentaRepository implements Serializable,IVentaRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EmSingleton ef= EmSingleton.get_instance();
	private EntityManager em= ef.get_em();

	@Override
	public boolean crear(Venta obj) {
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
	public List<Venta> listar() {
		List<Venta> listado = new ArrayList<Venta>();
		
		try {
		
			TypedQuery<Venta> tq = (TypedQuery<Venta>) em.createQuery("Select a from Venta a");
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
			Venta obj = this.buscarPorID(id);
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
	public Venta buscarPorID(int id) {
		Venta venta = null;
		try {
			venta = em.find(Venta.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return venta;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Venta> buscarPorName(String name) {
		List<Venta> listado = new ArrayList<Venta>();
		
		try {
			
			TypedQuery<Venta> tq = 
					(TypedQuery<Venta>) em.createQuery("Select a from Venta a Where a.nombre= :name")
			.setParameter("name",name);
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return listado;
	}

	@Override
	public boolean actualizar(Venta obj) {
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
