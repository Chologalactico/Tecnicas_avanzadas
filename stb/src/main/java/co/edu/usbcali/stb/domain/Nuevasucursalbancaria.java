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
@Table(name = "nuevasucursalbancaria")
public class Nuevasucursalbancaria {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,name = "direcsucursal",length = 225)
    private String direcsucursal;

    @Column(nullable = false,name = "pk_idsucursal",length = 20)
    private String idsucursal;

    @Column(nullable = false,name = "nomsucursal",length = 225)
    private String nomsucursal;


}


