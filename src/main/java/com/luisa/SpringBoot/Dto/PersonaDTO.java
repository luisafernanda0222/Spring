package com.luisa.SpringBoot.Dto;

public class PersonaDTO {
    private int id;
    private String nombre;

    public PersonaDTO() {}

    public PersonaDTO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    //GETTER SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
