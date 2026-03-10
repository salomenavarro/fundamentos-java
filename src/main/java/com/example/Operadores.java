package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        int a = 10, b = 3;
        System.out.println("Suma: " + (a + b) + ", Resto (Módulo): " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        int x = 5;
        System.out.println("Sufijo: " + (x++) + " (luego vale " + x + ")");
        System.out.println("Prefijo: " + (++x));
    }

    public static void demostrarRelacionales() {
        System.out.println("10 > 5: " + (10 > 5) + ", 10 <= 5: " + (10 <= 5));
    }

    public static void demostrarLogicos() {
        boolean resultado = (5 > 3) && (10 < 20);
        System.out.println("AND Lógico: " + resultado + ", NOT: " + !resultado);
    }

    public static void demostrarAsignacionCompuesta() {
        int n = 10;
        n += 5; // n = 15
        n *= 2; // n = 30
        System.out.println("Valor final acumulado: " + n);
    }

    public static void demostrarOperadorTernario() {
        int nota = 85;
        String resultado = (nota >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Resultado examen: " + resultado);
    }
}