package co.edu.sena.apiaccesorio.repositorio;

import co.edu.sena.apiaccesorio.entidad.Accesorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccesorioRepositorio extends JpaRepository<Accesorio, Long> {
}
