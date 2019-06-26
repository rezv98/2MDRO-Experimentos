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

import pe.com.MDRO.Core.Entity.Etiqueta;
import pe.com.MDRO.Core.Service.IEtiquetaService;

@Named
@ViewScoped
public class EtiquetaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	IEtiquetaService serviceEtiqueta;
	
	List<Etiqueta> etiquetas;
	Etiqueta etiqueta;
	

	@PostConstruct
	public void init() {
		etiqueta = new Etiqueta();
		this.listado();
	}
	
	public void listado() {
		this.etiquetas = serviceEtiqueta.listar();
	}
	
	public void onRowEdit(RowEditEvent event) {        
        etiqueta = (Etiqueta)event.getObject();
        boolean flag = serviceEtiqueta.actualizar(etiqueta);
        if(flag) {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Etiqueta editada", "Ahora puede editar otra Etiqueta");
        }else {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
        }
    }
     
    public void onRowCancel(RowEditEvent event) {
    	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Edición cancelada", "Ahora puede editar otra Etiqueta");
    }

    public void eliminar(int ID) {
		try {
			boolean flag = serviceEtiqueta.eliminar(ID);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Etiqueta eliminada", "");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}
    

	public void resetar() {
		etiqueta = new Etiqueta();
	}
	
	public void guardar() { 
		try {
			boolean flag = serviceEtiqueta.crear(etiqueta);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Etiqueta creada", "Ahora puede crear otra Etiqueta");
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

	

	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta Etiqueta) {
		this.etiqueta = Etiqueta;
	}

	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(List<Etiqueta> Etiquetas) {
		this.etiquetas = Etiquetas;
	}

}
