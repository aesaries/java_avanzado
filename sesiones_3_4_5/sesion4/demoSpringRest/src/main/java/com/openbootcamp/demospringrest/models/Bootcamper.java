package com.openbootcamp.demospringrest.models;

public class Bootcamper {
    private String nombre;
    private int edad;
    public String pais;

    public Bootcamper() {}

    public Bootcamper(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
