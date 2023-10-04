public static void main(String[] args) {

    /*
        EJERCICIO 1 - FORMA DE RESOLUCIÓN 3:
        Crea un programa que calcule el promedio de un arreglo de números flotantes
    */

    //DECLARACIÓN , CREACIÓN E INICIALIZACIÓN DEL ARREGLO
    float[] notas = {6.5f, 4.5f, 6.6f, 5.8f, 7.0f, 3.2f};
    //INDICES         0     1     2     3     4     5

    float promedio = 0.0f; //VARIABLE QUE ALMACENARÁ LOS PROMEDIOS

    //CALCULAR EL PROMEDIO MEDIANTE UN BUCLE
    for(int indice = 0; indice < notas.length; indice++){
        promedio = promedio + notas[indice]; //SE SUMAN LAS NOTAS A MEDIDA QUE EL BUCLE REALIZA UNA ITERACIÓN
    }

    promedio = promedio / notas.length; //SE DIVIDEN LAS NOTAS CON LA LONGITUD DEL ARREGLO

    //MOSTAR EL PROMEDIO OBTENIDO
    System.out.println("EL PROMEDIO ES: "+promedio);

}