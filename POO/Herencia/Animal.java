/*
    La clase Animal es la SUPERCLASE que contiene atributos y métodos comunes a todos los animales.
*/
public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Se ANULA con los métodos de la SUBCLASE
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

/*
    La clase Perro y Gato son SUBCLASES que heredan de la clase ANIMAL
*/
class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    //Anular
    @Override // Indica que estamos sobrescribiendo un método
    public void hacerSonido() {
        System.out.println("El perro LADRA.");
    }

    public void jugar() {
        System.out.println(getNombre() + " está JUGANDO.");
    }
}