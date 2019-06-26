package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.com.MDRO.Core.Repository.ICategoriaRepository;
import pe.com.MDRO.Core.Entity.Categoria;

@Named
public class CategoriaRepository implements ICategoriaRepository,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="semana02")
	private EntityManager em;

	
	@Transactional
	@Override
	public boolean crear(Categoria obj) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		try {
			em.persist(obj);
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return flag;
	}

	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		List<Categoria> listado = new ArrayList<Categoria>();
		
		try {
			TypedQuery<Categoria> tq = 
					em.createQuery("Select a from Categoria a", Categoria.class);
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
			Categoria obj = em.find(Categoria.class, id);
			if(obj != null) {
				em.remove(obj);
				flag = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return flag;
	}

	@Override
	public Categoria buscarPorID(int id) {
		Categoria obj = null;
		try {
			obj = em.find(Categoria.class, id);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return obj;
	}

	@Transactional
	public boolean actualizar(Categoria obj) {
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
