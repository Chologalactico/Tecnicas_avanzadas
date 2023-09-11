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
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "nomcliente",length = 225)
    private String nomCliente;

    @Column(nullable = false, name = "pk_idCliente",length = 20)
    private String idCliente;

    @Column(nullable = false,name ="dicreccliente",length = 225)
    private String direcCliente;

}
