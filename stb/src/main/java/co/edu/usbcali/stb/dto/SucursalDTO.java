package co.edu.usbcali.stb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SucursalDTO {

    private Integer idSucursal;
    private String direcsucursal;
    private String nomsucursal;


}
