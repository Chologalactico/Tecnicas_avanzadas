package co.edu.usbcali.stb.mapper;

import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.domain.Transaccion;
import co.edu.usbcali.stb.dto.CuentaDTO;
import co.edu.usbcali.stb.dto.TransaccionDTO;

import java.util.List;

public class TransaccionMapper {

    public static Transaccion dtoToDomain(TransaccionDTO transaccionDTO){
        return Transaccion.builder()
                .id(transaccionDTO.getId())
                .destinotransac(transaccionDTO.getDestinotrasac())
                .montotransac(transaccionDTO.getMontotransac())
                .notransac(transaccionDTO.getNotransac())
                .numcuenta(transaccionDTO.getNumcuenta())
                .build();
    }

    public static TransaccionDTO domainToDto(Transaccion transaccion){
        return TransaccionDTO.builder()
                .id(transaccion.getId())
                .destinotrasac(transaccion.getDestinotransac())
                .montotransac(transaccion.getMontotransac())
                .notransac(transaccion.getNotransac())
                .numcuenta(transaccion.getNumcuenta())
                .build();
    }
    public static List<Transaccion>dtoToDomainList(List<TransaccionDTO>transaccionDTOS){
        return transaccionDTOS.stream().map(TransaccionMapper::dtoToDomain).toList();
    }
    public static List<TransaccionDTO>domainToDtoList(List<Transaccion>transaccions){
        return  transaccions.stream().map(TransaccionMapper::domainToDto).toList();
    }
}
