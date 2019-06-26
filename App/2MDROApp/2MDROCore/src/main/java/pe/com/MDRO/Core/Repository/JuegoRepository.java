package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.com.MDRO.Core.Repository.IJuegoRepository;
import pe.com.MDRO.Core.Entity.Juego;

@Named
public class JuegoRepository implements IJuegoRepository, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="semana02")
	private EntityManager em;
	
	@Override
	@Transactional
	public boolean crear(Juego obj) {
		// TODO Auto-generated method stub
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
	public List<Juego> listar() {
		List<Juego> listado = new ArrayList<Juego>();
		
		try {
			TypedQuery<Juego> tq = 
					em.createQuery("select a from Libro a", Juego.class);
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
			Juego obj = this.buscarPorID(id);
			em.remove(obj);
			
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return flag;
	}

	@Override
	public Juego buscarPorID(int id) {
		// TODO Auto-generated method stub
		Juego juego = null;
		try {
			juego = em.find(Juego.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return juego;
	}

	@Override
	@Transactional
	public boolean actualizar(Juego obj) {
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
