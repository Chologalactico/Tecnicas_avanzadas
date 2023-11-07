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
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(nullable = false, name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(nullable = false,length = 50, name = "nomcliente")
    private String nomCliente;

    @Column(nullable = false,length = 50,name = "direccliente")
    private String direcCliente;

    @Column(nullable = false,length = 20,name = "cedulacliente")
    private String cedulaCliente;



}
