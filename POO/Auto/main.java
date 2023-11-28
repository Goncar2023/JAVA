/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    //Creación de Objetos de la clase AUTO
    Auto autoUno = new Auto("Toyota", "Corolla",2020,"Azul",15000.5);
    //Llamar a métodos de los objetos
    autoUno.acelerar();
    autoUno.mostrarInformacion();
}