package pe.com.MDRO.Controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;

import pe.com.MDRO.Core.Entity.Etiqueta;
import pe.com.MDRO.Core.Entity.EtiquetaporJuego;
import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Service.EtiquetaService;
import pe.com.MDRO.Core.Service.EtiquetaporJuegoService;
import pe.com.MDRO.Core.Service.JuegoService;

@Named
@ViewScoped
public class EtiquetaporJuegoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	EtiquetaService serviceEtiqueta;
	
	JuegoService serviceJuego;
	
	EtiquetaporJuegoService serviceEtiquetaporJuego;
	
	private Etiqueta etiqueta;
	private Juego juego;
	private EtiquetaporJuego etiquetaporjuego;
	
	private List<EtiquetaporJuego>etiquetaporjuegos;
	private List<Juego>juegos;
	private List<Etiqueta>etiquetas;
	
	@PostConstruct
	public void init() {
		juego = new Juego();
		this.juegos = serviceJuego.listar();
		this.etiquetaporjuegos = serviceEtiquetaporJuego.listar();
		this.etiquetas = serviceEtiqueta.listar();
		etiqueta=new Etiqueta();
		etiquetaporjuego=new EtiquetaporJuego();
	}
	public void onRowEdit(RowEditEvent event) {        
		etiquetaporjuego = (EtiquetaporJuego)event.getObject();
        boolean flag = serviceEtiquetaporJuego.actualizar(etiquetaporjuego);
        if(flag) {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Etiqueta en el juego editada", "Ahora puede editar otra Etiqueta");
        }else {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
        }
    }
     
    public void onRowCancel(RowEditEvent event) {
    	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Edición cancelada", "Ahora puede editar otra Etiqueta en el juego");
    }
    public void eliminar(int ID) {
		try {
			boolean flag = serviceEtiquetaporJuego.eliminar(ID);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Etiqueta en el Juego eliminada", "");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}
    

	public void resetar() {
		etiquetaporjuego = new EtiquetaporJuego();
	}
	
	public void guardar() { 
		try {
			boolean flag = serviceEtiquetaporJuego.crear(etiquetaporjuego);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Etiqueta en el Juego creada", "Ahora puede crear otra Etiqueta entiqueta en el Juego");
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
	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}
	public Juego getJuego() {
		return juego;
	}
	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	public EtiquetaporJuego getEtiquetaporjuego() {
		return etiquetaporjuego;
	}
	public void setEtiquetaporjuego(EtiquetaporJuego etiquetaporjuego) {
		this.etiquetaporjuego = etiquetaporjuego;
	}
	public List<EtiquetaporJuego> getEtiquetaporjuegos() {
		return etiquetaporjuegos;
	}
	public void setEtiquetaporjuegos(List<EtiquetaporJuego> etiquetaporjuegos) {
		this.etiquetaporjuegos = etiquetaporjuegos;
	}
	public List<Juego> getJuegos() {
		return juegos;
	}
	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}
	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}
	public void setEtiquetas(List<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}

}
