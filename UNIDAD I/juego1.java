/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Clase para generar números aleatorios
    Random random = new Random();
    String txtUsuario, txtPrograma;
    int resultado;

    System.out.println("PIEDRA, PAPEL O TIJERA");
    System.out.println("1. Piedra");
    System.out.println("2. Papel");
    System.out.println("3. Tijera");
    System.out.print("Elige tu opción: ");
    int opUsuario = scanner.nextInt();
    int opPrograma = random.nextInt(3) + 1; //El +1 reemplaza al 0

    //Convertir la opción númerica en una PALABRA
    switch(opUsuario){
        case 1:
            txtUsuario = "Piedra";
            break;
        case 2:
            txtUsuario = "Papel";
            break;
        case 3:
            txtUsuario = "Tijera";
            break;
        default:
            txtUsuario = "Opción inválida";
            break;
    }

    //Convertir la opción númerica en una PALABRA
    switch (opPrograma) {
        case 1:
            txtPrograma = "Piedra";
            break;
        case 2:
            txtPrograma = "Papel";
            break;
        case 3:
            txtPrograma = "Tijera";
            break;
        default:
            txtPrograma = "Opción inválida";
            break;
    }

    /*
        Hay tres posibles salidas
        1.- EMPATE
        2.- EL PROGRAMA GANA - EL USUARIO PIERDE
        3.- EL USUARIO GANE - EL PROGRAMA PIERDE
    */
    if (opUsuario == opPrograma) {
        resultado = 0; //Empate
    } else if ((opUsuario == 1 && opPrograma == 3) || (opUsuario == 2 && opPrograma == 1) || (opUsuario == 3 && opPrograma == 2)) {
        resultado = 1; //El Usuario gana
    } else {
        resultado = -1; //El Programa gana
    }

    System.out.println("");
    System.out.println("Tú opción: "+txtUsuario);
    System.out.println("Elección del programa: "+txtPrograma);

    //Conversión del resultado a TEXTO
    if (resultado == 0) {
        System.out.println("Es un empate.");
    } else if (resultado == 1) {
        System.out.println("¡Ganaste!");
    } else {
        System.out.println("El programa gana.");
    }
}