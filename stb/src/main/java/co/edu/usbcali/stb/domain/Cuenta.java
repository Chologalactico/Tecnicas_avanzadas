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
    @Column(nullable = false,name = "idcuenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCuenta;

    @Column(nullable = false,length = 20,name = "numcuenta")
    private String numCuenta;

    @Column(nullable = false,name = "saldocuenta")
    private Integer saldocuenta;

    @Column(nullable = false,length = 20,name = "tipocuenta")
    private String tipoCuenta;

    @Column(nullable = false,length = 20,name = "usercuenta")
    private String userCuenta;

    @Column(nullable = false,length = 20,name = "contrcuenta")
    private String contrCuenta;

    @Column(nullable = false,name = "limretcuenta")
    private Integer limCuenta;

    @Column(nullable = false,name = "claveretcuenta",length = 4)
    private Integer claveCuenta;

    @ManyToOne
    @JoinColumn(name = "idsucursal",referencedColumnName = "idsucursal",nullable = false)
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "idcliente",referencedColumnName = "idcliente", nullable = false)
    private Cliente cliente;

}
