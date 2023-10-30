package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Cliente;
import co.edu.usbcali.stb.domain.Targeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Targetarepository extends JpaRepository<Targeta,Integer> {


    Optional<Targeta> findTargetaByNoTarjeta(String numero);

}
