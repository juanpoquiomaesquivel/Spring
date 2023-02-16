package es.pildoras.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.dao.ClienteDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leer la configuración spring

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		// Obtener el bean del cintenedor de spring

		ClienteDAO c = contexto.getBean("clienteDAO", ClienteDAO.class);

		// llamar al método}
		c.insertaCliente();

		// cerrar el contexto
		contexto.close();
	}

}

// https://www.youtube.com/watch?v=AjXPs9nVHow&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=76
// https://www.youtube.com/watch?v=SXwb0sRsFN4&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=77