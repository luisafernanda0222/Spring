package com.luisa.SpringBoot.Dto;

public class MascotaDTO {
    private int id;
    private String nombre;
    private String raza;
    private int edad;
    private int idPersona;

    public MascotaDTO() {}

    public MascotaDTO(int id, String nombre, String raza, int edad, int idPersona) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.idPersona = idPersona;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
}
