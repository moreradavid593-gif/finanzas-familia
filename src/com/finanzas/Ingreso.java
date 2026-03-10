package com.finanzas;

public class Ingreso {
    private String descripcion;
    private double monto;

    public Ingreso(String descripcion, double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public double getMonto(){
        return monto;
    }
}
