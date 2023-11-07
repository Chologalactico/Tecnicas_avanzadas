package co.edu.usbcali.stb.controller;

import co.edu.usbcali.stb.domain.Targeta;
import co.edu.usbcali.stb.dto.TargetaDTO;
import co.edu.usbcali.stb.mapper.TargetaMapper;
import co.edu.usbcali.stb.repository.TargetaRepository;
import co.edu.usbcali.stb.service.TargetaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/targeta")


public class TargetaController {
    private final TargetaRepository targetarepository;
    private  final TargetaService targetaService;

    public TargetaController(TargetaRepository targetarepository, TargetaService targetaService){
        this.targetarepository = targetarepository;
        this.targetaService = targetaService;
    }
    @GetMapping("/Validar")

    public String validarController(){
        return "Controlador Correcto";
    }


    @GetMapping("/ObtenerTodos")

    public List<Targeta>obtenerTodos(){
        return targetarepository.findAll();
    }


    @GetMapping("/porId/{id}")

    public ResponseEntity<TargetaDTO> buscarPorId(@PathVariable Integer id)throws Exception{
        Targeta targeta = targetarepository.getReferenceById(id);
        TargetaDTO targetaDTO = TargetaMapper.domainToDto(targeta);
        return  new ResponseEntity<>(targetaDTO, HttpStatus.OK);
    }



    @PostMapping("/guardar")
    public ResponseEntity<TargetaDTO>guardarTargeta(@RequestBody TargetaDTO targetaDTO)throws Exception{
        TargetaDTO targetaDTO1  = targetaService.guardarNuevaTargeta(targetaDTO);

        return new ResponseEntity<>(targetaDTO1,HttpStatus.OK);
    }


}
