package co.edu.usbcali.stb.mapper;
import co.edu.usbcali.stb.domain.Transaccion;
import co.edu.usbcali.stb.dto.TransaccionDTO;
import java.util.List;

public class TransaccionMapper {

    public static Transaccion dtoToDomain(TransaccionDTO transaccionDTO){
        return Transaccion.builder()
                .idTransaccion(transaccionDTO.getIdTransaccion())
                .destinoTransac(transaccionDTO.getDestinotrasac())
                .montoTransac(transaccionDTO.getMontotransac())
                .noTransac(transaccionDTO.getNotransac())
                .build();
    }

    public static TransaccionDTO domainToDto(Transaccion transaccion){
        return TransaccionDTO.builder()
                .idTransaccion(transaccion.getIdTransaccion())
                .destinotrasac(transaccion.getDestinoTransac())
                .montotransac(transaccion.getMontoTransac())
                .notransac(transaccion.getNoTransac())
                .cuentaId((transaccion.getCuenta()== null)? null:
                    transaccion.getCuenta().getIdCuenta())
                .build();
    }
    public static List<Transaccion>dtoToDomainList(List<TransaccionDTO>transaccionDTOS){
        return transaccionDTOS.stream().map(TransaccionMapper::dtoToDomain).toList();
    }
    public static List<TransaccionDTO>domainToDtoList(List<Transaccion>transaccions){
        return  transaccions.stream().map(TransaccionMapper::domainToDto).toList();
    }
}
