package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String parte1 = "Hola";
        String parte2 = " Mundo";
        
        String usandoMas = parte1 + parte2;
        String usandoConcat = parte1.concat(parte2);
        
        System.out.println("Concatenación con +: " + usandoMas);
        System.out.println("Concatenación con concat(): " + usandoConcat);
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Hola Java  ";
        String limpio = texto.trim();

        System.out.println("Texto original: '" + texto + "'");
        System.out.println("1. length(): " + limpio.length());
        System.out.println("2. charAt(0): " + limpio.charAt(0));
        System.out.println("3. substring(0, 4): " + limpio.substring(0, 4));
        System.out.println("4. toUpperCase(): " + limpio.toUpperCase());
        System.out.println("5. toLowerCase(): " + limpio.toLowerCase());
        System.out.println("6. trim(): '" + limpio + "'");
        System.out.println("7. equals('Hola Java'): " + limpio.equals("Hola Java"));
        System.out.println("8. equalsIgnoreCase('hola java'): " + limpio.equalsIgnoreCase("hola java"));
        System.out.println("9. contains('Java'): " + limpio.contains("Java"));
        System.out.println("10. startsWith('H'): " + limpio.startsWith("H"));
        System.out.println("11. endsWith('a'): " + limpio.endsWith("a"));
    }

    public static void demostrarInmutabilidad() {
        System.out.println("--- Demostración de Inmutabilidad ---");
        String original = "Java";
        // Intentamos cambiarlo a mayúsculas
        original.toUpperCase(); 
        
        System.out.println("Variable original después de toUpperCase() sin asignar: " + original);
        
        // Para cambiarlo, debemos asignar el resultado a una nueva variable o a la misma
        String modificado = original.toUpperCase();
        System.out.println("Variable original sigue siendo: " + original);
        System.out.println("Nueva variable (resultado del método): " + modificado);
        System.out.println("Conclusión: Los Strings en Java no cambian, se crean nuevos.");
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder("StringBuilder");
        sb.append(" es");
        sb.append(" más");
        sb.append(" eficiente");
        sb.append(" para concatenar en bucles.");
        
        System.out.println("Resultado de StringBuilder: " + sb.toString());
    }
}