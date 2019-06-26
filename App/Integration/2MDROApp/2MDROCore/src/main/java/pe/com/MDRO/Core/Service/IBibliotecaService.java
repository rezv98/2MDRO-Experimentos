package pe.com.MDRO.Core.Service;

import java.util.List;

import pe.com.MDRO.Core.Entity.Biblioteca;

public interface IBibliotecaService {
	
	public List<Biblioteca> listar();
	
	public boolean crear(Biblioteca obj);
	
	public boolean eliminar(int id);
	
	public Biblioteca buscarPorID(int id);
	
	public List<Biblioteca> buscarPorNombre(String nombre);
	
	public boolean actualizar(Biblioteca obj);
}
