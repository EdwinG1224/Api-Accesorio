package co.edu.sena.apiaccesorio.controlador;

import co.edu.sena.apiaccesorio.entidad.Accesorio;
import co.edu.sena.apiaccesorio.servicio.AccesorioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accesorio")
public class AccesorioControlador {
    @Autowired
    private AccesorioServicio accesorioServicio;

    @PostMapping
    public Accesorio guardarAccesorio(@RequestBody Accesorio accesorio) {
        return accesorioServicio.guardarAccesorio(accesorio);
    }

    @GetMapping
    public Accesorio obtenerAccesorio() {
        Accesorio accesorio = new Accesorio(1L, "prueba", "prueba");
        return accesorio;
    }
}
