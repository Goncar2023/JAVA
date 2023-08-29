public static void main(String[] args) {
    System.out.println("");
        /*
            El punto y coma, en muchos de los lenguajes, establece el fin 
            de una sentencia o de una instrucción. Nos ayuda a entender mejor 
            el código, dado que podemos saber en qué momento comienza y 
            termina una instrucción.
        */

        /*
        Los tipos de datos primitivos especifican el tamaño
        y el tipo de los valores de las variables.
        */

        //Almacena True o False - Predeterminado False
        boolean booleano=true; 

        //Almacenan un solo carácter
        char caracter='A'; //Utiliza comillas simples
        System.out.println("Valor Carácter ="+caracter);

        //Almacena un número entero sin fracciones ni decimales
        int entero = 10;
        System.out.println("Valor Entero ="+entero);
        long largo = 125362133223L;
        System.out.println("Valor Largo ="+largo);

        //Tipo flotante  -> Flotante y Doble
        //La diferencia está en la cantidad de números que "caben" en cada uno de estos formatos
        float flotante = 65.20298f; //32 Bits -> Precisión simples
        double decimal = 876.765d;  //64 Bits -> Precisión exacta

        /*
        Los tipos de datos no primitivos o tipos de datos de referencia 
        hacen releación a instancias u objetos

        El tipo de datos String almacena una secuencia o matriz de caracteres.
        */
        String nombre = "Walter White";
        System.out.println("Datos Personales");
        System.out.println("Nombres: "+nombre);
}