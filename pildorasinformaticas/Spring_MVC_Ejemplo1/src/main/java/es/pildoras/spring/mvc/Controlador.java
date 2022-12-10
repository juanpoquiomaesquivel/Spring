package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // especificamos que esta clase es nuestro Controlador
public class Controlador {

	// metodo encargado de especificar que vista queremos que nos proporcione
	@RequestMapping // especificamos que este es nuestro metodo encargado de mapear que vista queremos llamar
	public String muestraPagina() {
		return "paginaEjemplo"; // devuelve el nombre del archivo .jsp
	}
}
