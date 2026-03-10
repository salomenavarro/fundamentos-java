package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicito() {
        int entero = 100;
        double decimal = entero; // Widening
        System.out.println("Implicito (int a double): " + decimal);
    }

    public static void demostrarCastingExplicito() {
        double decimal = 9.78;
        int entero = (int) decimal; // Narrowing
        System.out.println("Explicito (double a int): " + entero);
    }

    public static void demostrarProblemasDePrecision() {
        long numeroGrande = 123456789012345L;
        int truncado = (int) numeroGrande;
        System.out.println("Pérdida de precisión: " + truncado);
    }
}