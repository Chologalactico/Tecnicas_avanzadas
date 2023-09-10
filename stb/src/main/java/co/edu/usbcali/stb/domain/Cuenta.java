package co.edu.usbcali.stb.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cuenta")
public class Cuenta {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,name = "pk_numcuenta",length = 20)
    private String numcuenta;

    @Column(nullable = false,name = "saldocuenta")
    private int saldocuenta;

    @Column(nullable = false,name = "tipocuenta",length = 225)
    private String tipocuenta;

    @Column(nullable = false,name = "usuariocuenta",length = 225)
    private String usuariocuenta;

    @Column(nullable = false,name="contrcuenta",length = 225)
    private String contrcuenta;

    @Column(nullable = false,name = "limcuenta")
    private int limcuenta;

    @Column(nullable = false,name = "claveretcuenta")
    private int clavecuenta;

    @Column(nullable = false,name = "fk_idcliente",length = 20)
    private String idcliente;

    @Column(nullable = false,name = "fk_idsucursal",length = 20)
    private String idsucursal;
}
