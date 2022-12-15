package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaClientePrueba {

	public static void main(String[] args) {
		
		// Crear SessionFactory
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		// Crear obj Session
		Session miSession = miFactory.openSession();
		
		try {
			// Crear obj Clientes
			Clientes c1 = new Clientes("Juan", "Poquioma", "Lima");
			
			// Ejecutar transaccion SQL
			
			// Comenzar transaccion
			miSession.beginTransaction();
			
			// Guardar obj en BBDD
			miSession.save(c1);
			
			// commit? -> guardar todo
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en BBDD");
			
			// cerrar sesion
			miSession.close();
		} finally {
			miFactory.close();
		}
	}

}

// https://www.youtube.com/watch?v=AiZdkgohllI&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=48
// https://www.youtube.com/watch?v=q8exco4eCgQ&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=49