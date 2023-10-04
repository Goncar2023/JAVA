//Colores en la terminal
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_GREEN = "\u001B[32m";

public static void main(String[] args) {

    /*
        EJERCICIO 1 - FORMA DE RESOLUCIÓN 10:
        Crea un programa que calcule el promedio de un arreglo de números flotantes
    */

    Scanner scn = new Scanner(System.in);
    boolean status = true, isNumber = true;
    int longitud = 0;

    while(status){
        while(isNumber){
            System.out.print("INGRESA LA CANTIDAD DE NOTAS A PROMEDIAR: ");
            if(scn.hasNextInt()){ //VALIDAR QUE NO SE INGRESEN CADENAS DE TEXTO - SOLO NÚMEROS ENTEROS
                longitud = scn.nextInt();
                status = validarLongitud(longitud);
                isNumber = false;
            }else{
                System.out.println(ANSI_RED+"DEBES INGRESAR UN NÚMERO ENTERO"+ANSI_BLACK);
                scn.next();//Limpiar scanner
                isNumber = true;
            }
        }
    }
    System.out.println("");

    //DECLARACIÓN,CREACIÓN DEL ARREGLO, PERO LA LONGITUD LA ENTREGA EL USUARIO
    float[] notas = new float[(longitud + 1)];//SE UTILIZARÁ UNA POSICIÓN EXTRA PARA ALMACENAR EL PROMEDIO

    //MÉTODO PARA INGRESAR VALORES AL ARREGLO
    notas = ingresarDatos(notas, longitud, scn);
    notas = calcularPromedio(notas, longitud);

    //MOSTAR EL PROMEDIO OBTENIDO
    mostrarPromedio(notas, longitud);
}

private static float[] ingresarDatos(float[] notas, int longitud, Scanner scn) {
    //INGRESAR VALORES AL ARREGLO
    for(int indice = 0; indice < longitud; indice++){
        boolean status = true;
        boolean isFloat = true;
        //SE IMPLEMENTA UN BUCLE PARA VALIDAR QUE SE INGRESE UN NÚMERO VALIDO
        while(status){
            while(isFloat){
                System.out.print("INGRESE NOTA N° "+ (indice+1)+" :"); //INDICE +1 ES SOLAMENTE PARA QUE NO MUESTRE EL CERO POR PANTALLA
                if(scn.hasNextFloat()){ //VALIDAR QUE NO SE INGRESEN CADENAS DE TEXTO - SOLO NÚMEROS DECIMALES
                    notas[indice] = scn.nextFloat(); //ALMACENARÁ LO INGRESADO POR EL USUARIO EN LA POSICIÓN INDICADA EN CADA ITERACIÓN
                    status = validarNota(notas[indice]); //MÉTODO PARA VALIDAR QUE SE INGRESE LA NOTA DE FORMA CORRECTA
                    isFloat = false;
                }else{
                    System.out.println(ANSI_RED+"DEBES INGRESAR UN NÚMERO"+ANSI_BLACK);
                    scn.next();//Limpiar scanner
                    isFloat = true;
                }
            }
        }
    }
    return notas;
}

private static float[] calcularPromedio(float[] notas, int longitud) {
    //CALCULAR EL PROMEDIO MEDIANTE UN BUCLE
    for(int indice = 0; indice < longitud; indice++){
        notas[longitud] += notas[indice]; //SE UTILIZA LA ÚLTIMA POSICIÓN COMO ACUMULADOR DE LA SUMA DE LAS NOTAS
        //SE UTILIZA longitud PARA IR A LA ÚLTIMA POSICIÓN DEL ARREGLO 
        //SE PUEDE UTILIZAR longitud o .length - 1 PARA IR A LA ÚLTIMA POSICIÓN DEL ARREGLO 
        //SE UTILIZA EL OPERADOR DE ASIGNACIÓN CON SUMA (+=) PARA ACUMULAR LAS NOTAS EN CADA ITERACIÓN
    }

    //AL FINALIZAR EL BUCLE SE UTILIZA LA ÚLTIMA POSICIÓN Y QUE CONTIENE LA SUMA DE LAS NOTAS PARA DIVIDIRLA POR LA LONGITUD DEL ARREGLO
    notas[longitud] = notas[longitud] / (notas.length - 1); //EL -1 ES PARA QUE NO CONSIDERE LA POSICIÓN QUE ACUMULA LAS NOTAS Y QUE ALMACENARÁ EL PROMEDIO FINAL

    return notas;
}

private static void mostrarPromedio(float[] notas, int longitud) {
    if(notas[longitud] >= 6.0){
        System.out.println("SU PROMEDIO ES: "+ANSI_BLUE+notas[longitud]+ANSI_BLACK+", USTED HA: "+ANSI_BLUE+"APROBADO CON DISTINCIÓN MÁXIMA"); 
    }else if(notas[longitud] >= 4.0 && notas[longitud] < 6.0){
        System.out.println("SU PROMEDIO ES: "+ANSI_GREEN+notas[longitud]+ANSI_BLACK+", USTED HA: "+ANSI_GREEN+"APROBADO"); 
    }else{
        System.out.println("SU PROMEDIO ES: "+ANSI_RED+notas[longitud]+ANSI_BLACK+", USTED HA: "+ANSI_RED+"REPROBADO"); 
    }
}

private static boolean validarNota(float nota) {
    if(nota >= 0.0 && nota <= 7.0){
        return false;
    }else{
        System.out.println(ANSI_RED+"INGRESE UNA NOTA VÁLIDA"+ANSI_BLACK);
        return true;
    }
}

private static boolean validarLongitud(int longitud) {
    if(longitud > 0){
        return false;
    }else{
        System.out.println(ANSI_RED+"INGRESE UN NÚMERO VÁLIDO"+ANSI_BLACK);
        return true;
    }
}