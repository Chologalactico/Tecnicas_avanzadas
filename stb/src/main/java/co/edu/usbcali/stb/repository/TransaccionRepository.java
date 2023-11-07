package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TransaccionRepository extends JpaRepository<Transaccion,Integer> {
}
