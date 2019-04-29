
public class Person {
    String nombre;
    int edad;

    void saluda() {
        System.out.println("Hola me llamo año " + this.nombre);
    }

    void saluda(Person otra) {
        if (this.edad > otra.edad) {
            System.out.println("Hola me llamo " + this.nombre + " y soy mayor que " + otra.nombre);
        } else {
            System.out.println("Hola me llamo " + this.nombre + " y soy más joven que " + otra.nombre);
        }

    }
}