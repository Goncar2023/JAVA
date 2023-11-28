
// Clase abstracta que representa una FRUTA
public abstract class Fruta {
    String nombre;

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para obtener el nombre de la fruta
    public abstract String getNombre();

    // Método abstracto para obtener el color de la fruta
    public abstract String getColor();

    // Método abstracto para obtener el sabor de la fruta
    public abstract String getSabor();

    // Método abstracto para mostrar información sobre la fruta
    public abstract void mostrarInformacion();
}

// Subclase que representa una FRUTILLA - Hereda de FRUTA
class Frutilla extends Fruta {
    private String color;
    private String sabor;

    public Frutilla(String nombre, String color, String sabor) {
        super(nombre);
        this.color = color;
        this.sabor = sabor;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSabor() {
        return sabor;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Fruta: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Sabor: " + getSabor());
    }
}
