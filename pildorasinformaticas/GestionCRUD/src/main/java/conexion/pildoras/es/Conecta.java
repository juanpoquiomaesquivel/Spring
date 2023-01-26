package conexion.pildoras.es;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Conecta
 */
@WebServlet("/Conecta")
public class Conecta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Conecta() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String jdbcUrl = "jdbc:mysql://localhost:3306/gestionpedidoscrud?useSSL=false";

		String user = "root";
		String pass = "admin";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			out.print("Nombre de la base de datos" + jdbcUrl + "<br>");
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			out.print("conectado");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

// https://www.youtube.com/watch?v=iHUuk_VeH7U&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=66
// https://www.youtube.com/watch?v=nSFBxo8xEkk&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=67