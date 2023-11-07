package co.edu.usbcali.stb.mapper;

import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.dto.CuentaDTO;

import java.util.List;

public class CuentaMapper {

    //Metodo1
    public static Cuenta dtoToDomain(CuentaDTO cuentaDTO){
        return Cuenta.builder()
                .idCuenta(cuentaDTO.getIdCuenta())
                .numCuenta(cuentaDTO.getNumcuenta())
                .saldocuenta((cuentaDTO.getSaldocuenta()))
                .tipoCuenta(cuentaDTO.getTipocuenta())
                .userCuenta(cuentaDTO.getUsercuenta())
                .contrCuenta(cuentaDTO.getContrcuenta())
                .limCuenta(cuentaDTO.getLimcuenta())
                .claveCuenta(cuentaDTO.getClavecuenta())

                .build();

    }

    //Meotodo2
    public static CuentaDTO domainToDto(Cuenta cuenta){
        return CuentaDTO.builder()
                .idCuenta(cuenta.getIdCuenta())
                .numcuenta(cuenta.getNumCuenta())
                .saldocuenta((cuenta.getSaldocuenta()))
                .tipocuenta(cuenta.getTipoCuenta())
                .usercuenta(cuenta.getUserCuenta())
                .contrcuenta(cuenta.getContrCuenta())
                .limcuenta(cuenta.getLimCuenta())
                .clavecuenta(cuenta.getClaveCuenta())
                .sucursalId((cuenta.getSucursal()== null)? null:
                        cuenta.getSucursal().getIdSucursal())
                .clienteId((cuenta.getCliente()==null)? null:
                        cuenta.getCliente().getIdCliente())
                .build();
    }
    public static List<Cuenta>dtoToDomainList(List<CuentaDTO>cuentaDTOS){
        return cuentaDTOS.stream().map(CuentaMapper::dtoToDomain).toList();
    }
    public static List<CuentaDTO>domainToDtoList(List<Cuenta>cuenta){
        return cuenta.stream().map(CuentaMapper::domainToDto).toList();
    }
}
