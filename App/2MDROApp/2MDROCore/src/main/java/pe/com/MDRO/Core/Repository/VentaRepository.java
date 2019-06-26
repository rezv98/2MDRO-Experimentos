package pe.com.MDRO.Core.Repository;

import java.io.Serializable;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.com.MDRO.Core.Repository.IVentaRepository;
import pe.com.MDRO.Core.Entity.Venta;


@Named
public class VentaRepository implements IVentaRepository,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="semana02")
	private EntityManager em;
	
	@Transactional
	@Override
	public boolean crear(Venta obj) {
		boolean flag = false;
		
		try {			
			em.persist(obj);
			flag=true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public List<Venta> listar() {
		List<Venta> listado = new ArrayList<Venta>();
		
		try {
			TypedQuery<Venta> tq = 
					em.createQuery("select a from Venta a",Venta.class);
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return listado;
	}

	@Transactional
	@Override
	public boolean eliminar(int id) {
		boolean flag = false;
		try {
			Venta obj = this.buscarPorID(id);
			em.remove(obj);
			
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

	@Transactional
	@Override
	public boolean actualizar(Venta obj) {
		boolean flag = false;
		try {
			em.merge(obj);
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

}
