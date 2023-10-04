public static void main(String[] args) {

    /*
        EJERCICIO 1 - FORMA DE RESOLUCIÓN 6:
        Crea un programa que calcule el promedio de un arreglo de números flotantes
    */

    Scanner scn = new Scanner(System.in);

    //DECLARACIÓN , CREACIÓN DEL ARREGLO
    float[] notas = new float[7];
    float promedio = 0.0f; //VARIABLE QUE ALMACENARÁ LOS PROMEDIOS

    //INGRESAR VALORES AL ARREGLO
    for(int indice = 0; indice < (notas.length - 1); indice++){
        System.out.print("INGRESE NOTA N° "+ (indice+1)+" :"); //INDICE +1 ES SOLAMENTE PARA QUE NO MUESTRE EL CERO POR PANTALLA
        notas[indice] = scn.nextFloat(); //ALMACENARÁ LO INGRESADO POR EL USUARIO EN LA POSICIÓN INDICADA EN CADA ITERACIÓN
    }

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