package co.edu.usbcali.stb.dto;

import co.edu.usbcali.stb.domain.Cliente;
import co.edu.usbcali.stb.domain.Sucursal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CuentaDTO {
    private Integer idCuenta;
    private String numcuenta;
    private Integer saldocuenta;
    private String tipocuenta;
    private String usercuenta;
    private String contrcuenta;
    private Integer limcuenta;
    private Integer clavecuenta;
    private Integer sucursalId;
    private Integer clienteId;
}
