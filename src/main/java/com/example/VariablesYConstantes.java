package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {
        int edad = 25;
        double precio = 19.99;
        System.out.println("Edad: " + edad + ", Precio: " + precio);
    }

    public static void demostrarConvencionesNombres() {
        int miVariableEnCamelCase = 10;
        String nombreUsuario = "JavaDev";
        System.out.println("Nombres sugeridos: " + miVariableEnCamelCase + ", " + nombreUsuario);
    }

    public static void demostrarConstantes() {
        final double PI = 3.14159;
        final int MAX_USUARIOS = 100;
        System.out.println("Constantes: PI=" + PI + ", Max=" + MAX_USUARIOS);
    }
}