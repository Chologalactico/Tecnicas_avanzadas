package co.edu.usbcali.stb.service.impl;

import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.domain.Targeta;
import co.edu.usbcali.stb.dto.TargetaDTO;
import co.edu.usbcali.stb.mapper.TargetaMapper;
import co.edu.usbcali.stb.repository.Cuentarepository;
import co.edu.usbcali.stb.repository.Targetarepository;
import co.edu.usbcali.stb.service.TargetaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TargetaServiceimpl implements TargetaService {

private final Targetarepository targetarepository;
private final Cuentarepository cuentarepository;

    public TargetaServiceimpl(Targetarepository targetarepository, Cuentarepository cuentarepository) {
        this.targetarepository = targetarepository;
        this.cuentarepository = cuentarepository;
    }

    @Override
    public TargetaDTO guardarNuevaTargeta(TargetaDTO targetaDTO)throws  Exception{

        //1Paso
        if(targetaDTO == null){
            throw  new Exception("La Targeta es nula");
        }

        if (targetaDTO.getNotarjeta() == null || targetaDTO.getNotarjeta().isBlank()){
            throw new Exception("Numero vacio");
        }

        if (targetaDTO.getCvctarjeta() == null || targetaDTO.getCvctarjeta() == 0){
            throw new Exception("CVC vacio");
        }

        if (targetaDTO.getSincetarjeta() == null || targetaDTO.getSincetarjeta() == 0){
            throw new Exception("Since vacio");
        }

        if(targetaDTO.getVenctarjeta() == null || targetaDTO.getVenctarjeta() == 0){
            throw new Exception("VenceTargeta vacio");
        }
        //FK
            if (targetaDTO.getIdCuenta() == null || targetaDTO.getIdCuenta() == 0){
                throw new Exception("El valor de la cuenta no es valido");
            }

        // Validacion si existe un numero de targeta ya.
        Optional<Targeta> targetaPorNumero = targetarepository.findTargetaByNoTarjeta(targetaDTO.getNotarjeta());
        if(targetaPorNumero.isPresent() ){
            throw new Exception(String.format("La targeta con el numero ya se encuentra registrado",
                    targetaDTO.getNotarjeta()));
        }

        //Validacion FK
        Optional<Cuenta>cuentaOptional = cuentarepository.findById(targetaDTO.getIdCuenta());
        if(cuentaOptional.isEmpty()){
            throw new Exception(String.format("No se pudo registrar la cuenta ya que no existe en la targeta con id: %d"
                    ,targetaDTO.getIdCuenta()));
        }

        //2Paso
        Targeta targeta = TargetaMapper.dtoToDomain(targetaDTO);
        targeta = targetarepository.save(targeta);

        //3Paso
        targetaDTO = TargetaMapper.domainToDto(targeta);

        return targetaDTO;
    }
}
