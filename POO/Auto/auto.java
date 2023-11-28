/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea una nueva clase
    -> Copia el código y pegalo dentro de la clase recién creada proyecto.
*/
public class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double kilometraje;

    // Constructor
    public Auto(String marca, String modelo, int año, String color, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    // Métodos
    public void encender() {
        System.out.println("El auto está ENCENDIDO");
    }

    public void apagar() {
        System.out.println("El vehículo está APAGADO");
    }

    public void acelerar() {
        System.out.println("El vehículo está ACELERANDO");
    }

    public void frenar() {
        System.out.println("El vehículo está FRENANDO");
    }

    public void mostrarInformacion() {
        System.out.println("=================================");
        System.out.println("       INFORMACIÓN DEL AUTO      ");
        System.out.println("=================================");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("=================================");
    }
}