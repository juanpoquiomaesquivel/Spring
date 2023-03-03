package es.pildoras.aop.aspectos;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import es.pildoras.aop.Cliente;

@Aspect
@Component
@Order(3)
public class LoginConAspecto {
	
	@AfterReturning(pointcut="execution(* es.pildoras.aop.dao.ClienteDAO.encuentraClientes(..))", returning="listaClientes")
	public void tareaTrasEncontrarClientes(List<Cliente> listaClientes) {
		for (Cliente cl : listaClientes) {
			if (cl.getTipo() == "VIP") {
				System.out.println(cl);
			}
		}
	}

	// @Pointcut("execution(public * insertaCliente(..))")
	@Pointcut("execution(* es.pildoras.aop.dao.*.*(..))")
	public void paraClientes() {
	}

	@Before("paraClientes()")
	public void antesDeInsertarCliente(JoinPoint miJoin) {
		System.out.println("EL usuario está logueado!");
		System.out.println("EL login es correcto, usuario permitido!");

		// Capturar los argumentos
		Object[] argumentos = miJoin.getArgs();

		for (Object temp : argumentos) {
			if (temp instanceof Cliente) {
				Cliente cl = (Cliente) temp;
				System.out.println("Nombre del cliente: " + cl.getNombre());
				System.out.println("Tipo del cliente: " + cl.getTipo());
			}
		}
	}
}
