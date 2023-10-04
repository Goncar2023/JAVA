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
        LOS ARREGLOS SE PUEDEN INICIALIZAR Y RECORRER DE FORMA DINÁMICA MEDIANTE
        BUCLES FOR
    */

    //INGRESAR DATOS AL ARREGLO FRUTAS
    for(int indice = 0; indice < 5; indice++){
        System.out.print("Ingrese el NOMBRE de la fruta a la posición "+indice+": ");
        frutas[indice] = scn.nextLine();
    }

    System.out.println("");
    System.out.println("MOSTRAR DATOS DEL ARREGLO");
    System.out.println("");

    //MOSTRAR DATOS DEL ARREGLO FRUTAS
    for(int indice = 0; indice < 5; indice++){
        System.out.println("La fruta en la posición "+indice+" es: "+frutas[indice]);
    }

    /*
        A MODO DE PRACTICA INICIALIZA Y MUESTRA LOS SIGUIENTES ARREGLOS DE FORMA
        DINÁMICA UTILIZANDO BUCLES FOR

    */
    String[] nombreProductos = new String[5];
    int[] cantidadProductos = new int[5];
    int[] precioProductos = new int[5];

    /*
        DESAFÍO:
        UTILIZANDO LOS MISMOS ARREGLOS Y UTILIZANDO EL BUCLE FOR IMPRIME LOS DATOS DE LA SIGUIENTE FORMA
        SIMULANDO UN REPORTE

        "===================================================================="
        "                 INFORMACIÓN PRODUCTOS EN BODEGA                    "
        "===================================================================="
        "        PRODUCTO              |   CANTIDAD   |      PRECIO DE VENTA "
        "  DETERGENTE OMO MATIC 3L           50               $  14500       "
        "  XXXXXXXXXXXXXXXXXXXXXXX           YY               $  ZZZZZ       "
        "  XXXXXXXXXXXXXXXXXXXXXXX           YY               $  ZZZZZ       "
        "  XXXXXXXXXXXXXXXXXXXXXXX           YY               $  ZZZZZ       "
        "  XXXXXXXXXXXXXXXXXXXXXXX           YY               $  ZZZZZ       "
        "===================================================================="
        "  CANT. TOTAL DE PROD. BODEGA |     XY
        "===================================================================="
    */
}