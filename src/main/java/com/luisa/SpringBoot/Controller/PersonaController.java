package com.luisa.SpringBoot.Controller;

import com.luisa.SpringBoot.Dto.PersonaDTO;
import com.luisa.SpringBoot.Service.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/crear/{id}/{nombre}")
    public PersonaDTO crearPersona(
            @PathVariable int id,
            @PathVariable String nombre) {
        return personaService.crearPersona(id, nombre);
    }

    @GetMapping
    public List<PersonaDTO> listarPersonas() {
        return personaService.listarPersonas();
    }
}
