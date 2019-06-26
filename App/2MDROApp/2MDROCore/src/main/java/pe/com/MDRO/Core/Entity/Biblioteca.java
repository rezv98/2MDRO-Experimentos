package pe.com.MDRO.Core.Entity;

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
public class Biblioteca {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_biblioteca")
private int id;

private String nombre;

@OneToMany(mappedBy="biblioteca")
List<Juego> juegos;

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
