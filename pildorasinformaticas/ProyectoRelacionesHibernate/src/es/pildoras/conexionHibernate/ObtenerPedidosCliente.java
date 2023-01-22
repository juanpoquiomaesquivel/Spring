package es.pildoras.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerPedidosCliente {

	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class).addAnnotatedClass(Pedido.class).buildSessionFactory();

		Session miSession = miFactory.openSession();

		try {

			miSession.beginTransaction();

			// obtener el cliente de la bbdd
			Cliente elCliente = miSession.get(Cliente.class, 5);

			System.out.println("cliente: " + elCliente);
			System.out.println("pedidos: " + elCliente.getPedidos());

			miSession.getTransaction().commit();

			System.out.println("Registros insertados correctamente en BBDD");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			miSession.close();
			miFactory.close();
		}
	}
}
