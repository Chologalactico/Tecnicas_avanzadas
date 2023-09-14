package co.edu.usbcali.stb.mapper;

import co.edu.usbcali.stb.domain.Cuenta;
import co.edu.usbcali.stb.domain.Nuevasucursalbancaria;
import co.edu.usbcali.stb.dto.CuentaDTO;
import co.edu.usbcali.stb.dto.NuevasucursalbancariaDTO;

import java.util.List;

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
        return NuevasucursalbancariaDTO.builder()
                .id(nuevasucursalbancaria.getId())
                .direcsucursal(nuevasucursalbancaria.getDirecsucursal())
                .idsucursal(nuevasucursalbancaria.getIdsucursal())
                .nomsucursal(nuevasucursalbancaria.getNomsucursal())
                .build();
    }
   public static List<Nuevasucursalbancaria> dtoToDomainList(List<NuevasucursalbancariaDTO>nuevasucursalbancariaDTOS){
        return nuevasucursalbancariaDTOS.stream().map(NuevasucursalbancariaMapper::dtoToDomain).toList();
   }
   public static List<NuevasucursalbancariaDTO>domainToDtoList(List<Nuevasucursalbancaria>nuevasucursalbancarias){
        return nuevasucursalbancarias.stream().map(NuevasucursalbancariaMapper::domainToDto).toList();
   }
}
