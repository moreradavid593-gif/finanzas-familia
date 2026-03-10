package com.finanzas;

public class Gasto {
    private String descripcion;
    private double monto;

    public Gasto(String descripcion, double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public double getMonto(){
        return monto;
    }
}
