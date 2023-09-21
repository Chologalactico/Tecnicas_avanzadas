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
@Table(name = "cuentas")
public class Cuenta {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 20)
    private String numCuenta;

    @Column(nullable = false)
    private Integer saldocuenta;

    @Column(nullable = false,length = 20)
    private String tipoCuenta;

    @Column(nullable = false,length = 20)
    private String userCuenta;

    @Column(nullable = false,length = 20)
    private String contrCuenta;

    @Column(nullable = false,name = " limRetCuenta")
    private int limCuenta;

    @Column(nullable = false,name = "claveRetCuenta",length = 4)
    private int claveCuenta;

    @ManyToOne
    @JoinColumn(name = "idcliente",referencedColumnName = "idcliente",nullable = false)
    private Cuenta cuenta;
   /* @Column(nullable = false,name = "fk_idcliente",length = 20)
    private String idcliente;

    @Column(nullable = false,name = "fk_idsucursal",length = 20)
    private String idsucursal;*/
}
