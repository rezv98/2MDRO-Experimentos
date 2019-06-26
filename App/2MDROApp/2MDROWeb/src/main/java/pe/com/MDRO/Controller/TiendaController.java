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

import pe.com.MDRO.Core.Entity.Tienda;
import pe.com.MDRO.Core.Service.ITiendaService;

@Named
@ViewScoped
public class TiendaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	ITiendaService serviceTienda;
	
	List<Tienda> tiendas;
	Tienda tienda;
	

	@PostConstruct
	public void init() {
		tienda = new Tienda();
		this.listado();
	}
	
	public void listado() {
		this.tiendas = serviceTienda.listar();
	}
	
	public void onRowEdit(RowEditEvent event) {        
        tienda = (Tienda)event.getObject();
        boolean flag = serviceTienda.actualizar(tienda);
        if(flag) {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Tienda editada", "Ahora puede editar otra Tienda");
        }else {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
        }
    }
     
    public void onRowCancel(RowEditEvent event) {
    	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Edición cancelada", "Ahora puede editar otra Tienda");
    }

    public void eliminar(int ID) {
		try {
			boolean flag = serviceTienda.eliminar(ID);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Tienda eliminada", "");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}
    

	public void resetar() {
		tienda = new Tienda();
	}
	
	public void guardar() { 
		try {
			boolean flag = serviceTienda.crear(tienda);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Tienda creada", "Ahora puede editar otra Tienda");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}

	public void agregarMensaje(Severity nivel, String mensaje, String detalle) {
        FacesMessage message = new FacesMessage(nivel, mensaje, detalle);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda Tienda) {
		this.tienda = Tienda;
	}

	public List<Tienda> getTiendas() {
		return tiendas;
	}

	public void setTiendas(List<Tienda> Tiendas) {
		this.tiendas = Tiendas;
	}


}
