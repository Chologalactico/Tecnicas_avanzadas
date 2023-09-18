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

    private Integer id;
    private String notarjeta;
    private int cvctarjeta;
    private int sincetarjeta;
    private int venctarjeta;



}
