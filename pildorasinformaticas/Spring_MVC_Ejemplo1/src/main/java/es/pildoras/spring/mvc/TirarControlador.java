package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario") // para evitar el conflicto de rutas, usado como ruta relativa
public class TirarControlador {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		nombre += " es el PEOR alumno.";
		String mensajeFinal = "¿Quien es el PEOR alumno?, " + nombre;
		
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
}

// https://www.youtube.com/watch?v=8LkJV3XVbc8&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=33