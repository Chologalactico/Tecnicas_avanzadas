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

    @Column(nullable = false,length = 20)
    private String noTarjeta;

    @Column(nullable = false,name = "cvctarjeta",length = 3)
    private int cvcTarjeta;

    @Column(nullable = false,length = 2)
    private int sinceTarjeta;

    @Column(nullable = false,length = 5)
    private int vencTarjeta;

 


}
