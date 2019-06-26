package pe.com.MDRO.Core.Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.com.MDRO.Core.Repository.IBibliotecaRepository;
import pe.com.MDRO.Core.Entity.Biblioteca;
import pe.com.MDRO.Core.Service.IBibliotecaService;

public class BibliotecaService implements IBibliotecaService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	IBibliotecaRepository dao;
	@Override
	public List<Biblioteca> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public boolean crear(Biblioteca obj) {
		// TODO Auto-generated method stub
		return dao.crear(obj);
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return dao.eliminar(id);
	}

	@Override
	public Biblioteca buscarPorID(int id) {
		// TODO Auto-generated method stub
		return dao.buscarPorID(id);
	}

	@Override
	public boolean actualizar(Biblioteca obj) {
		// TODO Auto-generated method stub
		return dao.actualizar(obj);
	}

}
