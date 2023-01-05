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

			System.out.println("Registro obtenido correctamente de BBDD");
			
			System.out.println("Ahora vamos a eliminar en cascada.");
			
			miSession.delete(dcr);

			miSession.getTransaction().commit();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			miSession.close();
			miFactory.close();
		}
	}
}

// https://www.youtube.com/watch?v=D_BwHTK64TQ&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=58