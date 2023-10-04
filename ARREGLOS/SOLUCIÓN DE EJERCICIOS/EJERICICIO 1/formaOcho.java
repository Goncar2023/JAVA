public static void main(String[] args) {

    /*
        EJERCICIO 1 - FORMA DE RESOLUCIÓN 8:
        Crea un programa que calcule el promedio de un arreglo de números flotantes
    */

    Scanner scn = new Scanner(System.in);

    System.out.println("INGRESA LA CANTIDAD DE NOTAS A PROMEDIAR");
    int longitud = scn.nextInt();

    //DECLARACIÓN,CREACIÓN DEL ARREGLO, PERO LA LONGITUD LA ENTREGA EL USUARIO
    float[] notas = new float[(longitud + 1)];//SE UTILIZARÁ UNA POSICIÓN EXTRA PARA ALMACENAR EL PROMEDIO

    //INGRESAR VALORES AL ARREGLO
    for(int indice = 0; indice < longitud; indice++){
        System.out.print("INGRESE NOTA N° "+ (indice+1)+" :"); //INDICE +1 ES SOLAMENTE PARA QUE NO MUESTRE EL CERO POR PANTALLA
        notas[indice] = scn.nextFloat(); //ALMACENARÁ LO INGRESADO POR EL USUARIO EN LA POSICIÓN INDICADA EN CADA ITERACIÓN
    }

    //CALCULAR EL PROMEDIO MEDIANTE UN BUCLE
    for(int indice = 0; indice < longitud; indice++){
        notas[longitud] += notas[indice]; //SE UTILIZA LA ÚLTIMA POSICIÓN COMO ACUMULADOR DE LA SUMA DE LAS NOTAS
        //SE UTILIZA longitud PARA IR A LA ÚLTIMA POSICIÓN DEL ARREGLO 
        //SE PUEDE UTILIZAR longitud o .length - 1 PARA IR A LA ÚLTIMA POSICIÓN DEL ARREGLO 
        //SE UTILIZA EL OPERADOR DE ASIGNACIÓN CON SUMA (+=) PARA ACUMULAR LAS NOTAS EN CADA ITERACIÓN
    }

    //AL FINALIZAR EL BUCLE SE UTILIZA LA ÚLTIMA POSICIÓN Y QUE CONTIENE LA SUMA DE LAS NOTAS PARA DIVIDIRLA POR LA LONGITUD DEL ARREGLO
    notas[longitud] = notas[longitud] / (notas.length - 1); //EL -1 ES PARA QUE NO CONSIDERE LA POSICIÓN QUE ACUMULA LAS NOTAS Y QUE ALMACENARÁ EL PROMEDIO FINAL

    //MOSTAR EL PROMEDIO OBTENIDO
    System.out.println("EL PROMEDIO ES: "+notas[longitud]);
}