package co.edu.usbcali.stb.controller;


import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.repository.Cuentarepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    private final Cuentarepository cuentarepository;

    public  CuentaController(Cuentarepository cuentarepository){
        this.cuentarepository = cuentarepository;
    }
    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador Correcto";
    }
    @GetMapping("/ObtenerTodos")
    public List<Cuenta>obtenerTodos(){
        List<Cuenta>cuentas = cuentarepository.findAll();
        return cuentas;
    }



}
