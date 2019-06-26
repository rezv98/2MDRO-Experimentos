package pe.com.MDRO.Controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;

import pe.com.MDRO.Core.Entity.Categoria;
import pe.com.MDRO.Core.Service.ICategoriaService;

@Named
@ViewScoped
public class CategoriaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	ICategoriaService serviceCategoria;
	
	List<Categoria> categorias;
	Categoria categoria;
	
	@PostConstruct
	public void init() {
		categoria = new Categoria();
		this.listado();
	}
	
	public void listado() {
		this.categorias = serviceCategoria.listar();
	}
	
	public void onRowEdit(RowEditEvent event) {        
        categoria = (Categoria)event.getObject();
        boolean flag = serviceCategoria.actualizar(categoria);
        if(flag) {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Categoria editada", "Ahora puede editar otra categoria");
        }else {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
        }
    }
     
    public void onRowCancel(RowEditEvent event) {
    	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Edición cancelada", "Ahora puede editar otra categoría");
    }

    public void eliminar(int ID) {
		try {
			boolean flag = serviceCategoria.eliminar(ID);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Categoría eliminada", "");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}
    

	public void resetar() {
		categoria = new Categoria();
	}
	
	public void guardar() { 
		try {
			boolean flag = serviceCategoria.crear(categoria);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Categoría creada", "Ahora puede crear otra categoría");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
	        this.resetar();
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}

	public void agregarMensaje(Severity nivel, String mensaje, String detalle) {
        FacesMessage message = new FacesMessage(nivel, mensaje, detalle);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
}
