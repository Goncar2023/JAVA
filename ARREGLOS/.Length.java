/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    String[] frutas = new String[5];
    /*
        LA PROPIEDAD length SE UTILIZA PARA SABER LA LONGITUD DE UN ARREGLO O CADENA(STRING)
        length ENTREGA LA CANTIDAD DE ELEMENTOS EN UN ARRAY
    */

    //EJEMPLO CON LENGTH
    int longitud = frutas.length;
    System.out.println("La longitud del arreglos es: "+longitud);
    System.out.println("Presiona una tecla para continuar...");
    String tecla = scn.nextLine();
    System.out.println("");

    //INGRESAR DATOS AL ARREGLO FRUTAS
    for(int indice = 0; indice < frutas.length ; indice++){ //PARA EVITAR ERRORES EN LA CONDICIÓN SE RECOMIENDA UTILIZAR .length
        System.out.print("Ingrese el NOMBRE de la fruta a la posición "+indice+": ");
        frutas[indice] = scn.nextLine();
    }

    System.out.println("");
    System.out.println("MOSTRAR DATOS DEL ARREGLO");
    System.out.println("");

    //MOSTRAR DATOS DEL ARREGLO FRUTAS
    for(int indice = 0; indice < frutas.length; indice++){
        System.out.println("La fruta en la posición "+indice+" es: "+frutas[indice]);
    }

}