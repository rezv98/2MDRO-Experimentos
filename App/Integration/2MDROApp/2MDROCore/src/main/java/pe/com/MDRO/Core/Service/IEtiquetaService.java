package pe.com.MDRO.Core.Service;

import java.util.List;

import pe.com.MDRO.Core.Entity.Etiqueta;


public interface IEtiquetaService {
	
	public List<Etiqueta> listar();
	
	public boolean crear(Etiqueta obj);
	
	public boolean eliminar(int id);
	
	public Etiqueta buscarPorID(int id);
	
	public List<Etiqueta> BuscarPorName(String name);
	
	public boolean actualizar(Etiqueta obj);
}
