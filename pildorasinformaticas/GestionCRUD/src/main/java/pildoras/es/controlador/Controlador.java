package pildoras.es.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/muestraFormularioAgregar")
	public String muestraFormularioAgregar(Model elModelo) {
		// Bind de datos de los clientes
		Cliente elCliente = new Cliente();
		
		elModelo.addAttribute("cliente", elCliente);
		
		return "formularioCliente";
	}
	
	@PostMapping("/insertarCliente")
	public String insertarCliente(@ModelAttribute("cliente") Cliente elCliente) {
		
		// Insertar cliente en bbdd
		clienteDAO.insertarCliente(elCliente);
		
		return "redirect:/cliente/lista";
	}
	
	@GetMapping("/muestraFormularioActualizar")
	public String muestraFormularioActualizar(@RequestParam("clienteId") Integer id, Model elModelo) {
		// Obtener el cliente con id = "id"
		Cliente elCliente = clienteDAO.getCliente(id);
		
		// Establecer el cliente como atributo del modelo
		elModelo.addAttribute("cliente", elCliente);
		
		// Enviar al formulario
		
		return "formularioCliente";
	}
	
	@GetMapping("/eliminar")
	public String eliminarCliente(@RequestParam("clienteId") Integer id) {
		// Eliminar el cliente con id = "id"
		clienteDAO.eliminarCliente(id);
		
		// Reedirencionar  a la lista
		
		return "redirect:/cliente/lista";
	}
	
	@Autowired
	private ClienteDAO clienteDAO;
}

// https://www.youtube.com/watch?v=4o560_FOzdk&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=71
// https://www.youtube.com/watch?v=uYzJA8LdpgQ&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=73
// https://www.youtube.com/watch?v=gEkLJy5HLqs&list=PLU8oAlHdN5Blq85GIxtKjIXdfHPksV_Hm&index=75