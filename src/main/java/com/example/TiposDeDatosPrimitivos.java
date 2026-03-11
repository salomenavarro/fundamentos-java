package com.example;

public class TiposDeDatosPrimitivos {

    static byte defectoByte;
    static int defectoInt;
    static boolean defectoBool;
    static char defectoChar;

    public static void demostrarEnteros() {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;

        System.out.println("--- Rangos de Enteros ---");
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
    }

    public static void demostrarFlotantes() {
        float f = 3.14f;
        double d = 3.1415926535;
        System.out.println("Flotantes: float " + f + ", double " + d);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        char unicode = '\u0041';
        System.out.println("Chars: " + letra + " (Unicode: " + unicode + ")");
    }

    public static void demostrarBooleanos() {
        boolean esJavaDivertido = true;
        System.out.println("¿Es Java divertido? " + esJavaDivertido);
    }

    public static void demostrarValoresPorDefecto() {
        System.out.println("--- Valores por Defecto (Atributos de Clase) ---");
        System.out.println("byte: " + defectoByte);
        System.out.println("int: " + defectoInt);
        System.out.println("boolean: " + defectoBool);
        System.out.println("char: " + (defectoChar == '\u0000' ? "u0000 (Nulo)" : defectoChar));
    }
}