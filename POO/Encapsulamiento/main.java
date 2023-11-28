/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public static void main(String[] args) {
        boolean x = true;

        //INICIALIZAR OBJETO
        CuentaBancaria cuenta = new CuentaBancaria("Usuario Prueba",10000);

        mostrarMenu(cuenta);
}

public static void mostrarMenu(Cuenta cuenta) {
    boolean x = true;
    do{
        // Personalizar los textos de los botones "OK" y "Cancelar"
        UIManager.put("OptionPane.okButtonText", "Aceptar");
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");

        StringBuilder menu = new StringBuilder();//Se utiliza para construir cadenas
        menu.append("=======================\n");
        menu.append("          MENÚ\n");
        menu.append("=======================\n");
        menu.append("1.- Depositar\n");
        menu.append("2.- Retirar\n");
        menu.append("3.- Transferir\n");
        menu.append("4.- Ver saldo\n");
        menu.append("5.- Salir\n");

        //Cuadro de diálogo con botones personalizados y obtener la respuesta
        String respuesta = JOptionPane.showInputDialog(
            null,
            menu.toString() + "\nIngrese el número de opción:",
            "Menú",
            JOptionPane.INFORMATION_MESSAGE
        );

        // Verificar si se ingresó una respuesta válida
        if (respuesta != null && !respuesta.isEmpty()) {
            int opcion = Integer.parseInt(respuesta);

            switch (opcion) {
                case 1:
                    int deposito = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\nIngrese el monto a DEPOSITAR:",
                        "Depositar",
                        JOptionPane.INFORMATION_MESSAGE )
                    );
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    int retiro = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\nIngrese el monto a RETIRAR:",
                        "Retirar",
                        JOptionPane.INFORMATION_MESSAGE )
                    );
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    String numCuenta = JOptionPane.showInputDialog(
                        null,
                        "\nIngrese la cuenta a TRANSFERIR:",
                        "Transferencia",
                        JOptionPane.INFORMATION_MESSAGE );
                    
                    int transfiere = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\nIngrese el monto a TRANSFERIR:",
                        "Transferencia",
                        JOptionPane.INFORMATION_MESSAGE )
                    );
                    cuenta.transferir(transfiere, numCuenta);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Su saldo es: $"+cuenta.getSaldo());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "SALIENDO DEL SISTEMA...", "SALIR", JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operación no válida");
            }
        } else {
            // El usuario canceló la entrada
            JOptionPane.showMessageDialog(null, "Operación cancelada", "Información", JOptionPane.INFORMATION_MESSAGE);
            x = false;
        } 
    }while(x);
}