package co.edu.usbcali.stb.mapper;

import co.edu.usbcali.stb.domain.Nuevasucursalbancaria;
import co.edu.usbcali.stb.dto.NuevasucursalbancariaDTO;

public class NuevasucursalbancariaMapper {

    public static Nuevasucursalbancaria dtoToDomain(NuevasucursalbancariaDTO nuevasucursalbancariaDTO){
        return Nuevasucursalbancaria.builder()
                .id(nuevasucursalbancariaDTO.getId())
                .direcsucursal(nuevasucursalbancariaDTO.getDirecsucursal())
                .idsucursal(nuevasucursalbancariaDTO.getIdsucursal())
                .nomsucursal(nuevasucursalbancariaDTO.getNomsucursal())
                .build();
    }

    public static NuevasucursalbancariaDTO domainToDto(Nuevasucursalbancaria nuevasucursalbancaria){
        
    }
}
