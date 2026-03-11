package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
    }

    public static void ejemploIfElse() {
        int numero = -5;
        if (numero >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }
    }

    public static void ejemploIfElseIfElse() {
        int hora = 14;
        if (hora < 12) {
            System.out.println("Buenos días");
        } else if (hora < 19) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }

    public static void ejemploSwitch() {
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Otro día");
                break;
        }
    }

    public static void ejemploSwitchExpression() {
        int dia = 3;
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Día desconocido";
        };
        System.out.println("Día seleccionado: " + nombreDia);
    }
}