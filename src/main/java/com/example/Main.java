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
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto(); 
        System.out.println();

        // 3. Conversión de Tipos
        System.out.println("--- Tema: Conversión de Tipos ---");
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

        // 5. Entrada de Datos (DESCOMENTADOS POR REQUISITO)
        System.out.println("--- Tema: Entrada de Datos ---");
        EntradaDeDatos.leerVariosTipos();
        EntradaDeDatos.manejarSaltoDeLineaPendiente();
        System.out.println();

        // 6. Estructuras Condicionales
        System.out.println("--- Tema: Estructuras Condicionales ---");
        EstructurasCondicionales.ejemploIf();
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploIfElseIfElse();
        EstructurasCondicionales.ejemploSwitch();
        EstructurasCondicionales.ejemploSwitchExpression();
        System.out.println();

        // 7. Estructuras de Repetición
        System.out.println("--- Tema: Estructuras de Repetición ---");
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile();
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();
        EstructurasDeRepeticion.ejemploEtiquetas();
        System.out.println();

        // 8. Métodos Estáticos Simples
        System.out.println("--- Tema: Métodos Estáticos Simples ---");
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoParametros("Juan Pérez", 25);
        int suma = MetodosEstaticosSimples.ejemploRetornoValores(15, 25);
        System.out.println("Resultado del retorno: " + suma);
        MetodosEstaticosSimples.ejemploSobrecarga("Texto de prueba");
        MetodosEstaticosSimples.ejemploSobrecarga(777);
        System.out.println();

        // 9. Arreglos Unidimensionales
        System.out.println("--- Tema: Arreglos Unidimensionales ---");
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();
        int[] original = {5, 10, 15};
        int[] resultado = ArreglosUnidimensionales.arrayComoParametroYRetorno(original);
        System.out.println("Array retornado (primer elemento): " + resultado[0]);
        System.out.println();

        // 10. Arreglos Bidimensionales
        System.out.println("--- Tema: Arreglos Bidimensionales ---");
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();
        ArreglosBidimensionales.ejemploUsosTipicos();
        System.out.println();

        // 11. Manipulación de Cadenas
        System.out.println("--- Tema: Manipulación de Cadenas ---");
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarMetodosUtiles();
        ManipulacionCadenas.demostrarInmutabilidad();
        ManipulacionCadenas.usarStringBuilder();
        System.out.println();

        // 12. Manejo de Excepciones
        System.out.println("--- Tema: Manejo de Excepciones ---");
        ManejoBasicoExcepciones.ejemploTryCatchDivision();
        ManejoBasicoExcepciones.ejemploTryCatchInput();
        ManejoBasicoExcepciones.ejemploBloqueFinally();
        ManejoBasicoExcepciones.evitarCierrePrograma();

        System.out.println("\n==========================================");
        System.out.println("       FIN DE LA EJECUCIÓN TOTAL          ");
        System.out.println("==========================================");
    }
}