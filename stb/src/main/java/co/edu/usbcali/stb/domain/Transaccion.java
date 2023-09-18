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

    @Column(nullable = false,length = 20)
    private String noTransac;

    @Column(nullable = false)
    private int montoTransac;

    @Column(nullable = false,length = 20)
    private String destinoTransac;

}
