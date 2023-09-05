/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/

public static void main(String[] args) {
    
    Scanner numero = new Scanner(System.in);
    System.out.println("Ingrese primer número: ");
    int num1 = numero.nextInt();
    
    System.out.println("Ingrese segundo número: ");
    int num2 = numero.nextInt();
    
    System.out.println(" =========================================");
    System.out.println("|              CALCULADORA                |");
    System.out.println(" -----------------------------------------");
    System.out.println("    1.- SUMAR");
    System.out.println("    2.- RESTAR");
    System.out.println("    3.- MULTIPLICAR");
    System.out.println("    4.- DIVIDIR");
    System.out.println("    5.- Salir");
    System.out.println(" -----------------------------------------");
    System.out.print("Seleccione una opción: ");
    int opcion = numero.nextInt();
    
    
    if(opcion == 1){
        System.out.println("RESULTADO: "+(num1 + num2));
    }
    if(opcion == 2){
        System.out.println("RESULTADO: "+(num1 - num2));
    }
    if(opcion == 3){
        System.out.println("RESULTADO: "+(num1 * num2));
    }
    if(opcion == 4){
        System.out.println("RESULTADO: "+(num1 / num2));
    }
    
    if(opcion == 5){
        System.out.println("Saliendo...");
        //Terminar JVM
        System.exit(0);
    }
}