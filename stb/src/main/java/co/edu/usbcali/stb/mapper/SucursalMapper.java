package co.edu.usbcali.stb.mapper;

import co.edu.usbcali.stb.domain.Sucursal;
import co.edu.usbcali.stb.dto.SucursalDTO;

import java.util.List;

public class SucursalMapper {

    public static Sucursal dtoToDomain(SucursalDTO sucursalDTO){
        return Sucursal.builder()
                .idSucursal(sucursalDTO.getIdSucursal())
                .direcSucursal(sucursalDTO.getDirecsucursal())
                .nomSucursal(sucursalDTO.getNomsucursal())
                .build();
    }

    public static SucursalDTO domainToDto(Sucursal  sucursal){
        return SucursalDTO.builder()
                .idSucursal(sucursal.getIdSucursal())
                .direcsucursal(sucursal.getDirecSucursal())
                .nomsucursal(sucursal.getNomSucursal())
                .build();
    }
   public static List<Sucursal> dtoToDomainList(List<SucursalDTO>sucursalDTOS){
        return sucursalDTOS.stream().map(SucursalMapper::dtoToDomain).toList();
   }
   public static List<SucursalDTO>domainToDtoList(List<Sucursal>sucursals){
        return sucursals.stream().map(SucursalMapper::domainToDto).toList();
   }
}
