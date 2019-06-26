package pe.com.MDRO.Core.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="juego")
public class Juego {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_juego")
	private int id;
	private String nombre;
	private String plataforma;
	private String descripcion;
	@ManyToOne
	private Categoria categoria;

	@ManyToOne
	private Biblioteca biblioteca;
	
	@OneToMany(mappedBy="juego")
	List<EtiquetaporJuego>etiquetaporjuegos ;
	
	@OneToMany(mappedBy="juego")
	List<Venta>ventas ;
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	
	
}
