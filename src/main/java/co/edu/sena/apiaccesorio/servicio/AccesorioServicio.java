package co.edu.sena.apiaccesorio.servicio;

import co.edu.sena.apiaccesorio.entidad.Accesorio;
import co.edu.sena.apiaccesorio.repositorio.AccesorioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccesorioServicio {

    // Realizamos un crud para los accesorios
    @Autowired
    private AccesorioRepositorio accesorioRepositorio;
    public Accesorio guardarAccesorio(Accesorio accesorio) {
        return accesorioRepositorio.save(accesorio);
    }
}
