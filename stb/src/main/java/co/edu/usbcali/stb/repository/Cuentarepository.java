package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Cliente;
import co.edu.usbcali.stb.domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Cuentarepository extends JpaRepository<Cuenta,Integer>{

    Optional<Cuenta> findCuentaByNumCuenta(String numCuenta);
}
