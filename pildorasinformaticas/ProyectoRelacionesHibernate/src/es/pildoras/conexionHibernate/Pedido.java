package es.pildoras.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "fecha")
	private GregorianCalendar fecha;
	@Column(name = "forma_pago")
	private String forma_pago;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Pedido() {

	}

	public Pedido(GregorianCalendar fecha) {
		super();
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha=" + fecha + ", forma_pago=" + forma_pago + "]";
	}
}

// https://www.youtube.com/watch?v=7UItZlS9Vkk&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=60
// https://www.youtube.com/watch?v=XPbBIpK8a9o&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=61
// https://www.youtube.com/watch?v=zu8cYc5mLqI&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=62
// https://www.youtube.com/watch?v=z0OFQSzudJc&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=63