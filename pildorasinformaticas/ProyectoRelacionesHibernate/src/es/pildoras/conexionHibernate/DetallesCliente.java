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
@Table(name = "detalles_cliente")
public class DetallesCliente {

	public DetallesCliente(String web, String tfno, String comentarios) {
		this.web = web;
		this.tfno = tfno;
		this.comentarios = comentarios;
	}
	public DetallesCliente() {

	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getTfno() {
		return tfno;
	}
	public void setTfno(String tfno) {
		this.tfno = tfno;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	@OneToOne(mappedBy = "dc")
	@JoinColumn(name = "id")
	private Cliente c;

	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "web")
	private String web;
	@Column(name = "tfno")
	private String tfno;
	@Column(name = "comentarios")
	private String comentarios;

	@Override
	public String toString() {
		return "DetallesCliente [c=" + c + ", id=" + id + ", web=" + web + ", tfno=" + tfno + ", comentarios="
				+ comentarios + "]";
	}
}
