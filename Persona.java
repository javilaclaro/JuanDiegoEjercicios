public class Persona {

    public String nombre;
    public int edad;

    public Persona(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }

    @Override
    public boolean equals(Object obj) {
        Persona otra = (Persona) obj;
        if (otra.nombre.equals(this.nombre) && otra.edad == this.edad) {
            return true;
        } else {
            return false;
        }
    }
}