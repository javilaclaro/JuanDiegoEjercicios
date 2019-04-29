package animales;

class Perro extends Animal {
    public void ladra() {
        System.out.println("Guau!");
    }

    @Override
    public int getNumeroPatas() {
        return 4;
    }
}