package com.mycompany.quiz2;

public class Principal {

    public static void main(String[] args) {
        // Crear instancias de Coche y Lancha
        Coche coche = new Coche("Toyota", "Corolla", TipoCombustible.GASOLINA);
        Lancha lancha = new Lancha("Yamaha", "242X", TipoCombustible.ELECTRICO);

        // Acelerar y frenar el coche
        System.out.println("Coche:");
        coche.acelerar();
        coche.frenar();
        System.out.println("Tipo de combustible: " + coche.tipoCombustible());

        // Acelerar y frenar la lancha
        System.out.println("\nLancha:");
        lancha.acelerar();
        lancha.frenar();
        System.out.println("Tipo de combustible: " + lancha.tipoCombustible());
    }
}
