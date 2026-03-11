package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploWhile() {
        int i = 0;
        while (i < 3) {
            System.out.println("While iteración: " + i);
            i++;
        }
    }

    public static void ejemploDoWhile() {
        int i = 0;
        do {
            System.out.println("Do-While iteración: " + i);
            i++;
        } while (i < 3);
    }

    public static void ejemploForClasico() {
        for (int j = 0; j < 3; j++) {
            System.out.println("For iteración: " + j);
        }
    }

    public static void ejemploForAnidado() {
        System.out.println("Tabla de multiplicar simple (2x2):");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue; 
            if (i == 4) break;    
            System.out.println("Valor con break/continue: " + i);
        }
    }

    public static void ejemploEtiquetas() {
        bucleExterno:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("Rompiendo en i=1, j=1 usando etiqueta.");
                    break bucleExterno;
                }
                System.out.println("Etiquetas - i: " + i + ", j: " + j);
            }
        }
    }
}