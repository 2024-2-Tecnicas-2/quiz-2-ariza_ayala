package com.mycompany.quiz2;

public abstract class VehiculoBase implements IVehiculo {

    protected String marca;
    protected String modelo;
    protected int velocidadActual;

    public VehiculoBase(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    @Override
    public void acelerar() {
        velocidadActual += 10;
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

    @Override
    public void frenar() {
        velocidadActual -= 10;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");

    }

}
