package co.edu.usbcali.stb.mapper;

import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.dto.CuentaDTO;

import java.util.List;

public class Cuentamapper {

    //Metodo1
    public static Cuenta dtoToDomain(CuentaDTO cuentaDTO){
        return Cuenta.builder()
                .id(cuentaDTO.getId())
                .numcuenta(cuentaDTO.getNumcuenta())
                .saldocuenta((cuentaDTO.getSaldocuenta()))
                .tipocuenta(cuentaDTO.getTipocuenta())
                .usuariocuenta(cuentaDTO.getUsuariocuenta())
                .contrcuenta(cuentaDTO.getContrcuenta())
                .limcuenta(cuentaDTO.getLimcuenta())
                .clavecuenta(cuentaDTO.getClavecuenta())
                .idcliente(cuentaDTO.getIdcliente())
                .idsucursal((cuentaDTO.getIdsucursal()))
                .build();

    }

    //Meotodo2
    public static CuentaDTO domainToDto(Cuenta cuenta){
        return CuentaDTO.builder()
                .id(cuenta.getId())
                .numcuenta(cuenta.getNumcuenta())
                .saldocuenta((cuenta.getSaldocuenta()))
                .tipocuenta(cuenta.getTipocuenta())
                .usuariocuenta(cuenta.getUsuariocuenta())
                .contrcuenta(cuenta.getContrcuenta())
                .limcuenta(cuenta.getLimcuenta())
                .clavecuenta(cuenta.getClavecuenta())
                .idcliente(cuenta.getIdcliente())
                .idsucursal((cuenta.getIdsucursal()))
                .build();
    }
    public static List<Cuenta>dtoToDomainList(List<CuentaDTO>cuentaDTOS){
        return cuentaDTOS.stream().map(Cuentamapper::dtoToDomain).toList();
    }
    public static List<CuentaDTO>domainToDtoList(List<Cuenta>cuenta){
        return cuenta.stream().map(Cuentamapper::domainToDto).toList();
    }
}
