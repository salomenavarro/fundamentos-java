package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[3];
        System.out.println("Arrays inicializados.");
    }

    public static void recorrerConForEach() {
        String[] lenguajes = {"Java", "Python", "C++"};
        for (String s : lenguajes) {
            System.out.println("Lenguaje: " + s);
        }
    }
}