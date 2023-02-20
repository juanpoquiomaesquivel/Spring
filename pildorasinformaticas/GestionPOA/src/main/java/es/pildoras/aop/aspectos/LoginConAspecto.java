package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto {

	// @Before("execution(public void
	// es.pildoras.aop.dao.ClienteVIPDAO.insertaCliente())") // pointcut expressions
	// @Before("execution(public * insertaCliente*(es.pildoras.aop.Cliente, ..))")
	@Before("execution(public * insertaCliente*(..))")
	public void antesDeInsertarCliente() {
		System.out.println("EL usuario está logueado!");
		System.out.println("EL login es correcto, usuario permitido!");
	}
}
