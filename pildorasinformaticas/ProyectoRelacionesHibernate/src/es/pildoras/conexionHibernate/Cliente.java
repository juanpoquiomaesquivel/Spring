package es.pildoras.conexionHibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity; // version 5.6.0
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	public Cliente() {

	}

	public Cliente(String nombre, String apellidos, String direccion) {
		this.nombre = nombre;
		this.apellido = apellidos;
		this.direccion = direccion;
	} 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private DetallesCliente dc; // generamos el campo de referencia FK (unidireccional si está ausente lo mismo en la otra clase)

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "direccion")
	private String direccion;

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public DetallesCliente getDc() {
		return dc;
	}

	public void setDc(DetallesCliente dc) {
		this.dc = dc;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}

//https://www.youtube.com/watch?v=JDhbvRKXVHE&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=53
//https://www.youtube.com/watch?v=Fbsq1poG1Z8&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=54
//https://www.youtube.com/watch?v=OKfXRhKNLDk&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=55
//https://www.youtube.com/watch?v=xXkxA2k10cY&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=56
//https://www.youtube.com/watch?v=B6MCFhBekWI&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=57
