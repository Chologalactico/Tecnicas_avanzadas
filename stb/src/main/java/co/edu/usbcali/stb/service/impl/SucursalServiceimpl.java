package co.edu.usbcali.stb.service.impl;

import co.edu.usbcali.stb.domain.Sucursal;
import co.edu.usbcali.stb.dto.SucursalDTO;
import co.edu.usbcali.stb.mapper.SucursalMapper;
import co.edu.usbcali.stb.repository.Sucursalrepository;
import co.edu.usbcali.stb.service.SucursalService;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class SucursalServiceimpl implements SucursalService {


    private  final Sucursalrepository sucursalrepository;


    public SucursalServiceimpl(Sucursalrepository sucursalrepository) {
        this.sucursalrepository = sucursalrepository;
    }

    @Override
    public SucursalDTO guardarNuevaSucursal(SucursalDTO sucursalDTO) throws Exception {

        //1Paso
        if (sucursalDTO == null) {
            throw new Exception("La Sucursal es nula");
        }
        if (sucursalDTO.getNomsucursal() == null || sucursalDTO.getNomsucursal().isBlank()) {
            throw new Exception("Nombre vacio");
        }

        if(sucursalDTO.getDirecsucursal() == null || sucursalDTO.getDirecsucursal().isBlank()){
            throw new Exception("Direccion vacio");
        }

        //2 paso
        Sucursal sucursal = SucursalMapper.dtoToDomain(sucursalDTO);
        sucursal = sucursalrepository.save(sucursal);

        //3paso
        sucursalDTO = SucursalMapper.domainToDto(sucursal);
        return sucursalDTO;
    }
}
