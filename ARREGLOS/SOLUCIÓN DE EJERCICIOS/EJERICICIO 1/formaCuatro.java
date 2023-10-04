public static void main(String[] args) {

    /*
        EJERCICIO 1 - FORMA DE RESOLUCIÓN 4:
        Crea un programa que calcule el promedio de un arreglo de números flotantes
    */

    //DECLARACIÓN , CREACIÓN E INICIALIZACIÓN DEL ARREGLO
    float[] notas = {6.5f, 4.5f, 6.6f, 5.8f, 7.0f, 3.2f, 0.0f};
    //INDICES         0     1     2     3     4     5     6

    //SE UTILIZARÁ LA ÚLTIMA POSICIÓN DEL ARREGLO PARA ALMACENAR EL PROMEDIO FINAL

    //CALCULAR EL PROMEDIO MEDIANTE UN BUCLE
    for(int indice = 0; indice < notas.length - 1; indice++){
        notas[6] += notas[indice]; //SE UTILIZA LA ÚLTIMA POSICIÓN COMO ACUMULADOR DE LA SUMA DE LAS NOTAS
        //SE UTILIZA EL OPERADOR DE ASIGNACIÓN CON SUMA (+=) PARA ACUMULAR LAS NOTAS EN CADA ITERACIÓN
    }

    //AL FINALIZAR EL BUCLE SE UTILIZA LA ÚLTIMA POSICIÓN Y QUE CONTIENE LA SUMA DE LAS NOTAS PARA DIVIDIRLA POR LA LONGITUD DEL ARREGLO
    notas[6] = notas[6] / (notas.length - 1); //EL -1 ES PARA QUE NO CONSIDERE LA POSICIÓN QUE ACUMULA LAS NOTAS Y QUE ALMACENARÁ EL PROMEDIO FINAL

    //MOSTAR EL PROMEDIO OBTENIDO
    System.out.println("EL PROMEDIO ES: "+notas[6]);

}