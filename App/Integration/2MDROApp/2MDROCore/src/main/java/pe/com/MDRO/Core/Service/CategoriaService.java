package pe.com.MDRO.Core.Service;

import java.io.Serializable;
import java.util.List;


import javax.inject.Named;

import pe.com.MDRO.Core.Repository.CategoriaRepository;
import pe.com.MDRO.Core.Repository.ICategoriaRepository;
import pe.com.MDRO.Core.Entity.Categoria;
import pe.com.MDRO.Core.Service.ICategoriaService;

@Named
public class CategoriaService implements ICategoriaService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ICategoriaRepository dao = new CategoriaRepository();
	
	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		//IEditorialRepository editorialRepository = new EditorialRepository();
		
		return dao.listar();
	}

	@Override
	public boolean crear(Categoria obj) {
		// TODO Auto-generated method stub
		return dao.crear(obj);
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return dao.eliminar(id);
	}

	@Override
	public Categoria buscarPorID(int id) {
		// TODO Auto-generated method stub
		return dao.buscarPorID(id);
	}

	@Override
	public boolean actualizar(Categoria obj) {
		// TODO Auto-generated method stub
		return dao.actualizar(obj);
	}

	@Override
	public List<Categoria> BuscarPorName(String name) {
		return dao.buscarPorName(name);

	}

	

}
