package co.edu.usbcali.stb.controller;


import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.dto.CuentaDTO;
import co.edu.usbcali.stb.mapper.CuentaMapper;
import co.edu.usbcali.stb.repository.CuentaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import co.edu.usbcali.stb.service.CuentaService;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    private final CuentaService cuentaService;
    private final CuentaRepository cuentarepository;

    public  CuentaController(CuentaService cuentaService, CuentaRepository cuentarepository){
        this.cuentaService = cuentaService;
        this.cuentarepository = cuentarepository;
    }
    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador Correcto";
    }

    @GetMapping("/ObtenerTodos")
    public List<Cuenta>obtenerTodos(){return cuentarepository.findAll();
    }
   @GetMapping("porId/{id}")
    public ResponseEntity<CuentaDTO>buscarPorId(@PathVariable Integer id)throws Exception{
        Cuenta cuenta = cuentarepository.getReferenceById(id);
        CuentaDTO cuentaDTO = CuentaMapper.domainToDto(cuenta);

        return new ResponseEntity<>(cuentaDTO, HttpStatus.OK);
   }
    @PostMapping("/guardar")
    public ResponseEntity<CuentaDTO>guardarCuenta(@RequestBody CuentaDTO cuentaDTO)throws Exception{
            CuentaDTO cuentaDTO1 = cuentaService.guardarNuevaCuenta(cuentaDTO);

        return new ResponseEntity<>(cuentaDTO1,HttpStatus.OK);
    }
}