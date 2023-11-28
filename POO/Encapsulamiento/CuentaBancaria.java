/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea una nueva clase
    -> Copia el código y pegalo dentro de la clase recién creada proyecto.
*/
import javax.swing.JOptionPane;

public class CuentaBancaria {
    //ATRIBUTOS
    private String titular;
    private int saldo;

    //CONSTRUCTOR
    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    //GETTER AND SETTER
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    //MÉTODOS PARA TRANSACCIONES
    public void depositar(int deposito){
        if(validarNum(deposito)){
            saldo += deposito;
            JOptionPane.showMessageDialog(null, "Se ha realizado el DEPOSITO");
        }
    }
    
    public void retirar(int retiro){
        if(validarNum(retiro)){
            if(validarCantidad(retiro)){
                saldo -= retiro;
                JOptionPane.showMessageDialog(null, "Se ha realizado el RETIRO");
            }  
        }
    }
    
    public void transferir(int transfiere, String cuenta){
        if(validarNum(transfiere)){
            if(validarCantidad(transfiere)){
                saldo -= transfiere;
                JOptionPane.showMessageDialog(null, "Se ha realizado la TRANSFERENCIA \n a la cuenta "+cuenta);
            }  
        }
    }
    
    //MÉTODOS PARA VALIDACIONES
    private boolean validarNum(int numero){
        if(numero > 0 ){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Número no válido", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    private boolean validarCantidad(int cantidad){
        if(cantidad <= saldo ){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
}
