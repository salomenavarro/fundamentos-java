package com.example;

public class EstructurasCondicionales {
    public static void ejemploIfElseIfElse() {
        int hora = 14;
        if (hora < 12) System.out.println("Buenos días");
        else if (hora < 19) System.out.println("Buenas tardes");
        else System.out.println("Buenas noches");
    }

    public static void ejemploSwitch() {
        int dia = 2;
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            default -> System.out.println("Otro día");
        }
    }
}