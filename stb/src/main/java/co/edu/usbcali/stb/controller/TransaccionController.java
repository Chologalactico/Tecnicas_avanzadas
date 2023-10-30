package co.edu.usbcali.stb.controller;
import co.edu.usbcali.stb.domain.Transaccion;
import co.edu.usbcali.stb.dto.TargetaDTO;
import co.edu.usbcali.stb.dto.TransaccionDTO;
import co.edu.usbcali.stb.mapper.TransaccionMapper;
import co.edu.usbcali.stb.repository.Transaccionrepository;
import co.edu.usbcali.stb.service.TransaccionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

    private final Transaccionrepository transaccionrepository;
    private final TransaccionService transaccionService;

    public TransaccionController(Transaccionrepository transaccionrepository, TransaccionService transaccionService){
        this.transaccionrepository=transaccionrepository;
        this.transaccionService = transaccionService;
    }


    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador Correcto";
    }


    @GetMapping("/Obtener Todos")
    public List<Transaccion>obtenerTodos(){
        List<Transaccion>transaccion = transaccionrepository.findAll();
        return transaccion;
    }


    @GetMapping("/porId/{id}")
    public ResponseEntity<TransaccionDTO> buscarPorId(@PathVariable Integer id)throws Exception{
        Transaccion transaccion = transaccionrepository.getReferenceById(id);

        TransaccionDTO transaccionDTO = TransaccionMapper.domainToDto(transaccion);

        return  new ResponseEntity<>(transaccionDTO, HttpStatus.OK);
    }


    @PostMapping("/guardar")
    public ResponseEntity<TransaccionDTO>guardarTransaccion(@RequestBody TransaccionDTO transaccionDTO)throws Exception{
        TransaccionDTO transaccionDTO1 = transaccionService.guardarNuevaTransaccion(transaccionDTO);
        return new ResponseEntity<>(transaccionDTO1,HttpStatus.OK);
    }
}
