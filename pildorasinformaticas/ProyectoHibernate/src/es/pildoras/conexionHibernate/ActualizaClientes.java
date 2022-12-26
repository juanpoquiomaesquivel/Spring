package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaClientes {

	public static void main(String[] args) {
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			//int clienteid = 1;
						
			miSession.beginTransaction();
			
			//Clientes miCliente = miSession.get(Clientes.class, clienteid);
			
			//miCliente.setNombre("Arnaldao");
			
			// miSession.createQuery("update Clientes set Apellidos = 'Dominguez' where Apellidos like 'D%'").executeUpdate();
			miSession.createQuery("delete Clientes where Apellidos = 'Fedez'").executeUpdate();
			miSession.getTransaction().commit();
			
			// System.out.println("Registro actualizado correctamente en BBDD");
			System.out.println("Registro eliminado correctamente en BBDD");
			
			miSession.close();
		} finally {
			miFactory.close();
		}
	}

}

// https://www.youtube.com/watch?v=ht_BCAbAqn8&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=52