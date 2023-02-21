package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto {
	
	@Pointcut("execution(public * insertaCliente(..))")
	private void paraClientes() {}

	// @Before("execution(public void
	// es.pildoras.aop.dao.ClienteVIPDAO.insertaCliente())") // pointcut expressions
	// @Before("execution(public * insertaCliente*(es.pildoras.aop.Cliente, ..))")
	@Before("paraClientes()")
	public void antesDeInsertarCliente() {
		System.out.println("EL usuario está logueado!");
		System.out.println("EL login es correcto, usuario permitido!");
	}
	
	@Before("paraClientes()")
	public void requisitosCliente() {
		System.out.println("El cliente cumple los requisitos para ser insertado en la base de datos!");
	}
	
	@Before("paraClientes()")
	public void requisitosTabla() {
		System.out.println("Hay menos de 3000 registros en la tabla. Puedes ingresar el cliente!");
	}
}
