package co.edu.usbcali.stb.repository;

import co.edu.usbcali.stb.domain.Nuevasucursalbancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Nuevasucursalbancariarepository extends JpaRepository<Nuevasucursalbancaria,Integer> {
}
