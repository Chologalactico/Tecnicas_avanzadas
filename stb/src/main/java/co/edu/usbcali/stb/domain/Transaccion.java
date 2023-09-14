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
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,name = "pk_notransac",length = 20)
    private String notransac;

    @Column(nullable = false,name = "montotransac")
    private int montotransac;

    @Column(nullable = false,name = "destinotransac",length = 20)
    private String destinotransac;

    @Column(nullable = false,name = "pk_numcuenta",length = 20)
    private String numcuenta;
}
