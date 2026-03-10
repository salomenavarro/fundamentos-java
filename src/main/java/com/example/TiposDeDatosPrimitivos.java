package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        System.out.println("Enteros: byte " + b + ", short " + s + ", int " + i + ", long " + l);
    }

    public static void demostrarFlotantes() {
        float f = 3.14f;
        double d = 3.1415926535;
        System.out.println("Flotantes: float " + f + ", double " + d);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        char unicode = '\u0041';
        System.out.println("Chars: " + letra + " y " + unicode);
    }

    public static void demostrarBooleanos() {
        boolean esJavaDivertido = true;
        System.out.println("¿Es Java divertido? " + esJavaDivertido);
    }
}