package pildoras.es.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pildoras.es.controlador.entity.Cliente;

@Repository
public class ClienteDAOclase implements ClienteDAO {

	@Override
	@Transactional
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		// Obtener la session
		Session miSession = sessionFactory.getCurrentSession();
		
		// Crear la consulta
		Query<Cliente> miQuery = miSession.createQuery("from Cliente", Cliente.class);
		
		// Ejecutar la query y devolver los resultados
		List<Cliente> clientes = miQuery.getResultList();
		
		return clientes;
	}

	@Autowired
	private SessionFactory sessionFactory;
}

// https://www.youtube.com/watch?v=pUsul0OnEYA&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=69
