package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// leer el XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// pedir un bean a Spring
		Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		// usar el bean
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		// cerrar el contexto
		contexto.close();
	}
}

// https://www.youtube.com/watch?v=qAHgl5y9jpg&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=15
// https://www.youtube.com/watch?v=nP546I6wQMw&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=16
// https://www.youtube.com/watch?v=Nx-1ixXKlDU&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=17
// https://www.youtube.com/watch?v=-q2M_B33Ubs&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=18
// https://www.youtube.com/watch?v=fpObd_IpPoc&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=19
// https://www.youtube.com/watch?v=2SFV0GLvyF0&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=20