package pe.com.MDRO.Core.Service;

import java.io.Serializable;
import java.util.List;


import javax.inject.Named;

import pe.com.MDRO.Core.Repository.IJuegoRepository;
import pe.com.MDRO.Core.Repository.JuegoRepository;
import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Service.IJuegoService;

@Named
public class JuegoService implements IJuegoService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	IJuegoRepository dao= new JuegoRepository();

	@Override
	public boolean crear(Juego obj) {
		
		return dao.crear(obj);
	}

	@Override
	public List<Juego> listar() {

		return dao.listar();
	}

	@Override
	public boolean eliminar(int id) {

		
		return dao.eliminar(id);
	}

	@Override
	public Juego buscarPorID(int id) {
		return dao.buscarPorID(id);
	}

	@Override
	public boolean actualizar(Juego obj) {
		return dao.actualizar(obj);
	}

	@Override
	public List<Juego> BuscarPorName(String name) {
		// TODO Auto-generated method stub
		 return dao.buscarPorName(name);
	}

}
