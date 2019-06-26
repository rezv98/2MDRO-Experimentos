package pe.com.MDRO.Core.Service;

import java.util.List;

import pe.com.MDRO.Core.Entity.Tienda;

public interface ITiendaService {
public List<Tienda> listar();
	
	public boolean crear(Tienda obj);
	
	public boolean eliminar(int id);
	
	public Tienda buscarPorID(int id);
	
	public List<Tienda>BuscarPorName(String name);
	
	public boolean actualizar(Tienda obj);

}
