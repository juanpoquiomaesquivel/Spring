package es.pildoras.spring.mvc.validacionpersonalizada;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CPostalMadridValidacion.class) // futura clase que contiene la logica de la validacion
@Target({ElementType.METHOD, ElementType.FIELD}) // destino de nuestra validacion (metodos o campos de clase)
@Retention(RetentionPolicy.RUNTIME) // chequea la anotacion en tiempo de ejecucion
public @interface CPostalMadrid {

	// definir el codigo postal por defecto
	public String value() default "28";
	
	// definir el mensaje de error
	public String message() default "El codigo postal debe empezar por 28";
	
	// definir los grupos
	Class<?>[] groups() default {};
	
	// desfinir los payloads
	Class<? extends Payload>[] payload() default {};
}

// https://www.youtube.com/watch?v=uu1KPFsqzq4&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=44
// https://www.youtube.com/watch?v=jeXZMs6apVQ&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=45