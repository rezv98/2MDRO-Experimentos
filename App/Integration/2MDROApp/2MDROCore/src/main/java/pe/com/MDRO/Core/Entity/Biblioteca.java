package pe.com.MDRO.Core.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="biblioteca")
public class Biblioteca implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_biblioteca")
private int id;
@Column(name="nombre")
private String nombre;

@OneToMany(mappedBy="biblioteca")
List<Juego> juegos;



public Biblioteca() {
	
	// TODO Auto-generated constructor stub
}
public Biblioteca(String nombre) {
	
	this.nombre = nombre;
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

}
