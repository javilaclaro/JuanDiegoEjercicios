package webapp.miapp.src.main.java.webapp.miapp;

public class App 
{
    public static void main( String[] args )
    {
        new Persona("ana", 1995, "ana@gmail.com");
        new Persona("claudia", 1999, "claudia@gmail.com");
        PersonaController.muestraContactos();
    }
}
