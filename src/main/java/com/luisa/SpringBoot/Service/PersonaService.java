package com.luisa.SpringBoot.Service;

import com.luisa.SpringBoot.Dto.PersonaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    private final List<PersonaDTO> personas = new ArrayList<>();

    public PersonaDTO crearPersona(int id, String nombre) {
        PersonaDTO persona = new PersonaDTO(id, nombre);
        personas.add(persona);
        return persona;
    }

    public List<PersonaDTO> listarPersonas() {
        return personas;
    }

    public boolean existePersona(int id) {
        return personas.stream().anyMatch(p -> p.getId() == id);
    }
}
