package co.edu.usbcali.stb.mapper;

import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.domain.Targeta;
import co.edu.usbcali.stb.dto.CuentaDTO;
import co.edu.usbcali.stb.dto.TargetaDTO;

import java.util.List;

public class TargetaMapper {

    public static Targeta dtoToDomain(TargetaDTO targetaDTO){
        return Targeta.builder()
                .idTargeta(targetaDTO.getIdTargeta())
                .noTarjeta(targetaDTO.getNotarjeta())
                .cvcTarjeta(targetaDTO.getCvctarjeta())
                .sinceTarjeta(targetaDTO.getSincetarjeta())
                .vencTarjeta(targetaDTO.getVenctarjeta())
                .build();

    }
    public static TargetaDTO domainToDto(Targeta targeta){
        return TargetaDTO.builder()
                .idTargeta(targeta.getIdTargeta())
                .notarjeta(targeta.getNoTarjeta())
                .cvctarjeta(targeta.getCvcTarjeta())
                .sincetarjeta(targeta.getSinceTarjeta())
                .venctarjeta(targeta.getVencTarjeta())
                .idCuenta((targeta.getCuenta() == null)? null:
                        targeta.getCuenta().getIdCuenta())
                .build();
    }
    public static List<Targeta>dtoToDomainList(List<TargetaDTO>targetaDTOS){
        return targetaDTOS.stream().map(TargetaMapper::dtoToDomain).toList();
    }
    public static List<TargetaDTO>DomainToDtoList(List<Targeta>targetas){
        return  targetas.stream().map(TargetaMapper::domainToDto).toList();

    }


}
