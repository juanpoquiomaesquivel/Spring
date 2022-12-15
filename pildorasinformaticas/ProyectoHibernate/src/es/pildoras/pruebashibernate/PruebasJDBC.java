package es.pildoras.pruebashibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebasJDBC {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false";
		
		String user = "root";
		String pass = "facturacion";

		try {
			System.out.println("Intentando conectar a la bbdd: " + jdbcUrl);
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Conexion exitosa");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
