package sjava_03;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        String cadena;
        Scanner scan = new Scanner(System.in);
        char letra;
        System.out.println();
        System.out.println();
        System.out.print("Escribe la palabra: ");
        cadena = scan.nextLine();

        StringBuilder palabra = new StringBuilder(cadena);

        String inversa = palabra.reverse().toString();
        System.out.println();
        System.out.println();

        System.out.print(inversa);
        System.out.println();
        System.out.println();

        scan.close();
    }

}