/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {

    //DECLARACIÓN DE ARREGLOS
    String[] marcas;//ARREGLO A UTILIZAR EN EL EJEMPLO
    int[] numeros;
    float[] notas;
    double[] tallas;
    char[] letras;
    boolean[] estados;

    //CREACIÓN DE ARREGLOS
    marcas = new String[5]; //-> Se entrega la dimensión o longitud del arreglo
    numeros = new int[10];
    notas = new float[6];
    tallas = new double[3];
    letras = new char[10];
    estados = new boolean[5];

    //INICIALIZACIÓN DE ARREGLOS
    marcas[0] = "Acer";
    marcas[1] = "Samsung";
    marcas[2] = "Apple";
    marcas[3] = "Asus";
    marcas[4] = "HP";

    //MOSTRAR LOS VALORES DEL ARREGLO UNO A UNO
    System.out.println("Marca en la posición 0 "+ marcas[0]);
    System.out.println("Marca en la posición 1 "+ marcas[1]);
    System.out.println("Marca en la posición 2 "+ marcas[2]);
    System.out.println("Marca en la posición 3 "+ marcas[3]);
    System.out.println("Marca en la posición 4 "+ marcas[4]);

    //DECLARAR Y CREAR UN ARREGLO EN LA MISMA LÍNEA
    String[] nombres = new String[5];

    //DECLARAR, CREAR E INICILIZAR ARREGLOS EN LA MISMA LÍNEA
    String[] frutas = {"Manzana","Pera","Naranja","Durazno","Frutilla"};
    char[] vocales = {'A','E','I','O','U'};
    int[] edads = {10,27,30,5};

    /*
        A MODO DE PRACTICA INICIALIZA Y MUESTRA LOS VALORES DE LOS DEMÁS
        ARREGLOS (numeros, notas, tallas, letras, estados, nombres)
    */

}