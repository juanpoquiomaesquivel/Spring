package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaCliente {

	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();

		try {
			miSession.beginTransaction();
			
			Cliente c = miSession.get(Cliente.class, 2);
			
			if (c != null) {
				System.out.println("Voy a eliminar el cliente");
				
				miSession.delete(c);

				miSession.getTransaction().commit();

				System.out.println("Registro eliminado correctamente en BBDD");
			} else {
				System.out.println("Nada que eliminar");
			}

			miSession.close();
		} finally {
			miFactory.close();
		}
	}
}
