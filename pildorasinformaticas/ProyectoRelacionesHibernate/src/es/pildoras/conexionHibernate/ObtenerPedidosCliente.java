package es.pildoras.conexionHibernate;

import org.hibernate.Query;
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
			// Cliente elCliente = miSession.get(Cliente.class, 5);
			Query<Cliente> consulta = miSession.createQuery("select cl from Cliente cl join fetch cl.pedidos where cl.id=:elClienteId", Cliente.class);
			
			consulta.setParameter("elClienteId", 5);
			
			Cliente elCliente = consulta.getSingleResult();

			System.out.println("cliente: " + elCliente);
			System.out.println("pedidos: " + elCliente.getPedidos());

			miSession.getTransaction().commit();
			
			miSession.close();
			
			System.out.println("pedidos2: " + elCliente.getPedidos());

			System.out.println("Registros obtenidos correctamente en BBDD");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			miSession.close();
			miFactory.close();
		}
	}
}
