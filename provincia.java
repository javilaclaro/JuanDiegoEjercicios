import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class provincia {
    public static void main(String[] args) {
        File fin = new File("provincias.txt");
        // List<String> provincias = new ArrayList<String>();
        Set<String> provincias = new TreeSet<String>();
        try (InputStreamReader fr = new InputStreamReader(new FileInputStream(fin), "UTF8");
                BufferedReader br = new BufferedReader(fr);) {
            String linea;
            do {
                linea = br.readLine();
                if (linea != null) {
                    provincias.add(linea);
                }
            } while (linea != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String provincia : provincias) {
            System.out.println(provincia);
        }
    }
}
