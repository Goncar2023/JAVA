//SUBCLASE GATO
public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override // Indica que estamos sobrescribiendo un método
    public void hacerSonido() {
        System.out.println("El gato MAÚLLA.");
    }

    public void arañar() {
        System.out.println(getNombre() + " está ARAÑANDO.");
    }
}
