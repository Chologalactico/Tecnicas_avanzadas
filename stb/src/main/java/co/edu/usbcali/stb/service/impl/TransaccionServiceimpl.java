package co.edu.usbcali.stb.service.impl;

import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.domain.Transaccion;
import co.edu.usbcali.stb.dto.TransaccionDTO;
import co.edu.usbcali.stb.mapper.TransaccionMapper;
import co.edu.usbcali.stb.repository.Cuentarepository;
import co.edu.usbcali.stb.repository.Transaccionrepository;
import co.edu.usbcali.stb.service.TransaccionService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransaccionServiceimpl implements TransaccionService {

private final Transaccionrepository transaccionrepository;
public final Cuentarepository cuentarepository;


    public TransaccionServiceimpl(Transaccionrepository transaccionrepository, Cuentarepository cuentarepository) {
        this.transaccionrepository = transaccionrepository;
        this.cuentarepository = cuentarepository;
    }

    //1paso
    @Override
    public TransaccionDTO guardarNuevaTransaccion(TransaccionDTO transaccionDTO) throws Exception {
      if(transaccionDTO == null){
          throw new Exception("La Transaccion es nula");
      }

      if(transaccionDTO.getNotransac() == null || transaccionDTO.getNotransac().trim().isBlank()){
          throw new Exception("No_transaccion es vacio");
      }

      if (transaccionDTO.getMontotransac() == null || transaccionDTO.getMontotransac() == 0){
          throw new Exception("MontoTransac es nula");
      }

      if (transaccionDTO.getDestinotrasac() == null || transaccionDTO.getDestinotrasac().isBlank()){
          throw new Exception("DestinoTransac es nula");
      }

        if (transaccionDTO.getCuentaId() == null || transaccionDTO.getCuentaId() == 0){
            throw new Exception("El valor de la transaccion no es valido");
        }

        Optional<Cuenta> cuentaOptional = cuentarepository.findById(transaccionDTO.getCuentaId());
        if(cuentaOptional.isEmpty()){
            throw new Exception(String.format("No se pudo registrar la cuenta ya que no existe en la transaccion con id: %d"
                    ,transaccionDTO.getCuentaId()));
        }



        //2paso
        Transaccion transaccion = TransaccionMapper.dtoToDomain(transaccionDTO);
        transaccion = transaccionrepository.save(transaccion);
        //3paso
        transaccionDTO = TransaccionMapper.domainToDto(transaccion);
        return transaccionDTO;
    }
}
