package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component -> podría ir así y Spring tomaria el nombre de la clase como ID comenzando en minuscula
@Component("ComercialExperimentado") // agregamos el annotation para poder pedir el bean luego
@Scope("singleton" /*"prototype"*/) // especificamos que queremos trabajar con el patron prototype (singleton por defecto)
public class ComercialExperimentado implements Empleados {
	

	/* // -ciclo de vida- ejecución de codigo despues de creacion del bean (no funciona con Scope prototype)
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("ejecutado tras creacion de bean");
	} */
	
	/* // -ciclo de vida- ejecucion de codigo despues de apagado de Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("ejecutado antes de destruccion");
	} */
	
	/*
	 @PostConstruct y @PreDestroy han quedado obsoletos desde java 9, ahora en la clase 
	 ComercialExperimentado se debe implementar las interfaces InitializingBean y DisposableBean, 
	 y crer el metodo afterPropertiesSet() que se ejecuta despues de que se crea el bean 
	 (remplaza @PostConstruct ) y el metodo destroy() que se ejecuta antes de la destruccion 
	 del bean (remplaza @PreDestroy )
	  */

	@Override
	public String getTareas() {
		return "Vender, vender y vender mas...";
	}
	
	@Override
	public String getInforme() {
		// return "Informe generado por el comercial";
		
		return nuevoInforme.getInformeFinanciero();
	}

	@Autowired // 3. para inyeccion de dependencia usando el campo de clase
	@Qualifier("informeFinancieroTrim4") // debe hacer una inyeccion de dependencia utilizando este bean ID, para evitar confusiones con clases que implementen el mismo interface
	private CreacionInformeFinanciero nuevoInforme;
	
	public ComercialExperimentado() {
		
	}

	/* @Autowired // 3. para configurar la dependencia a inyectar (si hubiera un solo constructor no sería necesaria la anotacion)
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) { // 2. creacion de constructor para inyectar la dependencia
		this.nuevoInforme = nuevoInforme;
	} */

	/* @Autowired // 3. para inyección de dependencia con métodos setter (el nombre del metodo realmente no importa)
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	} */
	
	
}
