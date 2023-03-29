package es.pildoras.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.servicios.MedicionServicio;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leer la configuración spring

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		// Obtener el bean del cintenedor de spring
		
		MedicionServicio ms = contexto.getBean("medicionServicio", MedicionServicio.class);
		
		System.out.println("Llamando al método getServicio()");
		
		String datos = ms.getServicio();
		
		System.out.println("Devolución del método: " + datos);

		/*ClienteDAO c = contexto.getBean("clienteDAO", ClienteDAO.class);
		try {
		boolean miParam = true;
		
		c.encuentraClientes(miParam);
		} catch (Exception ex) {
			System.out.println("Excepción lanzada desde la clase principal");
			System.out.println(ex.getMessage());
		}
		System.out.println("Aquí continuará la ejecución del programa.");*/

		// cerrar el contexto


		contexto.close();
	}

}

// https://www.youtube.com/watch?v=yyuqYAYTxN8&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=88