/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea una nueva clase
    -> Copia el código y pegalo dentro de la clase recién creada proyecto.
*/
public class Estudiante {
    // Atributos (características del estudiante)
    String nombre;
    int edad;
    String matricula;
    String curso;

    /*
        Constructor para inicializar un objeto Estudiante
        El constructor Estudiante se utiliza para crear objetos de la clase e inicializar sus atributos.
        Asigna valores iniciales a los atributos de un objeto cuando se crea una instancia de la clase
    */
    public Estudiante(String nombre, int edad,String matricula, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.curso = curso;
    }

    //Métodos (comportamientos o acciones del estudiante)
    public void estudiar() {
        System.out.println(nombre + " está cursando " + curso);
    }

    public void informacion(){
        System.out.println(" ");
        System.out.println("----------------------------");
        System.out.println("INFORMACIÓN DEL ESTUDIANTE");
        System.out.println("----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Matrícula: "+matricula);
        System.out.println("Curso: " + curso);
        System.out.println("----------------------------");

    }
}