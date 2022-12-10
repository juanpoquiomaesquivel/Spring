package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // esta clase va a ser el archivo de configuracion
@ComponentScan("es.pildoras.pruebaannotations") // especificar donde buscar
@PropertySource("classpath:datosEmpresa.propiedades") // donde buscar el archivo de propiedades
public class EmpleadosConfig {

	// definir el bean para InfomeFinancieroDptoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDptoCompras() { // será el ID del bean solicitado
		return new InformeFinancieroDptoCompras();
	}
	
	// definir el bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDptoCompras());
	}
}
