package com.luisa.SpringBoot.Controller;

import com.luisa.SpringBoot.Dto.MascotaDTO;
import com.luisa.SpringBoot.Service.MascotaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping("/crear/{id}/{nombre}/{raza}/{edad}/{idPersona}")

    public MascotaDTO crearMascota(
            @PathVariable int id,
            @PathVariable String nombre,
            @PathVariable String raza,
            @PathVariable int edad,
            @PathVariable int idPersona) {
        return mascotaService.crearMascota(id, nombre, raza, edad, idPersona);
    }

    @GetMapping
    public List<MascotaDTO> listarMascotas() {
        return mascotaService.listarMascotas();
    }

    @GetMapping("/{id}")
    public Optional<MascotaDTO> consultarMascota(@PathVariable int id) {
        return mascotaService.consultarMascota(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarMascota(@PathVariable int id) {
        boolean eliminado = mascotaService.eliminarMascota(id);
        return eliminado ? "Mascota eliminada." : "Mascota no encontrada.";
    }

    @PutMapping("/{id}")
    public String actualizarMascota(@PathVariable int id, @RequestBody MascotaDTO mascota) {
        boolean actualizado = mascotaService.actualizarMascota(id, mascota);
        return actualizado ? "Mascota actualizada." : "Mascota no encontrada.";
    }
}
