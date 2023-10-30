package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sucursalrepository extends JpaRepository<Sucursal,Integer> {
}
