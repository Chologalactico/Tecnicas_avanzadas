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
@Table(name = "transaccion")
public class Transaccion {

    @Id
    @Column(nullable = false,name = "idtransac")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTransaccion ;

    @Column(nullable = false,length = 20,name = "notransac")
    private String noTransac;

    @Column(nullable = false,name = "montotransac")
    private Integer montoTransac;

    @Column(nullable = false,length = 20,name = "destinotransac")
    private String destinoTransac;

    @ManyToOne
    @JoinColumn(name = "idcuenta", referencedColumnName = "idcuenta", nullable = false)
    private Cuenta cuenta;

}
