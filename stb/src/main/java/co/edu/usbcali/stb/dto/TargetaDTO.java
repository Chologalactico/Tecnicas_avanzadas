package co.edu.usbcali.stb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TargetaDTO {

    private Integer idTargeta;
    private String notarjeta;
    private Integer cvctarjeta;
    private Integer sincetarjeta;
    private Integer venctarjeta;
    private Integer idCuenta;



}
