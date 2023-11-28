/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
    //Creación de Objetos de la clase Estudiante
    Estudiante estudianteUno = new Estudiante("Juan", 20,"000123","1° Medio");
    Estudiante estudianteDos = new Estudiante("María", 22,"000982" ,"4° Medio");

    //Llamar a métodos de los objetos
    System.out.println("Estudiante 1");
    estudianteUno.estudiar();
    estudianteDos.informacion();
}