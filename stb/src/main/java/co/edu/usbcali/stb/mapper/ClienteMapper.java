package co.edu.usbcali.stb.mapper;
import co.edu.usbcali.stb.domain.Cliente;
import co.edu.usbcali.stb.dto.ClienteDTO;
import java.util.List;


public class ClienteMapper {

    //1Metodo-Resivira un dto y lo transforma a un objeto del dominio
    public static Cliente dtoToDomain(ClienteDTO clienteDTO){
        return Cliente.builder()
                .idCliente(clienteDTO.getIdCliente())
                .nomCliente(clienteDTO.getNomCliente())
                .direcCliente(clienteDTO.getDirecCliente())
                .cedulaCliente(clienteDTO.getCedulaCliente())
                .build();
    }
    //2Metodo-Resive el domain y lo transforma en un dto
    public static ClienteDTO domainToDto(Cliente cliente){
        return ClienteDTO.builder()
                .idCliente(cliente.getIdCliente())
                .nomCliente(cliente.getNomCliente())
                .direcCliente(cliente.getDirecCliente())
                .cedulaCliente(cliente.getCedulaCliente())
                .build();
    }
    //retornar una lista de objetos
    public static List<Cliente>dtoToDomainList(List<ClienteDTO>clienteDTOS){
        return clienteDTOS.stream().map(ClienteMapper::dtoToDomain).toList();
    }

    //retorna una lista dto
    public static List<ClienteDTO>domainToDtoList(List<Cliente>cliente){
        return cliente.stream().map(ClienteMapper::domainToDto).toList();
    }
}
