package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

// 1. crear interface a inyectar (dependencia)
@Component
public interface CreacionInformeFinanciero {

	public String getInformeFinanciero();
}
