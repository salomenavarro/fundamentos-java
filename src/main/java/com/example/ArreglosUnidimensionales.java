package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        // Diferentes formas de declarar e inicializar
        int[] arr1 = {10, 20, 30}; 
        int[] arr2 = new int[3];    
        arr2[0] = 100;
        
        System.out.println("Arrays declarados e inicializados correctamente.");
    }

    public static void mostrarLongitud() {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("La longitud del arreglo es: " + numeros.length);
    }

    public static void recorrerConForClasico() {
        int[] datos = {10, 20, 30};
        System.out.println("Recorrido con for clásico:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Índice " + i + ": " + datos[i]);
        }
    }

    public static void recorrerConForEach() {
        String[] lenguajes = {"Java", "Python", "C++"};
        System.out.println("Recorrido con for-each:");
        for (String s : lenguajes) {
            System.out.println("Lenguaje: " + s);
        }
    }

    // Método que demuestra ambos requerimientos: acepta un array y retorna uno
    public static int[] arrayComoParametroYRetorno(int[] entrada) {
        System.out.println("Procesando array recibido como parámetro...");
        int[] resultado = new int[entrada.length];
        
        for (int i = 0; i < entrada.length; i++) {
            resultado[i] = entrada[i] * 2; 
        }
        
        return resultado; 
    }
}