import java.util.ArrayList;
import java.util.List;

public class Listatest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("barcelona");
        lista.add("mataro");
        lista.add("Grandorleos");

        for (String ciudad : lista) {
            System.out.println(lista);
        }
    }
}