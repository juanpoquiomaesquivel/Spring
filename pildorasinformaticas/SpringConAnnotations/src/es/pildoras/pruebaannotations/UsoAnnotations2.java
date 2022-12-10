package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// leer el XML de configuración
		// ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// pedir un bean a Spring
		//Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);		
		//Empleados Lucia = contexto.getBean("ComercialExperimentado", Empleados.class);
		/*
		// ¿apuntan al mismo objeto en memoria?		
		System.out.println(Antonio == Lucia ? "si" : "no");
		System.out.println(Antonio + "\n" + Lucia);*/
		
		Empleados e = contexto.getBean("directorFinanciero", Empleados.class);
		System.out.println(e.getTareas());
		System.out.println(e.getInforme());
		System.out.println(((DirectorFinanciero) e).getEmail());
		System.out.println(((DirectorFinanciero) e).getNombreEmpresa());
		
		// cerrar el contexto
		contexto.close();
	}
}

// https://www.youtube.com/watch?v=ybr2HsrmNkY&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=21
// https://www.youtube.com/watch?v=2x8YrmKx0dE&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=22
// https://www.youtube.com/watch?v=lrQLUwOTipE&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=23
// https://www.youtube.com/watch?v=I1EQV5MSwl4&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=24
// https://www.youtube.com/watch?v=0HkgE3SxCgM&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=25