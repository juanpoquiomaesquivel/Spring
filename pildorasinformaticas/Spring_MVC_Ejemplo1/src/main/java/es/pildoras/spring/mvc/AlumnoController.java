package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) { // esta funcion mostrara el formulario
		Alumno elAlumno = new Alumno();
		
		modelo.addAttribute("elAlumno", elAlumno); // agregamos el objeto al modelo para el formulario
		
		return "alumnoRegistroFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute("elAlumno") Alumno elAlumno) { // se rescata el objeto alumno que viene del modelo
		return "confirmacionRegistroAlumno";
	}
}

// https://www.youtube.com/watch?v=Kib73OFMQkM&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=34
// https://www.youtube.com/watch?v=IQPbWexnVxk&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=35
// https://www.youtube.com/watch?v=0KXqDxxevHo&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=36
// https://www.youtube.com/watch?v=Nj7lsJuQrgI&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=37