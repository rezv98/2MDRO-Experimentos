package pe.com.MDRO.Core.Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.com.MDRO.Core.Repository.IVentaRepository;
import pe.com.MDRO.Core.Entity.Venta;
import pe.com.MDRO.Core.Service.IVentaService;

public class VentaService implements IVentaService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject IVentaRepository dao;
	@Override
	public List<Venta> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public boolean crear(Venta obj) {
		// TODO Auto-generated method stub
		return dao.crear(obj);
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return dao.eliminar(id);
	}

	@Override
	public Venta buscarPorID(int id) {
		// TODO Auto-generated method stub
		return dao.buscarPorID(id);
	}

	@Override
	public boolean actualizar(Venta obj) {
		// TODO Auto-generated method stub
		return dao.actualizar(obj);
	}

}
