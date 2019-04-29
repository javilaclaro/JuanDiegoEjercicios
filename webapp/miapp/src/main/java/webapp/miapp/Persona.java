package webapp.miapp.src.main.java.webapp.miapp;

public class Persona {

    private String nombre;
    private String email;
    private int anyo;

    public Persona(String nombre, int anyo, String email) {
        this.nombre = nombre;
        this.email = email;
        this.anyo = anyo;
        PersonaController.nuevoContacto(this);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAnyo() {
        return this.anyo;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.nombre, this.email);
    }

}
