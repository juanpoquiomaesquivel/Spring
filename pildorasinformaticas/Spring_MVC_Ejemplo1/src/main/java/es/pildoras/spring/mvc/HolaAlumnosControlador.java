package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
	
	// procesar información agregada al modelo y luego mostrar la vista
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		String nombre = request.getParameter("nombreAlumno");
		nombre += " es el mejor alumno.";
		String mensajeFinal = "¿Quien es el mejor alumno?, " + nombre;
		
		// Agregando info al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		// Mostrando la vista
		return "HolaAlumnosSpring";
	}
}

// https://www.youtube.com/watch?v=NA8xAsZ6CEU&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=29