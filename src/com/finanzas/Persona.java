package com.finanzas;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarPersona(){
        System.out.println("Persona: " + nombre);
    }
}
