package co.edu.usbcali.stb.controller;

import co.edu.usbcali.stb.domain.Cliente;
import co.edu.usbcali.stb.repository.Clienterepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final Clienterepository clienterepository;

    public ClienteController(Clienterepository clienterepository){
        this.clienterepository = clienterepository;
    }
    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador Correcto";
    }
    @GetMapping("/ObtenerTodos")
    public List<Cliente>obtenerTodos(){
        List<Cliente>clientes = clienterepository.findAll();
        return clientes;
    }
}
