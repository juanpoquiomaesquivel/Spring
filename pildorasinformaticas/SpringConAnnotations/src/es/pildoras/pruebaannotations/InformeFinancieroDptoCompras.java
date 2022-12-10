package es.pildoras.pruebaannotations;

public class InformeFinancieroDptoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe financiero del departamento de compras año 2018";
	}
}
