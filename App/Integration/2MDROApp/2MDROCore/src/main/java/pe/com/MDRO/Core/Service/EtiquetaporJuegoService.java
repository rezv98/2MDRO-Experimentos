package pe.com.MDRO.Core.Service;

import java.io.Serializable;
import java.util.List;


import javax.inject.Named;

import pe.com.MDRO.Core.Repository.EtiquetaporJuegoRepository;
import pe.com.MDRO.Core.Repository.IEtiquetaporJuegoRepository;
import pe.com.MDRO.Core.Entity.EtiquetaporJuego;
import pe.com.MDRO.Core.Service.IEtiquetaporJuegoService;

@Named
public class EtiquetaporJuegoService implements IEtiquetaporJuegoService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	IEtiquetaporJuegoRepository dao= new EtiquetaporJuegoRepository();
	@Override
	public List<EtiquetaporJuego> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public boolean crear(EtiquetaporJuego obj) {
		// TODO Auto-generated method stub
		return dao.crear(obj);
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return dao.eliminar(id);
	}

	@Override
	public EtiquetaporJuego buscarPorID(int id) {
		// TODO Auto-generated method stub
		return dao.buscarPorID(id);
	}

	@Override
	public boolean actualizar(EtiquetaporJuego obj) {
		// TODO Auto-generated method stub
		return dao.actualizar(obj);
	}

}
