package com.example;
import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int i = sc.nextInt();
        System.out.print("Ingrese un double: ");
        double d = sc.nextDouble();
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.next();
        System.out.println("Leído: " + i + ", " + d + ", " + palabra);
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.print("Nombre completo: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + " de " + edad + " años.");
    }
}