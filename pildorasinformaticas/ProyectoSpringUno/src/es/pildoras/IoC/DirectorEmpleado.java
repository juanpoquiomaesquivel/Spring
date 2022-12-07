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
	
	// método init. Ejecutar tareas antes de que el bean esté disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init. Aqui irian las tareas a ejecutar antes de que el bean este listo.");
	}
	
	// método destroy. Ejecutar tareas después de que el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas a ejecutar despues de utilizar el bean.");
	}
}
