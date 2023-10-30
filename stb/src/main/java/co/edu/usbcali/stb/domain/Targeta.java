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
@Table(name = "tarjeta")
public class Targeta {
    @Id
    @Column(nullable = false,name = "Idtargeta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTargeta;

    @Column(nullable = false,length = 20,name = "notarjeta")
    private String noTarjeta;

    @Column(nullable = false,name = "cvctarjeta",length = 3)
    private Integer cvcTarjeta;

    @Column(nullable = false,length = 2,name = "sincetargeta")
    private Integer sinceTarjeta;

    @Column(nullable = false,length = 5,name = "vencetarjeta")
    private Integer vencTarjeta;

    @ManyToOne
    @JoinColumn(name = "idcuenta", referencedColumnName = "idcuenta", nullable = false)
    private Cuenta cuenta;

}
