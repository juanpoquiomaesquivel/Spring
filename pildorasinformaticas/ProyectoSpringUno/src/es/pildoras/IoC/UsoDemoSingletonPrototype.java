package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// Carga de XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// Petición de beans al contenedor
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		if (Maria == Pedro)
			System.out.println("Apuntan a la misma direccion.");
		else
			System.out.println("Apuntan a objetos diferentes");
		
		System.out.println(Maria);
		
		System.out.println(Pedro);
		
		contexto.close();
	}
}

//https://www.youtube.com/watch?v=ZMmw_aZT76c&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=13