package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.com.MDRO.Core.Repository.ITiendaRepository;
import pe.com.MDRO.Core.Entity.Tienda;

@Named
public class TiendaRepository implements ITiendaRepository,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="semana02")
	private EntityManager em;
	@Transactional
	@Override
	public boolean crear(Tienda obj) {
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
	public List<Tienda> listar() {
		List<Tienda> listado = new ArrayList<Tienda>();
		
		try {
			TypedQuery<Tienda> tq = 
					em.createQuery("select a from Tienda a",Tienda.class);
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
			Tienda obj = this.buscarPorID(id);
			em.remove(obj);
			
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
	
	@Transactional
	@Override
	public boolean actualizar(Tienda obj) {
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
