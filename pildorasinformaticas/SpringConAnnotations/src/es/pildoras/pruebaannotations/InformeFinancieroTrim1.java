package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

// 1. crear clase a inyectar (dependencia)
@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion del informe financiero trimestre 1";
	}
}
