package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        int i = 0;
        while (i < 3) {
            System.out.println("While iteración: " + i);
            i++;
        }
    }

    public static void ejemploForClasico() {
        for (int j = 0; j < 3; j++) {
            System.out.println("For iteración: " + j);
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue; // Salta el 2
            if (i == 4) break;    // Sale en el 4
            System.out.println("Valor: " + i);
        }
    }
}