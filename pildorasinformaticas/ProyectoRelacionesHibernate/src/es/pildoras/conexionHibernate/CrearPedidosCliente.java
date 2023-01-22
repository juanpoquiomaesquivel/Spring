package es.pildoras.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrearPedidosCliente {

	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class).addAnnotatedClass(Pedido.class).buildSessionFactory();

		Session miSession = miFactory.openSession();

		try {

			miSession.beginTransaction();

			// obtener el cliente de la bbdd
			Cliente elCliente = miSession.get(Cliente.class, 5);

			// crear pedidos del cliente
			Pedido pe1 = new Pedido(new GregorianCalendar(2020, 7, 5));
			Pedido pe2 = new Pedido(new GregorianCalendar(2020, 6, 15));
			Pedido pe3 = new Pedido(new GregorianCalendar(2020, 4, 21));

			// pedidos creados al cliente creado
			elCliente.agregarPedidos(pe1);
			elCliente.agregarPedidos(pe2);
			elCliente.agregarPedidos(pe3);

			// guardar los pedidos en la bbdd
			miSession.save(pe1);
			miSession.save(pe2);
			miSession.save(pe3);

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
