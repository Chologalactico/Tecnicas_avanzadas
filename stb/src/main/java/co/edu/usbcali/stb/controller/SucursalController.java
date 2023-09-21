package co.edu.usbcali.stb.controller;

import co.edu.usbcali.stb.domain.Sucursal;
import co.edu.usbcali.stb.repository.Sucursalrepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {
    private final Sucursalrepository sucursalrepository;

    public SucursalController(Sucursalrepository sucursalrepository){
        this.sucursalrepository = sucursalrepository;
    }
    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador correcto";
    }
    @GetMapping("/Obtener Todos")
    public List<Sucursal>obtenerTodos(){
        List<Sucursal>sucursals=sucursalrepository.findAll();
        return sucursals;
    }

}
