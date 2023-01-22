package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertaCliente {

	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.addAnnotatedClass(Pedido.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();

		try {
			Cliente c1 = new Cliente("Ana", "Marín", "Gran vía");
			
			DetallesCliente dc1 = new DetallesCliente("www.tres.com.pe", "1451615", "tercer cliente");
			
			// asociar los objetos
			c1.setDc(dc1);

			miSession.beginTransaction();
			
			// esto guarda la infomración en las dos tablas relacionadas
			miSession.save(c1);

			miSession.getTransaction().commit();

			System.out.println("Registro insertado correctamente en BBDD");

			miSession.close();
		} finally {
			miFactory.close();
		}
	}
}
