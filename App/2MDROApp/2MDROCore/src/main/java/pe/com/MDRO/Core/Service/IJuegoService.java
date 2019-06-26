package pe.com.MDRO.Core.Service;

import java.util.List;

import pe.com.MDRO.Core.Entity.Juego;

public interface IJuegoService {

public List<Juego> listar();
	
	public boolean crear(Juego obj);
	
	public boolean eliminar(int id);
	
	public Juego buscarPorID(int id);
	
	public boolean actualizar(Juego obj);
}
