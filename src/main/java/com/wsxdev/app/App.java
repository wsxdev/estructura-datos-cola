package com.wsxdev.app;

public class App {

    public static void main(String[] args) {
        // SE CREA EL OBJETO "COLA"
        Cola newCola = new Cola();
        System.out.println("| SIMULACIÓN DE ESTRUCTURA DE DATOS: COLAS |");
        // SE ENCOLA LOS SIGUIENTES DATOS
        System.out.println("Encolando '10'");
        newCola.encolar(10);
        System.out.println("Encolando '15'");
        newCola.encolar(15);
        System.out.println("Encolando '20'");
        newCola.encolar(20);
        System.out.println("Encolando '25'");
        newCola.encolar(25);
        System.out.println("Encolando '30'");
        newCola.encolar(30);
        System.out.println("\nDATOS DE LA COLA DESPUÉS DE ENCOLAR: ");
        // SE MUESTRA LOS DATOS GUARDADOS EN LA COLA
        newCola.mostrar();
        
        // SE DESENCOLA DOS DATOS DE LA COLA
        System.out.println("\nDESENCOLANDO 'DOS' DATOS DE LA COLA");
        newCola.desencolar();
        newCola.desencolar();
        
        // MOSTRAR DATOS DE LA COLA ACTUAL
        System.out.println("\nDATOS DE LA COLA DESPUÉS DE DESENCOLAR: ");
        newCola.mostrar();
        
        
    }
}