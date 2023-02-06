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

	@Override
	@Transactional
	public void insertarCliente(Cliente elCliente) {
		// TODO Auto-generated method stub
		// Obtener la session
		Session miSession = sessionFactory.getCurrentSession();

		// Insertar el cliente
		// miSession.save(elCliente);
		miSession.saveOrUpdate(elCliente);
	}

	@Override
	@Transactional
	public Cliente getCliente(Integer id) {
		// TODO Auto-generated method stub
		// Obtener la session
		Session miSession = sessionFactory.getCurrentSession();

		// Obtener la información del cliente seleccionado
		Cliente elCliente = miSession.get(Cliente.class, id);

		return elCliente;
	}

	@Override
	@Transactional
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		// Obtener la session
		Session miSession = sessionFactory.getCurrentSession();

		// BOrrar el cliente de la bbdd utilizando el ID
		Query consulta = miSession.createQuery("delete from Cliente where id=:IdDelCliente");
		consulta.setParameter("IdDelCliente", id);
		consulta.executeUpdate();
	}
}

// https://www.youtube.com/watch?v=pUsul0OnEYA&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=69
