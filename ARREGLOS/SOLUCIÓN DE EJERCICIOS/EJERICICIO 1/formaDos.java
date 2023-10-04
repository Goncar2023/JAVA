public static void main(String[] args) {

    /*
        EJERCICIO 1 - FORMA DE RESOLUCIÓN 2:
        Crea un programa que calcule el promedio de un arreglo de números flotantes
    */

    //DECLARACIÓN , CREACIÓN E INICIALIZACIÓN DEL ARREGLO
    float[] notas = {6.5f, 4.5f, 6.6f, 5.8f, 7.0f, 3.2f, 0.0f};
    //SE UTILIZA LA ÚLTIMA POSICIÓN DEL ARREGLO PARA ALMACENAR EL PROMEDIO FINAL

    //CALCULAR EL PROMEDIO
    notas[6] = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]+ notas[5]) / 6;

    //MOSTAR EL PROMEDIO OBTENIDO
    System.out.println("EL PROMEDIO ES: "+notas[6]);

}