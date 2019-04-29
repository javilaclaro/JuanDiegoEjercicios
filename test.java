import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String lenguaje = new String("ca");
        int dia = 3;
        System.out.println("El dia num " + dia + " es " + Utils.diaSemana(dia, lenguaje));
        int mes2 = 4;
        System.out.println("El mes num " + mes2 + " es " + Utils.mesAnyo(mes2, lenguaje));
        System.out.println(Utils.palindromo());
        System.out.println(Utils.pares());

    }

}