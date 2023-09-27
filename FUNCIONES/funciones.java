/*
    Son fragmentos de código reutilizables que pueden ser llamados (invocados) 
    desde otras partes del programa.
    Se utilizan para dividir un programa en piezas más pequeñas y manejables, 
    lo que facilita la: 
    1.- Organización de código
    2.- Reutilización de código
    3.- Mantenimiento del programa
*/

public static void main(String[] args) {
    //ARGUMENTOS
    String nombre = "María Rojas";
            //PARÁMETROS
    saludar(nombre); 

    int a = 10, b = 20, resta;
    double x = 10.0, y=20.0;
    sumar(a,b);
    sumar(x,y);
    resta = restar(a,b);
    System.out.println("RESTA: "+resta);
}

//Método que no devuelve ningún valor void -> VACÍO
public static void saludar(String nombre){
    System.out.println("Hola, "+nombre);
}

//Los métodos estáticos se asocian con la clase en lugar de con una instancia de la clase.
private static void sumar(int a, int b) {
    int resultado = a + b;
    System.out.println("SUMA: "+resultado);
}
private static void sumar(double x, double y) {
    double resultado = x + y;
    System.out.println("SUMA: "+resultado);
}
//retorna valores
private static int restar(int a, int b) {
    int resultado = b - a;
    return resultado;
}