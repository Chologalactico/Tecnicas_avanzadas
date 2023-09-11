package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clienterepository extends JpaRepository<Cliente,Integer> {
}
