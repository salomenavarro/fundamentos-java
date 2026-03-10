package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   EJECUCIÓN DE ACTIVIDAD: FUNDAMENTOS    ");
        System.out.println("==========================================\n");

        // 1. Variables y Constantes
        System.out.println("--- Tema: Variables y Constantes ---");
        VariablesYConstantes.demostrarDeclaracionAsignacion();
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostrarConstantes();
        System.out.println();

        // 2. Tipos de Datos Primitivos
        System.out.println("--- Tema: Tipos de Datos Primitivos ---");
        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        TiposDeDatosPrimitivos.demostrarBooleanos();
        System.out.println();

        // 3. Conversión de Tipos
        System.out.println("--- Tema: Conversión de Tipos (Casting) ---");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();
        System.out.println();

        // 4. Operadores
        System.out.println("--- Tema: Operadores ---");
        Operadores.demostrarAritmeticos();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarLogicos();
        Operadores.demostrarAsignacionCompuesta();
        Operadores.demostrarOperadorTernario();
        System.out.println();

        // 5. Entrada de Datos (Requiere interacción del usuario)
        System.out.println("--- Tema: Entrada de Datos ---");
        // Comentamos estas líneas para que el programa no se detenga, 
        // pero podemos descomentarlas para probar la interacción con Scanner.
        // EntradaDeDatos.leerVariosTipos();
        // EntradaDeDatos.manejarSaltoDeLineaPendiente();
        System.out.println("[Manual] Descomenta los métodos en Main para probar Scanner.");
        System.out.println();

        // 6. Estructuras Condicionales
        System.out.println("--- Tema: Estructuras Condicionales ---");
        EstructurasCondicionales.ejemploIfElseIfElse();
        EstructurasCondicionales.ejemploSwitch();
        System.out.println();

        // 7. Estructuras de Repetición
        System.out.println("--- Tema: Estructuras de Repetición ---");
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploBreakContinue();
        System.out.println();

        // 8. Métodos Estáticos Simples
        System.out.println("--- Tema: Métodos Estáticos Simples ---");
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        int suma = MetodosEstaticosSimples.ejemploRetornoValores(10, 20);
        System.out.println("Retorno de suma: " + suma);
        MetodosEstaticosSimples.ejemploSobrecarga("Hola");
        MetodosEstaticosSimples.ejemploSobrecarga(100);
        System.out.println();

        // 9. Arreglos Unidimensionales
        System.out.println("--- Tema: Arreglos Unidimensionales ---");
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.recorrerConForEach();
        System.out.println();

        // 10. Arreglos Bidimensionales
        System.out.println("--- Tema: Arreglos Bidimensionales (Matrices) ---");
        ArreglosBidimensionales.recorrerMatriz();
        System.out.println();

        // 11. Manipulación de Cadenas
        System.out.println("--- Tema: Manipulación de Cadenas ---");
        ManipulacionCadenas.demostrarMetodosUtiles();
        ManipulacionCadenas.usarStringBuilder();
        System.out.println();

        // 12. Manejo de Excepciones
        System.out.println("--- Tema: Manejo de Excepciones ---");
        ManejoBasicoExcepciones.ejemploTryCatchDivision();
        ManejoBasicoExcepciones.evitarCierrePrograma();
        System.out.println();

        System.out.println("==========================================");
        System.out.println("       FIN DE LA DEMOSTRACIÓN             ");
        System.out.println("==========================================");
    }
}