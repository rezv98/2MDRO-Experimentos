package pe.com.MDRO.Core.Service;

import java.util.List;

import pe.com.MDRO.Core.Entity.Venta;

public interface IVentaService {
	
	public List<Venta> listar();
	
	public boolean crear(Venta obj);
	
	public boolean eliminar(int id);
	
	public Venta buscarPorID(int id);
	
	public boolean actualizar(Venta obj);

}
