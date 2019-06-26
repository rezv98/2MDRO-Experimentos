package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.com.MDRO.Core.Repository.IBibliotecaRepository;
import pe.com.MDRO.Core.Entity.Biblioteca;

@Named
public class BibliotecaRepository implements IBibliotecaRepository,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="semana02")
	private EntityManager em;
	
	@Transactional
	@Override
	public boolean crear(Biblioteca obj) {
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
	public List<Biblioteca> listar() {
		List<Biblioteca> listado = new ArrayList<Biblioteca>();
		
		try {
			TypedQuery<Biblioteca> tq = 
					em.createQuery("Select a from Biblioteca a",Biblioteca.class);
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
			Biblioteca obj = this.buscarPorID(id);
			em.remove(obj);
			
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

	@Transactional
	@Override
	public boolean actualizar(Biblioteca obj) {
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
