package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class LoginConAspecto {
	
	// @Pointcut("execution(public * insertaCliente(..))")
	@Pointcut("execution(* es.pildoras.aop.dao.*.*(..))")
	public void paraClientes() {}

	@Before("paraClientes()")
	public void antesDeInsertarCliente() {
		System.out.println("EL usuario está logueado!");
		System.out.println("EL login es correcto, usuario permitido!");
	}
}
