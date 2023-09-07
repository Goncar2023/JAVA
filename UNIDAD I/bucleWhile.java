/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    /*
        El bucle WHILE se utiliza cuando no se sabe cuántas veces se
        ejecutará un bloque de código.

        while (condición) {
            // Código a repetir
        }
    */
    int contador = 0;
    while (contador < 5) {
        System.out.println("Iteración " + contador);
        contador++;
    }

    /*
        El bucle DO-WHILE se utiliza es similar al bucle WHILE, pero el código
        se ejecutará al menos una vez, ya que la condicón se verifica después de la 
        ejecución del bloque.

        do {
            // Código a repetir
        } while (condición);
    */
   int contador = 0;
    do {
        System.out.println("Iteración " + contador);
        contador++;
    } while (contador < 5);

    /*
        El bucle FOR se utiliza cuando conocemos cuántas veces se quiere repetir una acción.
        for (inicialización; condición; actualización) {
            // Código a repetir
        }
    */
    for (int i = 0; i < 5; i++) {
        System.out.println("Iteración " + i);
    }

}

