package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// cargar XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// obtención del bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getInforme());
		
		// cerrar el contexto
		contexto.close();
	}
}

// https://www.youtube.com/watch?v=J6Mae6LLpLI&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=14