package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("Método sin parámetros ejecutado.");
    }

    public static int ejemploRetornoValores(int a, int b) {
        return a + b;
    }

    public static void ejemploSobrecarga(String msg) {
        System.out.println("Mensaje: " + msg);
    }

    public static void ejemploSobrecarga(int num) {
        System.out.println("Número: " + num);
    }
}