package com.example;
import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un entero: ");
        int i = sc.nextInt();
        
        System.out.print("Ingrese un double: ");
        double d = sc.nextDouble();
        
        System.out.print("Ingrese una palabra (sc.next()): ");
        String palabra = sc.next();
        
        sc.nextLine(); 
        
        System.out.print("Ingrese una línea completa (sc.nextLine()): ");
        String lineaCompleta = sc.nextLine();
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Entero: " + i);
        System.out.println("Double: " + d);
        System.out.println("Palabra: " + palabra);
        System.out.println("Línea completa: " + lineaCompleta);
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Demostración Salto de Línea ---");
        System.out.print("Ingrese su edad (nextInt): ");
        int edad = sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.print("Ingrese su nombre completo (nextLine): ");
        String nombre = sc.nextLine();
        
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}