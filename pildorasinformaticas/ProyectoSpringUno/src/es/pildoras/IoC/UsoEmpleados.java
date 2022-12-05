package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Inyección de dependencias con Constructor
		
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);

		System.out.println(Juan.getTareas());

		System.out.println(Juan.getInforme());
		
		System.out.println("Email: " + ((JefeEmpleado) Juan).getEmail());
		
		System.out.println("Empresa: " + ((JefeEmpleado) Juan).getNombreEmpresa());
		
		// Inyección de dependencias con Setter

		Empleados Maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);

		System.out.println(Maria.getTareas());

		System.out.println(Maria.getInforme());
		
		System.out.println("Email: " + ((SecretarioEmpleado) Maria).getEmail());
		
		System.out.println("Empresa: " + ((SecretarioEmpleado) Maria).getNombreEmpresa());

		contexto.close();
	}
}
