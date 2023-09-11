package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Transaccionrepository extends JpaRepository<Transaccion,Integer> {
}
