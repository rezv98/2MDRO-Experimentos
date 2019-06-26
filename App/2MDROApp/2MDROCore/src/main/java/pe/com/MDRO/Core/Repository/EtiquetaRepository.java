package pe.com.MDRO.Core.Repository;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.com.MDRO.Core.Repository.IEtiquetaRepository;
import pe.com.MDRO.Core.Entity.Etiqueta;

@Named
public class EtiquetaRepository implements IEtiquetaRepository,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="semana02")
	private EntityManager em;
	
	@Override
	@Transactional
	public boolean crear(Etiqueta obj) {
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
	public List<Etiqueta> listar() {
		List<Etiqueta> listado = new ArrayList<Etiqueta>();
		
		try {
			TypedQuery<Etiqueta> tq = 
					em.createQuery("select a from Etiqueta a",Etiqueta.class);
			listado = tq.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return listado;
	}

	@Override
	@Transactional
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			Etiqueta obj = this.buscarPorID(id);
			em.remove(obj);
			
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Etiqueta buscarPorID(int id) {
		// TODO Auto-generated method stub
		Etiqueta etiqueta = null;
		try {
			etiqueta = em.find(Etiqueta.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return etiqueta;
	}

	@Override
	@Transactional
	public boolean actualizar(Etiqueta obj) {
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
