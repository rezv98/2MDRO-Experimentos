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

import pe.com.MDRO.Core.Service.IBibliotecaService;
import pe.com.MDRO.Core.Entity.Biblioteca;

@Named
@ViewScoped
public class BibliotecaController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	IBibliotecaService serviceBiblioteca;
	
	private List<Biblioteca> bibliotecas;
	private Biblioteca biblioteca;
	
	@PostConstruct
	public void init() {
		biblioteca = new Biblioteca();
		this.listado();
	}
	
	public void listado() {
		this.bibliotecas = serviceBiblioteca.listar();
	}
	
	public void onRowEdit(RowEditEvent event) {        
        biblioteca = (Biblioteca)event.getObject();
        boolean flag = serviceBiblioteca.actualizar(biblioteca);
        if(flag) {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Biblioteca editada", "Ahora puede editar otra Biblioteca");
        }else {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
        }
    }
     
    public void onRowCancel(RowEditEvent event) {
    	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Edición cancelada", "Ahora puede editar otra biblioteca");
    }

    public void eliminar(int ID) {
		try {
			boolean flag = serviceBiblioteca.eliminar(ID);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Biblioteca eliminada", "");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}
    

	public void resetar() {
		biblioteca = new Biblioteca();
	}
	
	public void guardar() { 
		try {
			boolean flag = serviceBiblioteca.crear(biblioteca);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Biblioteca creada", "Ahora puede crear otra biblioteca");
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

	

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca Biblioteca) {
		this.biblioteca = Biblioteca;
	}

	public List<Biblioteca> getBibliotecas() {
		return bibliotecas;
	}

	public void setBibliotecas(List<Biblioteca> Bibliotecas) {
		this.bibliotecas = Bibliotecas;
	}
	
}
