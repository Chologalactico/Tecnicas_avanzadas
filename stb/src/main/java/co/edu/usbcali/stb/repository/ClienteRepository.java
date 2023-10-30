package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

    Optional<Cliente> findClienteByNomCliente(String nombre);
    Optional<Cliente> findClienteByCedulaCliente(String cedula);

}
