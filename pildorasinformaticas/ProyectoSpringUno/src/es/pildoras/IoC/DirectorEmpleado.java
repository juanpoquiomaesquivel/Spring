package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	// 2.1. Creación de campo tipo creacionInforme (interface)
	private CreacionInformes informeNuevo;
	
	// 2.2. Creación del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa.";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}
}
