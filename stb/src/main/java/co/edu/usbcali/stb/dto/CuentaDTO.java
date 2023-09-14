package co.edu.usbcali.stb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CuentaDTO {
    private Integer id;
    private String numcuenta;
    private int saldocuenta;
    private String tipocuenta;
    private String usuariocuenta;
    private String contrcuenta;
    private int limcuenta;
    private int clavecuenta;
    private String idcliente;
    private String idsucursal;

}
