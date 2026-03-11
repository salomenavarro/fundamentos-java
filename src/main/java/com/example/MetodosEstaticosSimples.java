package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
        System.out.println("Método estático simple ejecutado con éxito.");
    }

    public static void ejemploPasoParametros(String nombre, int edad) {
        System.out.println("Parámetros recibidos -> Nombre: " + nombre + ", Edad: " + edad);
    }

    public static int ejemploRetornoValores(int a, int b) {
        return a + b;
    }

    public static void ejemploSobrecarga(String msg) {
        System.out.println("Sobrecarga (String): " + msg);
    }

    public static void ejemploSobrecarga(int num) {
        System.out.println("Sobrecarga (int): " + num);
    }
}