package co.edu.usbcali.stb.controller;

import co.edu.usbcali.stb.domain.Cliente;
import co.edu.usbcali.stb.dto.ClienteDTO;
import co.edu.usbcali.stb.mapper.ClienteMapper;
import co.edu.usbcali.stb.repository.ClienteRepository;
import co.edu.usbcali.stb.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService clienteService;
    private final ClienteRepository clienteRepository;   //Inyeccion de dependencias

    public ClienteController(ClienteService clienteService, ClienteRepository clienteRepository){
        this.clienteService = clienteService;
        this.clienteRepository = clienteRepository;
    }
    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador Correcto";
    }
    @GetMapping("/ObtenerTodos")
    public List<Cliente>obtenerTodos(){return clienteRepository.findAll();
    }
    @GetMapping("/porId/{id}")
    public ResponseEntity<ClienteDTO>buscarPorId(@PathVariable Integer id)throws Exception{
        Cliente cliente = clienteRepository.getReferenceById(id);
        ClienteDTO clienteDTO = ClienteMapper.domainToDto(cliente);
        return  new ResponseEntity<>(clienteDTO, HttpStatus.OK);
    }
    @PostMapping("/guardar")
    public ResponseEntity<ClienteDTO>guardarCliente(@RequestBody ClienteDTO clienteDTO)throws Exception{
        ClienteDTO clienteDTO1 = clienteService.guardarNuevaCliente(clienteDTO);

        return new ResponseEntity<>(clienteDTO1,HttpStatus.OK);
    }
}
