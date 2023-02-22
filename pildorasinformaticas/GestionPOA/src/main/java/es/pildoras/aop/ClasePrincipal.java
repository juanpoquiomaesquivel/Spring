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
		ClienteVIPDAO cv = contexto.getBean("clienteVIPDAO", ClienteVIPDAO.class);

		// llamar al método}
		Cliente elCliente = new Cliente();

		c.insertaCliente(elCliente, "normal"); // este es el nombre del método que debe coincidir con la anotación
												// @Before
		cv.insertaClienteVIP();

		// cerrar el contexto

		c.setCodigoClienteNormal("594561512");
		c.setValoracionClienteNormal("positiva");

		String codigoCL = c.getCodigoClienteNormal();
		String valoraCL = c.getValoracionClienteNormal();

		contexto.close();
	}

}

// https://www.youtube.com/watch?v=ea_OEI8EOGE&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=81