package co.edu.usbcali.stb.service.impl;

import co.edu.usbcali.stb.domain.Cliente;
import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.domain.Sucursal;
import co.edu.usbcali.stb.dto.CuentaDTO;
import co.edu.usbcali.stb.mapper.CuentaMapper;
import co.edu.usbcali.stb.repository.ClienteRepository;
import co.edu.usbcali.stb.repository.Cuentarepository;
import co.edu.usbcali.stb.repository.Sucursalrepository;
import co.edu.usbcali.stb.service.CuentaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CuentaServiceimpl implements CuentaService {

    private final Cuentarepository cuentarepository;
    private final Sucursalrepository sucursalrepository;
    private final ClienteRepository clienteRepository;

    public CuentaServiceimpl(Cuentarepository cuentarepository, Sucursalrepository sucursalrepository, ClienteRepository clienteRepository) {
        this.cuentarepository = cuentarepository;
        this.sucursalrepository = sucursalrepository;
        this.clienteRepository = clienteRepository;
    }


    @Override
    public CuentaDTO guardarNuevaCuenta(CuentaDTO cuentaDTO) throws Exception {
            //1
        if(cuentaDTO == null){
            throw new Exception("La cuenta es nula");
        }

        if(cuentaDTO.getNumcuenta() == null || cuentaDTO.getNumcuenta().isBlank()   ){
            throw new Exception("Numero vacio");
        }

        if (cuentaDTO.getSaldocuenta() == null || cuentaDTO.getSaldocuenta() == 0){
            throw new Exception("Saldo vacio");
        }

        if(cuentaDTO.getTipocuenta() == null || cuentaDTO.getTipocuenta().isBlank()){
            throw new Exception("Tipo cuenta vacio");
        }

        if (cuentaDTO.getUsercuenta() == null || cuentaDTO.getUsercuenta().isBlank()){
            throw new Exception("User vacio");
        }

        if (cuentaDTO.getContrcuenta() == null || cuentaDTO.getContrcuenta().isBlank()){
            throw new Exception("Contraseña vacia ");
        }

        //Se pone igual a 0 ya que no es tipo String.
        if (cuentaDTO.getLimcuenta() == null || cuentaDTO.getLimcuenta() == 0){
            throw new Exception("Limite cuenta vacio");
        }


        if(cuentaDTO.getClavecuenta() == null || cuentaDTO.getClavecuenta() == 0){
            throw new Exception("Clave dinamica vacia ");
        }

        //Fk
        if (cuentaDTO.getSucursalId() == null || cuentaDTO.getSucursalId() == 0){
            throw new Exception("El valor de la sucursal no es valido");
        }

        if (cuentaDTO.getClienteId() == null || cuentaDTO.getClienteId() == 0){
            throw new Exception("El valor de la cuenta no es valido");
        }

//VALIDACION
        //Validar si existe un numcuenta
        Optional<Cuenta> cedulaPorNumCuenta = cuentarepository.findCuentaByNumCuenta(cuentaDTO.getNumcuenta());
        if(cedulaPorNumCuenta.isPresent() ){
            throw new Exception(String.format("El cliente con el nombre ya se encuentra registrado",
                    cuentaDTO.getNumcuenta()));
        }



        //Validar si existe sucursal _FK
        Optional<Sucursal>sucursalOptional = sucursalrepository.findById(cuentaDTO.getSucursalId());
        if(sucursalOptional.isEmpty()){
            throw new Exception(String.format("No se pudo registrar la cuenta ya que no existe en la sucursal con id: %d"
            ,cuentaDTO.getSucursalId()));
        }

        //Validar si existe cliente _FK
        Optional<Cliente>clienteOptional = clienteRepository.findById(cuentaDTO.getClienteId());
        if(clienteOptional.isEmpty()){
            throw new Exception(String.format("No se pudo registrar la cuenta ya que no existe en la sucursal con id: %d"
                    ,cuentaDTO.getClienteId()));
        }

        //2 Registrar la categoria en db Mapeando desde el DTO hacia el domain
        Cuenta cuenta= CuentaMapper.dtoToDomain(cuentaDTO);
        cuenta = cuentarepository.save(cuenta);
            //3Paso
        cuentaDTO = CuentaMapper.domainToDto(cuenta);
        return cuentaDTO;
    }
}
