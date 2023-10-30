package co.edu.usbcali.stb.service;

import co.edu.usbcali.stb.dto.ClienteDTO;

public interface ClienteService {
    
    ClienteDTO guardarNuevaCliente(ClienteDTO clienteDTO)throws Exception;
}
