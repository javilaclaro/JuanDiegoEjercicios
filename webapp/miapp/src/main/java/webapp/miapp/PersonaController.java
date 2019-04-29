package webapp.miapp.src.main.java.webapp.miapp;

import java.util.ArrayList;

public class PersonaController {

    private static ArrayList<Persona> contactos = new ArrayList<Persona>();

    public static void muestraContactos() {
        for (Persona p : contactos) {
            System.out.println(p);
        }
    }

    public static ArrayList<Persona> getContactos() {
        return contactos;
    }

    public static void nuevoContacto(Persona pers) {
        contactos.add(pers);
    }

    public static int numContactos() {
        return contactos.size();
    }
}
