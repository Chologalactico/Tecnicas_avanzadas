package co.edu.usbcali.stb.service;
import co.edu.usbcali.stb.dto.TransaccionDTO;

public interface TransaccionService {

    public TransaccionDTO guardarNuevaTransaccion(TransaccionDTO transaccionDTO) throws Exception;

}
