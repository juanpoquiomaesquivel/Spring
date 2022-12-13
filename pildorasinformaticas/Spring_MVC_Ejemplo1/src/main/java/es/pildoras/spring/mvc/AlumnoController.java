package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		Alumno elAlumno = new Alumno();
		
		modelo.addAttribute("elAlumno", elAlumno);
		
		return "alumnoRegistroFormulario";
	}
	
	@RequestMapping("/procesarFormulario") // los resultados de la validacion se guardan en BindingResult
	// tambien indicamos con @Valida que estamos utilizando validacion
	public String procesarFormulario(@Valid @ModelAttribute("elAlumno") Alumno elAlumno, BindingResult resultadoValidacion) { // Especificar validacion en el controlador
		
		if (resultadoValidacion.hasErrors()) {
			return "alumnoRegistroFormulario";
		}
		
		return "confirmacionRegistroAlumno";
	}
}

// https://www.youtube.com/watch?v=iUXhIsiRLuA&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=38
// https://www.youtube.com/watch?v=1uQGwJ_-Hpw&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=39
// https://www.youtube.com/watch?v=ur38aDTMNuc&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=40