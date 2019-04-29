package animales;


public class Animalitos {
    public static void main(String[] args) {
        Perro toby = new Perro();
        Perro p= (Perro) toby;
        toby.ladra();
        toby.duerme();
    }
}