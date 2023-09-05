/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    /*
        Operadores Lógicos:
        Estos operadores se utilizan para combinar expresiones booleanas.

        &&: AND lógico
        ||: OR lógico
        !: NOT lógico

        Operadores de Incremento/Decremento:
        Estos operadores se utilizan para incrementar o decrementar el valor de una variable en una unidad.

        ++: Incremento (por ejemplo, a++ aumenta el valor de a en 1)
        --: Decremento
    */

    boolean x = true;
    boolean y = false;

    //AND LÓGICO &&
    boolean operadorAnd = x && y;
    System.out.println("X && Y: " + operadorAnd); //Resultado: FALSE

    //OR LÓGICO ||
    boolean operadorOr = x || y;
    System.out.println("X || y: " + operadorOr); //Resultado: TRUE

    //NOT LÓGICO !
    boolean operadorNot = !x;
    System.out.println("!X: " + operadorNot); //Resultado: FALSE

    int z = 4;

    //INCREMENTO (++)
    z++; //Incrementa Z en 1
    System.out.println("Después de INCREMENTAR Z: " + z); //Resultado: 5

    //DECREMENTO (--)
    z--; // Decrementa Z en 1
    System.out.println("Después de DECREMENTAR Z: " + z); // Resultado: 4

}