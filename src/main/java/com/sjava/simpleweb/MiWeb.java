package src.main.java.com.sjava.simpleweb;

public class MiWeb {

    public static String miLista(String[] elementos) {
        String lista_html = "<ul>";
        for (String elemento : elementos) {
            lista_html = lista_html + "<li>" + elemento + "</li>";
        }
        lista_html = lista_html + "</ul>";
        return lista_html;
    }

    public static String tablaPersonas() {

        String tabla = "<table class='agenda'>";
        tabla += "<tr><th>Id</th><th>Nombre</th><th>Email</th></tr>";
        for (Persona p : PersonaController.agenda) {
            String linea = String.format("<tr><td>%d</td><td><a href='detalle.jsp?id=%d'>%s</a></td><td>%s</td></tr>",
                    p.id, p.id, p.nombre, p.email);
            tabla += linea;
        }
        tabla += "</table>";
        return tabla;

    }

}