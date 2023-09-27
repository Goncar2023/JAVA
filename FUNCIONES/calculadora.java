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
        //Según la opción
        switch(option){
            case 1:
                sumar(numberOne, numberTwo);
                break;
            case 2:
                restar(numberOne, numberTwo);
                break;
            case 3:
                multiplicar(numberOne, numberTwo);
                break;
            case 4:
                dividir(numberOne, numberTwo);
                break;
            case 5:
                System.out.println("Saliendo....");
                condicion = false;
                break;
            default:
                System.out.println("Opción no valida");
        }
    }while(condicion); //Se ejecutará mientras la variable CONDICIÓN sea VERDADERO
}

//MÉTODO QUE REALIZA LA SUMA
private static void sumar(double numberOne, double numberTwo) {
    System.out.println("El resultado de la SUMA es: "+(numberOne + numberTwo));
}

//MÉTODO QUE REALIZA LA RESTA
private static void restar(double numberOne, double numberTwo) {
    System.out.println("El resultado de la RESTA es: "+(numberOne - numberTwo));
}

//MÉTODO QUE REALIZA LA MULTIPLICACIÓN
private static void multiplicar(double numberOne, double numberTwo) {
    System.out.println("El resultado de la MULTIPLICACIÓN es: "+(numberOne * numberTwo));
}

//MÉTODO QUE REALIZA LA DIVISIÓN
private static void dividir(double numberOne, double numberTwo) {
    System.out.println("El resultado de la DIVISIÓN es: "+(numberOne / numberTwo));
}