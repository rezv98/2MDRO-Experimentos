package pe.com.MDRO.Core.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.com.MDRO.Core.Repository.IEtiquetaporJuegoRepository;
import pe.com.MDRO.Core.Entity.EtiquetaporJuego;


@Named
public class EtiquetaporJuegoRepository implements IEtiquetaporJuegoRepository, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="semana02")
	private EntityManager em;
	
	@Override
	@Transactional
	public boolean crear(EtiquetaporJuego obj) {
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
	public List<EtiquetaporJuego> listar() {
		List<EtiquetaporJuego> listado = new ArrayList<EtiquetaporJuego>();
		
		try {
			TypedQuery<EtiquetaporJuego> tq = 
					em.createQuery("select a from EtiquetaporJuego a", EtiquetaporJuego.class);
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
			EtiquetaporJuego obj = this.buscarPorID(id);
			em.remove(obj);
			
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return flag;
	}

	@Override
	public EtiquetaporJuego buscarPorID(int id) {
		// TODO Auto-generated method stub
		EtiquetaporJuego etiquetaporjuego = null;
		try {
			etiquetaporjuego = em.find(EtiquetaporJuego.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return etiquetaporjuego;
	}

	@Override
	@Transactional
	public boolean actualizar(EtiquetaporJuego obj) {
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
