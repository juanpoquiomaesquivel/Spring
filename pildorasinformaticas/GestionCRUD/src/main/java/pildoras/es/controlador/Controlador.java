package pildoras.es.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pildoras.es.controlador.entity.Cliente;
import pildoras.es.dao.ClienteDAO;


@Controller
@RequestMapping("/cliente")
public class Controlador {

	@RequestMapping("/lista")
	public String listaClientes(Model elModelo) {
		// Obtener los clientes desde el dao
		List<Cliente> losclientes = clienteDAO.getClientes();
		
		// Agregar los cliente al modelo
		elModelo.addAttribute("clientes", losclientes);
		
		return "lista-clientes";
	}
	
	@Autowired
	private ClienteDAO clienteDAO;
}
