public static void main(String[] args) {
    //Para que el usuario ingrese los n°
    Scanner scn = new Scanner(System.in);
    float numero1, numero2;
    float resultado;
        
    int contador = 1;
    while(contador > 0 && contador < 5){

        System.out.println("CALCULADORA");
        System.out.println("1.- Suma");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Salir");
        System.out.println("Ingrese OPCIÓN:");
        contador = scn.nextInt();
        System.out.println("");
        System.out.print("Ingrese el n° 1:");
        numero1 = scn.nextFloat();
        System.out.print("Ingrese el n° 2: ");
        numero2 = scn.nextFloat();
        System.out.println("======================================");
        switch(contador){
            case 1: 
                resultado = numero1 + numero2;
                System.out.println("La SUMA es: "+resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("La RESTA es: "+resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("La MULTIPLICACIÓN es: "+resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("La DIVISIÓN es: "+resultado);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción Inválida");
        }
        System.out.println("======================================");
    }
}