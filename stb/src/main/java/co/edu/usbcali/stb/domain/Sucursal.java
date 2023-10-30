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
@Table(name = "sucursales")
public class Sucursal {

    @Id
    @Column(nullable = false,name = "idsucursal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSucursal;

    @Column(nullable = false,length = 50,name = "direcsucursal")
    private String direcSucursal;

    @Column(nullable = false,length = 50,name = "nomsucursal")

    private String nomSucursal;
}


