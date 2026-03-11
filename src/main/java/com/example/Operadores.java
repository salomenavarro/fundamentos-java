package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        int a = 10, b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Resto (Módulo): " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        int x = 5;
        System.out.println("Incremento Sufijo: " + (x++) + " (luego vale " + x + ")");
        System.out.println("Incremento Prefijo: " + (++x));
        
        int y = 5;
        System.out.println("Decremento Sufijo: " + (y--) + " (luego vale " + y + ")");
        System.out.println("Decremento Prefijo: " + (--y));
    }

    public static void demostrarRelacionales() {
        System.out.println("10 > 5: " + (10 > 5));
        System.out.println("10 >= 5: " + (10 >= 10));
        System.out.println("10 < 5: " + (10 < 5));
        System.out.println("10 <= 5: " + (10 <= 5));
        System.out.println("10 == 10: " + (10 == 10));
        System.out.println("10 != 5: " + (10 != 5));
    }

    public static void demostrarLogicos() {
        boolean a = true;
        boolean b = false;
        System.out.println("AND Lógico (&&): " + (a && b));
        System.out.println("OR Lógico (||): " + (a || b));
        System.out.println("NOT Lógico (!): " + (!a));
    }

    public static void demostrarAsignacionCompuesta() {
        int n = 10;
        n += 5;  
        n -= 2;  
        n *= 2;  
        n /= 2;  
        n %= 3; 
        System.out.println("Valor final acumulado: " + n);
    }

    public static void demostrarOperadorTernario() {
        int nota = 85;
        String resultado = (nota >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Resultado examen: " + resultado);
    }
}