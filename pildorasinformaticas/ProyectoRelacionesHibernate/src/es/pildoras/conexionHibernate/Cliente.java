package es.pildoras.conexionHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity; // version 5.6.0
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	private DetallesCliente dc; // generamos el campo de referencia FK (unidireccional si está ausente lo mismo
								// en la otra clase)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "direccion")
	private String direccion;
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "cliente", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private List<Pedido> pedidos;

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ "]";
	}

	public void agregarPedidos(Pedido pedido) {
		if (pedidos == null) {
			pedidos = new ArrayList<>();
		}
		
		pedidos.add(pedido);
		pedido.setCliente(this);
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

// https://www.youtube.com/watch?v=Bi3uIoW2nG4&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=64
// https://www.youtube.com/watch?v=RzA-vgHuoW0&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=65