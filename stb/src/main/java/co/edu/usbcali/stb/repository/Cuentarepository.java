package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cuentarepository extends JpaRepository<Cuenta,Integer>{

}
