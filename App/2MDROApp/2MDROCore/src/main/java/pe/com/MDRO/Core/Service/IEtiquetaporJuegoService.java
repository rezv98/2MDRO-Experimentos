package pe.com.MDRO.Core.Service;

import java.util.List;

import pe.com.MDRO.Core.Entity.EtiquetaporJuego;

public interface IEtiquetaporJuegoService {
	public List<EtiquetaporJuego> listar();
	
	public boolean crear(EtiquetaporJuego obj);
	
	public boolean eliminar(int id);
	
	public EtiquetaporJuego buscarPorID(int id);
	
	public boolean actualizar(EtiquetaporJuego obj);
}
