package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerCliente {

	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();

		try {
			miSession.beginTransaction();
			
			// obtener detalles cliente
			DetallesCliente dcr = miSession.get(DetallesCliente.class, 1);
			
			System.out.println(dcr);
			
			System.out.println(dcr.getC());

			miSession.getTransaction().commit();

			System.out.println("Registro obtenido correctamente de BBDD");

			miSession.close();
		} finally {
			miFactory.close();
		}
	}
}
