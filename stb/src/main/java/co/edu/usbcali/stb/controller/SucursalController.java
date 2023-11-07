package co.edu.usbcali.stb.controller;

import co.edu.usbcali.stb.domain.Sucursal;
import co.edu.usbcali.stb.dto.SucursalDTO;
import co.edu.usbcali.stb.mapper.SucursalMapper;
import co.edu.usbcali.stb.repository.SucursalRepository;
import co.edu.usbcali.stb.service.SucursalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursal")


public class SucursalController {
    private final SucursalRepository sucursalrepository;
    private final SucursalService sucursalService;

    public SucursalController(SucursalRepository sucursalrepository, SucursalService sucursalService){
        this.sucursalrepository = sucursalrepository;
        this.sucursalService = sucursalService;
    }



    @GetMapping("/Validar")
    public String validarController(){
        return "Controlador correcto";
    }
    @GetMapping("/Obtener Todos")
    public List<Sucursal>obtenerTodos(){
        return sucursalrepository.findAll();
    }



    @GetMapping("/porId/{id}")
    public ResponseEntity<SucursalDTO>buscarPorId(@PathVariable Integer id)throws Exception{
    Sucursal sucursal = sucursalrepository.getReferenceById(id);

    SucursalDTO sucursalDTO = SucursalMapper.domainToDto(sucursal);

   return new ResponseEntity<>(sucursalDTO, HttpStatus.OK);
}


    @PostMapping("/guardar")
    public ResponseEntity<SucursalDTO>guardarSucursal(@RequestBody SucursalDTO sucursalDTO)throws Exception{
        SucursalDTO sucursalDTO1 = sucursalService.guardarNuevaSucursal(sucursalDTO);

        return new ResponseEntity<>(sucursalDTO1,HttpStatus.OK);
    }


}
