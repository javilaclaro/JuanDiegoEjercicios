import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class motos {
    /**
     *
     */

    private static final String marca = "";

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        // List<String> provincias = new ArrayList<String>();
        Set<String> motos = new TreeSet<String>();
        boolean dentro = true;
        do {
            File fin = new File("motos.csv");
            String pregunta = String.format("Dime la marca que quieres: ");
            System.out.println(pregunta);
            String marca = keyboard.next();
            System.out.println("Dime como quieres llamar al archivo");
            String nombreArchivo = keyboard.next();
            File archivo = new File(nombreArchivo + ".csv");

            try (InputStreamReader fr = new InputStreamReader(new FileInputStream(fin), "UTF8");

                    BufferedReader br = new BufferedReader(fr);
                    FileWriter fw = new FileWriter(archivo);
                    BufferedWriter bw = new BufferedWriter(fw);) {
                String linea;
                do {

                    linea = br.readLine();
                    if (linea != null && linea.toLowerCase().contains(marca)) {
                        bw.newLine();
                        bw.write(linea);
                        motos.add(linea);
                    }
                } while (linea != null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (String moto : motos) {
                System.out.println(moto);
            }
            System.out.println("Se ha creado el archivo " + nombreArchivo + ".csv");
            System.out.println("Quieres crear otro mas?");
            System.out.println("Sí(1) No(2)");
            int preguntaDentro = keyboard.nextInt();
            if (preguntaDentro == 1) {
                dentro = true;
            } else {
                dentro = false;
            }

        } while (dentro = true);
    }
}