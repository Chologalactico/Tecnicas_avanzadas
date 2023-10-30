package co.edu.usbcali.stb.dto;

import co.edu.usbcali.stb.domain.Cuenta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransaccionDTO {

    private Integer idTransaccion;
    private String notransac;
    private Integer montotransac;
    private String destinotrasac;
    private Integer cuentaId;
}
