package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaClientePrueba {

	public static void main(String[] args) {
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			Clientes c1 = new Clientes("Sandra", "Perez", "Moldavia");
						
			miSession.beginTransaction();
			
			miSession.save(c1);
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en BBDD");
			
			// lectura de registro
			miSession.beginTransaction();
			
			System.out.println("Lectura de registro con ID: " + c1.getId());
			
			Clientes clienteInsertado = miSession.get(Clientes.class, c1.getId());
			
			System.out.println("Registro: " + clienteInsertado);
			
			miSession.getTransaction().commit();
			
			System.out.println("Terminado");
			
			miSession.close();
		} finally {
			miFactory.close();
		}
	}

}

// https://www.youtube.com/watch?v=74_ynB007uQ&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=50