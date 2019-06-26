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
import pe.com.MDRO.Core.Service.ICategoriaService;
import pe.com.MDRO.Core.Service.IJuegoService;
import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Entity.Biblioteca;
import pe.com.MDRO.Core.Entity.Categoria;

@Named
@ViewScoped
public class JuegoController implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	IJuegoService serviceJuego;
	@Inject
	IBibliotecaService serviceBiblioteca;
	@Inject
	ICategoriaService serviceCategoria;
	
	private List<Juego> juegos;
	private List<Biblioteca> bibliotecas;
	private List<Categoria> categorias;
	private Juego juego;
	private Biblioteca biblioteca;
	private Categoria categoria;
	

	@PostConstruct
	public void init() {
		juego = new Juego();
		this.juegos = serviceJuego.listar();
		this.bibliotecas = serviceBiblioteca.listar();
		this.categorias = serviceCategoria.listar();
		biblioteca=new Biblioteca();
		categoria=new Categoria();
	}
	
	
	public void onRowEdit(RowEditEvent event) {        
        juego = (Juego)event.getObject();
        boolean flag = serviceJuego.actualizar(juego);
        if(flag) {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Juego editado", "Ahora puede editar otro Juego");
        }else {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
        }
    }
     
    public void onRowCancel(RowEditEvent event) {
    	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Edición cancelada", "Ahora puede editar otro Juego");
    }

    public void eliminar(int ID) {
		try {
			boolean flag = serviceJuego.eliminar(ID);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Juego eliminado", "");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}
    

	public void resetar() {
		juego = new Juego();
	}
	
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}


	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void guardar() { 
		try {
			juego.setBiblioteca(biblioteca);
			juego.setCategoria(categoria);
			boolean flag = serviceJuego.crear(juego);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Juego creado", "Ahora puede crear otro Juego");
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

	

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego Juego) {
		this.juego = Juego;
	}

	public List<Juego> getJuegos() {
		return juegos;
	}

	public void setJuegos(List<Juego> Juegos) {
		this.juegos = Juegos;
	}

	public List<Biblioteca> getBibliotecas() {
		return bibliotecas;
	}

	public void setBibliotecas(List<Biblioteca> bibliotecas) {
		this.bibliotecas = bibliotecas;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
}
