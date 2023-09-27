public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    //Método que contiene el menú
    menu(scn);
}

private static void menu(Scanner scn) {
    boolean condicion = true;
    double numberOne = 0, numberTwo = 0;
    do{
        System.out.println("CALCULADORA");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.println("5.- SALIR");
        System.out.print("OPCIÓN: ");
        int option = scn.nextInt();
        //Sí la opción es 5 NO SOLICITARÁ INGRESAR LOS NÚMEROS
        if(option != 5){
            System.out.println("Ingrese N° 1");
            numberOne = scn.nextInt();
            System.out.println("Ingrese N° 2");
            numberTwo = scn.nextInt();
        }

        switch(option){
            case 1:
                System.out.println("El resultado es: "+calcular(option,numberOne, numberTwo));
                break;
            case 2:
                System.out.println("El resultado es: "+calcular(option,numberOne, numberTwo));
                break;
            case 3:
                System.out.println("El resultado es: "+calcular(option,numberOne, numberTwo));
                break;
            case 4:
                System.out.println("El resultado es: "+calcular(option,numberOne, numberTwo));
                break;
            case 5:
                System.out.println("Saliendo....");
                condicion = false;
                break;
            default:
                System.out.println("Opción no valida");
        }
    }while(condicion); //Se ejecutará mientras CONDICIÓN sea VERDADERO
}

private static double calcular(int option, double numberOne, double numberTwo) {
    double resultado = 0;
    switch(option){
        case 1:
            resultado = numberOne + numberTwo;
            break;
        case 2:
            resultado = numberOne - numberTwo;
            break;
        case 3:
            resultado = numberOne * numberTwo;
            break;
        case 4:
            resultado = numberOne / numberTwo;
            break;
    }
    return resultado;
}