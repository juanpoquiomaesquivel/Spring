package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	// 2.1. Creación de campo tipo creacionInforme (interface)
	private CreacionInformes informeNuevo;
	
	// 2.2. Creación del setter que inyecta la dependencia
	@Override
	public String getInforme() {
		return "Informe generado por el secretario: " + informeNuevo.getInforme();
	}
		
	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes.";
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
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
