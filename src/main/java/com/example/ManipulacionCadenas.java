package com.example;

public class ManipulacionCadenas {
    public static void demostrarMetodosUtiles() {
        String texto = "  Hola Java  ";
        System.out.println("Original: '" + texto + "'");
        System.out.println("Limpio: '" + texto.trim() + "'");
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Contiene 'Java': " + texto.contains("Java"));
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder("Texto");
        sb.append(" dinámico").append(" eficiente.");
        System.out.println(sb.toString());
    }
}