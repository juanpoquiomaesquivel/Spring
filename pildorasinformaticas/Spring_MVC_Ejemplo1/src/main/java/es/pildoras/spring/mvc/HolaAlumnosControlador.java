package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {

	@RequestMapping("/muestraFormulario") // especificar la URL
	public String muestraFormulario() { // proporciona el formulario
		return "HolaAlumnosFormulario";
	}
	
	// crear el metodo que procesa el formulario
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
}

// https://www.youtube.com/watch?v=6NCcLj9e7d0&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=28