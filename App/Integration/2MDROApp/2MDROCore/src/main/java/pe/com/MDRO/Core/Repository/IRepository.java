package pe.com.MDRO.Core.Repository;

import java.util.List;

public interface IRepository<T> {

	public boolean crear(T obj);
	
	public List<T> listar();
	
	public boolean eliminar(int id);
	
	public T buscarPorID(int id);
	
	public List<T> buscarPorName(String name);
	
	public boolean actualizar(T obj);
	
}
