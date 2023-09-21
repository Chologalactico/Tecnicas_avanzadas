package co.edu.usbcali.stb.controller;

import co.edu.usbcali.stb.domain.Targeta;
import co.edu.usbcali.stb.repository.Targetarepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/targeta")

public class TargetaController {
    private final Targetarepository targetarepository;

    public TargetaController(Targetarepository targetarepository){
        this.targetarepository = targetarepository;
    }
    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador Correcto";
    }
    @GetMapping("/ObtenerTodos")
    public List<Targeta>obtenerTodos(){
        List<Targeta>targetas =targetarepository.findAll();
        return targetas;
    }
}
