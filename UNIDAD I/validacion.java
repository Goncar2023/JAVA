//Colores en la terminal
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_YELLOW = "\u001B[33m";

public static void main(String[] args) {
    String user="usuario";
    String password="12345";

    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese nombre usuario: ");
    String nombre = leer.nextLine();
    System.out.print("Ingrese contraseña:");
    String contra = leer.nextLine();

    /*
        .equals() -> Es utilizado para comparar "valores" dentro de las instancias de String

        variable1.equals(variable2) para comparar SI SON IGUALES

        !variable1.equals(variable2) SI SON DISTINTAS
    */
    if( (!nombre.equals("")) || (!contra.equals("")) ){
    //SI ES DISTINTO A "VACÍO" INGRESARÁ A LA CONDICIONAL IF
        if(user.equals(nombre) && (password.equals(contra))){
            System.out.println(ANSI_BLUE+"Iniciando sesión....");
        }else{
            System.out.println(ANSI_RED+"Credenciales incorrectas");
        }
    }else{
        System.out.println(ANSI_YELLOW+"No se ingresaron credenciales");
    }
}