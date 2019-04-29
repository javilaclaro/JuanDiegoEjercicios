package src.main.java.com.sjava.simpleweb;

import java.util.ArrayList;
import java.util.List;

public class PersonaController {

    public static List<Persona> agenda = new ArrayList<Persona>();

    public static void inicializa() {
        agenda.clear();
        agenda.add(new Persona("Maria", "maria@gmail.com", 1));
        agenda.add(new Persona("Albert", "albert@gmail.com", 2));
        agenda.add(new Persona("Pere", "pere@gmail.com", 3));
        agenda.add(new Persona("Helena", "Helena@gmail.com", 4));
    }

    public static Persona getById(int id_a_encontrar) {

        for (Persona p : agenda) {
            if (p.id == id_a_encontrar) {
                return p;
            }
        }

        return null;
    }

}