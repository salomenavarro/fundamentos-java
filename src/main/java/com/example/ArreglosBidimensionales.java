package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        // Forma 1: Declaración e inicialización directa (Literal)
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Forma 2: Con tamaño definido (3 filas x 2 columnas)
        int[][] matriz2 = new int[3][2];
        matriz2[0][0] = 10;
        
        System.out.println("Matrices declaradas y creadas exitosamente.");
    }

    public static void recorrerMatriz() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Recorrido de matriz con for anidado:");
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) { 
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println(); 
        }
    }

    // Implementación del método opcional 
    public static void ejemploUsosTipicos() {
        System.out.println("Ejemplo de uso típico: Suma de los elementos de una matriz.");
        int[][] datos = {{5, 5}, {10, 10}};
        int suma = 0;

        for (int[] fila : datos) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        System.out.println("La suma total de la matriz es: " + suma);
    }
}