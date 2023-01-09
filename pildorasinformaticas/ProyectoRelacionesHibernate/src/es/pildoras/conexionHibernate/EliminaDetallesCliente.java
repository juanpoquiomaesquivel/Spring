package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaDetallesCliente {

	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();

		try {
			miSession.beginTransaction();
			
			DetallesCliente dc = miSession.get(DetallesCliente.class, 4);
			
			if (dc != null) {
				System.out.println("Voy a eliminar el cliente");
				
				miSession.delete(dc);

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

// https://www.youtube.com/watch?v=JABaETi74yk&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=59
