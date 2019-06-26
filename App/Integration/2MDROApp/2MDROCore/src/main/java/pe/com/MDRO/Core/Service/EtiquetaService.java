package pe.com.MDRO.Core.Service;

import java.io.Serializable;
import java.util.List;


import pe.com.MDRO.Core.Repository.EtiquetaRepository;
import pe.com.MDRO.Core.Repository.IEtiquetaRepository;
import pe.com.MDRO.Core.Entity.Etiqueta;
import pe.com.MDRO.Core.Service.IEtiquetaService;

public class EtiquetaService implements IEtiquetaService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	IEtiquetaRepository dao= new EtiquetaRepository();

	@Override
	public List<Etiqueta> listar() {
		return dao.listar();
	
	}

	@Override
	public boolean crear(Etiqueta obj) {
		// TODO Auto-generated method stub
		return dao.crear(obj);
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return dao.eliminar(id);
	}

	@Override
	public Etiqueta buscarPorID(int id) {
		// TODO Auto-generated method stub
		return dao.buscarPorID(id);
	}

	@Override
	public boolean actualizar(Etiqueta obj) {
		// TODO Auto-generated method stub
		return dao.actualizar(obj);
	}

	@Override
	public List<Etiqueta> BuscarPorName(String name) {
		// TODO Auto-generated method stub
		return dao.buscarPorName(name);
	}



	

}
