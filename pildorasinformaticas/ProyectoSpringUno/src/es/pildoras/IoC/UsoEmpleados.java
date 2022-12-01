package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		/* // Creación de objetos de tipo Empleado
		Empleados Empleado1 = new DirectorEmpleado();

		// Uso de los objetos creados
		System.out.println(Empleado1.getTareas()); */
		
		// Cargar el archivo XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir el bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		// Utilizar el bean
		System.out.println(Juan.getTareas());
		
		// Cerrar el XML
		contexto.close();
	}
}

// https://www.youtube.com/watch?v=fZHnVbYkSm0&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=5
// https://www.youtube.com/watch?v=-Cs1HN6pEg4&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=6
// https://www.youtube.com/watch?v=dAAB2EqMiC4&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=7
// https://www.youtube.com/watch?v=MdIlvJDCsk8&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=8