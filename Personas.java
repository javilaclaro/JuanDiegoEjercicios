import java.util.HashSet;
import java.util.Set;

public class Personas {

    public static void main(String[] args) {
        Persona p1 = new Persona("Marta", 22);
        Persona p2 = new Persona("Albert", 25);
        Persona p3 = new Persona("Marta", 12);
        Persona p4 = new Persona("Albert", 25);
        Persona p5 = new Persona("Marta", 12);

        Set<Persona> lista = new HashSet<Persona>();

        if (p1.equals(p3)) {
            System.out.println("p1 igual a p3");
        } else {
            System.out.println("p1 distinto a p3");
        }
        if (p1.equals(p5)) {
            System.out.println("p1 igual a p3");
        } else {
            System.out.println("p1 distinto a p5");
        }

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        System.out.println("total persona: " + lista.size());
    }
}