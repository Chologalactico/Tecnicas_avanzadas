package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Targeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Targetarepository extends JpaRepository<Targeta,Integer> {
}
