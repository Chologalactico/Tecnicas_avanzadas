package co.edu.usbcali.stb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransaccionDTO {

    private Integer id;
    private String notransac;
    private int montotransac;
    private String destinotrasac;
    private String numcuenta;
}
