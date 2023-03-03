package es.pildoras.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.dao.ClienteDAO;
import es.pildoras.aop.dao.ClienteVIPDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leer la configuración spring

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		// Obtener el bean del cintenedor de spring

		ClienteDAO c = contexto.getBean("clienteDAO", ClienteDAO.class);
		c.encuentraClientes();
		
		System.out.println("Aquí continuará la ejecución del programa.");

		// cerrar el contexto


		contexto.close();
	}

}

// https://www.youtube.com/watch?v=H3Y1NqwSX4s&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=84