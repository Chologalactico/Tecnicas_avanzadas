package co.edu.usbcali.stb.controller;
import co.edu.usbcali.stb.domain.Transaccion;
import co.edu.usbcali.stb.repository.Transaccionrepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {

    private final Transaccionrepository transaccionrepository;

    public TransaccionController(Transaccionrepository transaccionrepository){
        this.transaccionrepository=transaccionrepository;
    }
    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador Correcto";
    }
    @GetMapping("/Obtener Todos")
    public List<Transaccion>obtenerTodos(){
        List<Transaccion>transaccions = transaccionrepository.findAll();
        return transaccions;
    }
}
