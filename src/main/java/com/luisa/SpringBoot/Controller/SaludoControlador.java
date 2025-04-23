package com.luisa.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoControlador {

    @GetMapping("/saludo")
    public String saludar() {
        return "¡Hola, Luisa desde Spring Boot!";
    }
    @GetMapping("/saludame")
    public String saludarme(@RequestParam(value="nombre", defaultValue = "Bienvenid@") String nombre) {
        return "Hola"+nombre+"este es un ejemplo";
    }
}
