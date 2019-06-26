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

import pe.com.MDRO.Core.Service.IJuegoService;
import pe.com.MDRO.Core.Service.ITiendaService;
import pe.com.MDRO.Core.Service.IVentaService;
import pe.com.MDRO.Core.Entity.Venta;
import pe.com.MDRO.Core.Entity.Juego;
import pe.com.MDRO.Core.Entity.Tienda;

@Named
@ViewScoped
public class VentaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	IVentaService serviceVenta;
	
	@Inject
	IJuegoService serviceJuego;
	
	@Inject
	ITiendaService serviceTienda;
	
	List<Venta> ventas;
	List<Juego> juegos;
	List<Tienda> tiendas;
	Venta venta;
	Juego juego;
	Tienda tienda;

	@PostConstruct
	public void init() {
		venta = new Venta();
		juego = new Juego();
		tienda = new Tienda();
		this.ventas = serviceVenta.listar();
		this.juegos = serviceJuego.listar();
		this.tiendas = serviceTienda.listar();
		
	}
	
	
	public void onRowEdit(RowEditEvent event) {        
        venta = (Venta)event.getObject();
        boolean flag = serviceVenta.actualizar(venta);
        if(flag) {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Venta editada", "Ahora puede editar otra Venta");
        }else {
        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
        }
    }
     
    public void onRowCancel(RowEditEvent event) {
    	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Edición cancelada", "Ahora puede editar otra Venta");
    }

    public void eliminar(int ID) {
		try {
			boolean flag = serviceVenta.eliminar(ID);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Venta eliminada", "");
	        }else {
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Ocurrió un error", "Intente nuevamente por favor");
	        }
		} catch (Exception e) {
			this.agregarMensaje(FacesMessage.SEVERITY_ERROR, "Ocurrió un error", e.getMessage());
		}
		
	}
    

	public void resetar() {
		venta = new Venta();
	}
	
	public void guardar() { 
		try {
			boolean flag = serviceVenta.crear(venta);
	        if(flag) {
	        	this.resetar();
	        	this.agregarMensaje(FacesMessage.SEVERITY_INFO, "Venta creada", "Ahora puede editar otra Venta");
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

	

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta Venta) {
		this.venta = Venta;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> Ventas) {
		this.ventas = Ventas;
	}

	public List<Juego> getJuegos() {
		return juegos;
	}

	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}

	public List<Tienda> getTiendas() {
		return tiendas;
	}

	public void setTiendas(List<Tienda> tiendas) {
		this.tiendas = tiendas;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

}
