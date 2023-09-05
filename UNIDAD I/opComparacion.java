/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    /*
        Operadores de Comparación:
        Estos operadores se utilizan para comparar valores y producir un resultado booleano (true o false).

        ==: Igual a
        !=: Diferente de
        <: Menor que
        >: Mayor que
        <=: Menor o igual que
        >=: Mayor o igual que
    */

    int a = 15;
    int b = 24;

    //IGUAL A
    boolean igual = a == b;
    System.out.println("A == B: " + igual);//Resultado: FALSE

    //DIFERENTE DE
    boolean diferente = a != b;
    System.out.println("A != B: " + diferente);//Resultado: TRUE

    //MENOR QUE
    boolean menorQue = a < b;
    System.out.println("A < B: " + menorQue);//Resultado: TRUE

    //MAYOR QUE
    boolean mayorQue = a > b;
    System.out.println("A > B: " + mayorQue);//Resultado: FALSE

    //MENOR O IGUAL QUE
    boolean menorIgual = a <= b;
    System.out.println("A <= B: " + menorIgual);//Resultado: TRUE

    //MAYOR O IGUAL QUE
    boolean mayorIgual = a >= b;
    System.out.println("A >= B: " + mayorIgual); //Resultado: FALSE

}