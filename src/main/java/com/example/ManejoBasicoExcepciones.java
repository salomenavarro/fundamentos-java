package com.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error capturado: No se puede dividir por cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero (int): ");
            int numero = sc.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error capturado: Se esperaba un número, pero se ingresó un dato inválido.");
            sc.nextLine(); 
        }
    }

    public static void ejemploBloqueFinally() {
        try {
            System.out.println("Intentando una operación...");
            int n = 10 / 2;
        } catch (Exception e) {
            System.out.println("Ocurrió un error.");
        } finally {
            System.out.println("Bloque finally: Esta línea siempre se ejecuta, haya error o no.");
        }
    }

    public static void evitarCierrePrograma() {
        System.out.println("--- Demostración de Resiliencia del Programa ---");
        ejemploTryCatchInput();
        
        System.out.println("Resultado: El programa NO se detuvo bruscamente.");
        System.out.println("Gracias al manejo de excepciones, podemos continuar con el flujo normal.");
    }
}