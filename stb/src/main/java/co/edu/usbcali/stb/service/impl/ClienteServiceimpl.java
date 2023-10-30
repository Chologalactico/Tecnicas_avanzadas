package co.edu.usbcali.stb.service.impl;


import co.edu.usbcali.stb.domain.Cliente;
import co.edu.usbcali.stb.dto.ClienteDTO;
import co.edu.usbcali.stb.mapper.ClienteMapper;
import co.edu.usbcali.stb.repository.ClienteRepository;
import co.edu.usbcali.stb.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceimpl implements ClienteService{

    private  final ClienteRepository clienteRepository;

    public ClienteServiceimpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @Override
    public ClienteDTO guardarNuevaCliente(ClienteDTO clienteDTO) throws Exception {
        //1 Validar los datos de la categoria
        if  (clienteDTO == null){
            throw new Exception("La categoria es nula ");
        }
        if  (clienteDTO.getNomCliente() == null || clienteDTO.getNomCliente().isBlank()){
            throw new Exception("Nombre vacio");
        }
        if  (clienteDTO.getCedulaCliente() == null || clienteDTO.getCedulaCliente().isBlank()){
            throw new Exception("Cedula vacio");
        }
        if  (clienteDTO.getDirecCliente() == null || clienteDTO.getDirecCliente().isBlank()){
            throw new Exception("Direccion vacio");
        }

//VALIDACIONES
        //Validar que no exista una cliente con ese nombre
        Optional<Cliente> clientePorNombre = clienteRepository.findClienteByNomCliente(clienteDTO.getNomCliente());
        if(clientePorNombre.isPresent() ){
            throw new Exception(String.format("El cliente con el nombre ya se encuentra registrado",
                    clienteDTO.getNomCliente()));
        }

        //Validar que no existe una cliente con esa cedula
        Optional<Cliente> clientePorCedula = clienteRepository.findClienteByCedulaCliente(clienteDTO.getCedulaCliente());
        if(clientePorCedula.isPresent() ){
            throw new Exception(String.format("El cliente con la  cedula ya se encuentra registrada.",
                    clienteDTO.getCedulaCliente()));
        }



        //2 Registrar la categoria en db Mapeando desde el DTO hacia el domain
        Cliente cliente= ClienteMapper.dtoToDomain(clienteDTO);
        cliente = clienteRepository.save(cliente);
        //3 Retornar la mapeando el DTO
        clienteDTO = ClienteMapper.domainToDto(cliente);
        return clienteDTO;
    }
}
