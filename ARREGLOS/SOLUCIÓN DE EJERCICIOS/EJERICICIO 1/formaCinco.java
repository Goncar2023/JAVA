public static void main(String[] args) {

    /*
        EJERCICIO 1 - FORMA DE RESOLUCIÓN 5:
        Crea un programa que calcule el promedio de un arreglo de números flotantes
    */

    Scanner scn = new Scanner(System.in);

    //DECLARACIÓN , CREACIÓN DEL ARREGLO
    float[] notas = new float[6];
    float promedio = 0.0f; //VARIABLE QUE ALMACENARÁ LOS PROMEDIOS

    //INGRESAR VALORES AL ARREGLO
    for(int indice = 0; indice < notas.length; indice++){
        System.out.print("INGRESE NOTA N° "+ (indice+1)+" :"); //INDICE +1 ES SOLAMENTE PARA QUE NO MUESTRE EL CERO POR PANTALLA
        notas[indice] = scn.nextFloat(); //ALMACENARÁ LO INGRESADO POR EL USUARIO EN LA POSICIÓN INDICADA EN CADA ITERACIÓN
    }

    //CALCULAR EL PROMEDIO MEDIANTE UN BUCLE
    for(int indice = 0; indice < notas.length; indice++){
        promedio = promedio + notas[indice]; //SE SUMAN LAS NOTAS A MEDIDA QUE EL BUCLE REALIZA UNA ITERACIÓN
    }

    promedio = promedio / notas.length; //SE DIVIDEN LAS NOTAS CON LA LONGITUD DEL ARREGLO

    //MOSTAR EL PROMEDIO OBTENIDO
    System.out.println("");
    System.out.println("EL PROMEDIO ES: "+promedio);
}