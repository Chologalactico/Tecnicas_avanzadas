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
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,name = "pk_notarjeta",length = 20)
    private String notarjeta;

    @Column(nullable = false,name = "cvctarjeta",length = 4)
    private int cvctarjeta;

    @Column(nullable = false,name = "sincetarjeta",length = 4)
    private int sincetarjeta;

    @Column(nullable = false,name = "vencetarjeta",length = 7)
    private int venctarjeta;

    @Column(nullable = false,name = "fk_numcuenta",length = 20)
    private int numcuenta;


}
