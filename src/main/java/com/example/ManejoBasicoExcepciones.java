package com.example;

public class ManejoBasicoExcepciones {
    public static void ejemploTryCatchDivision() {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            System.out.println("Bloque finally ejecutado.");
        }
    }

    public static void evitarCierrePrograma() {
        System.out.println("El programa sigue funcionando tras el error.");
    }
}