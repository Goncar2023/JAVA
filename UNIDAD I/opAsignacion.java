/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    /*
        Operadores de Asignación:
        Estos operadores se utilizan para asignar valores a variables.

        =: Asignación simple
        +=: Asignación con suma (por ejemplo, a += b es equivalente a a = a + b)
        -=: Asignación con resta  (por ejemplo, a -= b es equivalente a a = a - b)
        *=: Asignación con multiplicación
        /=: Asignación con división
        %=: Asignación con módulo
    */

    //Asignación SIMPLE
    int numero = 10;

    //Asignación con SUMA
    int a = 5;
    int b = 10;
    a += b; //Equivale a: A = A + B
    System.out.println("Valor de A = "+a); //Resultado = 15

    //Asignación con RESTA
    int x = 20;
    int z = 12;
    x -= z;//Equivale a: X = X - Z
    System.out.println("Valor de X = "+x); //Resultado = 8

    //Asignación con MULTIPLICACIÓN
    int p = 5;
    int q = 3;
    p *= q;//Equivale a: P = P * Q
    System.out.println("Valor de P = "+p);//Resultado = 15

    //Asignación con DIVISIÓN
    int r = 9;
    int s = 3;
    r /= s;//Equivale a: R = R / S
    System.out.println("Valor de R = "+r);//Resultado = 3

    //Asignación con MÓDULO
    int t = 19;
    int w = 5;
    t %= w;//Equivale a: T = T % W
    System.out.println("Valor de T = "+t);//Resultado = 4

}