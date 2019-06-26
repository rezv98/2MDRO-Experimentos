package pe.com.MDRO.Core.Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.com.MDRO.Core.Repository.ITiendaRepository;
import pe.com.MDRO.Core.Repository.TiendaRepository;
import pe.com.MDRO.Core.Entity.Tienda;
import pe.com.MDRO.Core.Service.ITiendaService;

public class TiendaService implements ITiendaService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	ITiendaRepository dao= new TiendaRepository();

	@Override
	public List<Tienda> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public boolean crear(Tienda obj) {
		// TODO Auto-generated method stub
		return dao.crear(obj);
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return dao.eliminar(id);
	}

	@Override
	public Tienda buscarPorID(int id) {
		// TODO Auto-generated method stub
		return dao.buscarPorID(id);
	}

	@Override
	public boolean actualizar(Tienda obj) {
		// TODO Auto-generated method stub
		return dao.actualizar(obj);
	}

	@Override
	public List<Tienda> BuscarPorName(String name) {
		// TODO Auto-generated method stub
		 return dao.buscarPorName(name);
	}

	

}
