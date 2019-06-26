package pe.com.MDRO.Core.Service;

import java.util.List;

import pe.com.MDRO.Core.Entity.Categoria;

public interface ICategoriaService {
	
	public List<Categoria> listar();
	
	public boolean crear(Categoria obj);
	
	public boolean eliminar(int id);
	
	public Categoria buscarPorID(int id);
	
	public boolean actualizar(Categoria obj);
}
