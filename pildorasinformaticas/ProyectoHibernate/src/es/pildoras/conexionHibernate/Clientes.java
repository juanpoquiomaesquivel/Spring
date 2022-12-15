package es.pildoras.conexionHibernate;

import javax.persistence.Column;
import javax.persistence.Entity; // version 5.6.0
import javax.persistence.Id;
import javax.persistence.Table;

// mapeo de clase a tabla
@Entity // transformar nuestra clase en entidad para que se corresponda con una tabla en
		// la bbdd
@Table(name = "clientes")
public class Clientes {

	public Clientes() {

	}

	public Clientes(String nombre, String apellidos, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	@Id
	@Column(name = "Id")
	private int id;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Apellidos")
	private String apellidos;
	@Column(name = "Direccion")
	private String direccion;

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
