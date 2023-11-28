public static void main(String[] args) {
    //Creación de Objetos de la clase ANIMAL
    Animal animalUno = new Perro("Pluto", 3);
    Animal animalDos = new Gato("Niebla", 5);

    /*
        El POLIMORFISMO permite que objetos de diferentes clases respondan de manera similar a un conjunto común de métodos
    */
    animalUno.hacerSonido();
    animalDos.hacerSonido();

    //Podemos llamar a métodos específicos de las SUBCLASES
    ((Perro)animalUno).jugar();
    ((Gato) animalDos).arañar();
}