package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {

	// 2.1. Creación de campo tipo creacionInforme (interface)
	private CreacionInformes informeNuevo;
	
	// 2.2. Creación del constructor que inyecta la dependencia
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getTareas() {
		return "Gestiono las tareas relativas a mis empleados de seccion.";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
	// Inyección de campos
	private String email;
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
}
