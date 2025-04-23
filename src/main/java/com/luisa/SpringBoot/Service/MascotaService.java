package com.luisa.SpringBoot.Service;

import com.luisa.SpringBoot.Dto.MascotaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {
    private final List<MascotaDTO> mascotas = new ArrayList<>();
    private final PersonaService personaService;

    public MascotaService(PersonaService personaService) {
        this.personaService = personaService;
    }

    public MascotaDTO crearMascota(int id, String nombre, String raza, int edad, int idPersona) {
        if (!personaService.existePersona(idPersona)) {
            throw new IllegalArgumentException("La persona con id " + idPersona + " no existe.");
        }
        MascotaDTO mascota = new MascotaDTO(id, nombre, raza, edad, idPersona);
        mascotas.add(mascota);
        return mascota;
    }

    public List<MascotaDTO> listarMascotas() {
        return mascotas;
    }

    public Optional<MascotaDTO> consultarMascota(int id) {
        return mascotas.stream().filter(m -> m.getId() == id).findFirst();
    }

    public boolean eliminarMascota(int id) {
        return mascotas.removeIf(m -> m.getId() == id);
    }

    public boolean actualizarMascota(int id, MascotaDTO actualizada) {
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getId() == id) {
                mascotas.set(i, actualizada);
                return true;
            }
        }
        return false;
    }
}
