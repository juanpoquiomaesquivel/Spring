package es.pildoras.conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {

	public static void main(String[] args) {

		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();

		try {
			// comenzar session
			miSession.beginTransaction();

			// consulta clientes
			List<Clientes> losClientes = miSession.createQuery("from Clientes").getResultList();

			recorreClientesConsultados(losClientes);

			// consulta: dame los gomez
			losClientes = miSession.createQuery("from Clientes cl where cl.apellidos = 'Gómez'").getResultList();

			// buscar los gomez
			recorreClientesConsultados(losClientes);

			// muestra los que viven en Caracas o se apellidon Perez
			losClientes = miSession
					.createQuery("from Clientes cl where cl.apellidos = 'Perez' or cl.direccion = 'Caracas'")
					.getResultList();

			recorreClientesConsultados(losClientes);

			// commit
			miSession.getTransaction().commit();

			System.out.println("Terminado");

			// cerrar la sesión
			miSession.close();
		} finally {
			miFactory.close();
		}
	}

	private static void recorreClientesConsultados(List<Clientes> losClientes) {
		for (Clientes c : losClientes) {
			System.out.println(c);
		}
	}
}