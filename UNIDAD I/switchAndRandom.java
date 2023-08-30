/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    //Clase para generar números aleatorios
    Random random = new Random();
    //Se generará un número aleatorio entre 1 y 3
    int numero = random.nextInt(3) + 1; //El +1 reemplaza al 0


    int diaSemana = 2;
    //Condicional SWITCH
    switch(diaSemana){
        case 1:
            System.out.println("Es Lunes");
            break;//Estructura de SALTO
        case 2:
            System.out.println("Es Lunes");
            break;
        case 3:
            System.out.println("Es Lunes");
            break;
        case 4:
            System.out.println("Es Lunes");
            break;
        case 5:
            System.out.println("Es Lunes");
            break;
        case 6:
            System.out.println("Es Lunes");
            break;
        case 7:
            System.out.println("Es Lunes");
            break;
        default:
            System.out.println("Día inválido");
            break;
    }
}