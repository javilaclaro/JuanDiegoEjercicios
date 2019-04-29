import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Utils {

    public static String[] semana_es = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
    public static String[] semana_ca = { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte",
            "Diumenge" };
    public static String[] semana_en = { "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday", "Sunday" };

    public static String diaSemana(int dia, String lenguaje) {
        int indice = --dia;
        String nombreDia = "";
        if (lenguaje.equals("es")) {
            nombreDia = semana_es[indice];
        } else if (lenguaje.equals("ca")) {
            nombreDia = semana_ca[indice];
        } else {
            nombreDia = semana_en[indice];
        }
        return nombreDia;
    }

    public static String[] mes_es = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Setiembre", "Octubre", "Noviembre", "Diciembre" };
    public static String[] mes_ca = { "Gener", "Febrer", "Març", "", "Mayo", "Junio", "Julio", "Agosto", "Setiembre",
            "Octubre", "Noviembre", "Diciembre" };
    public static String[] mes_en = { "January", "February", "March", "April", "May", "Jun", "July", "August",
            "September", "October", "November", "December" };
    public static char[] mayor;
    public static char[] pares;

    public static String mesAnyo(int mes, String lenguaje) {
        int indiceMes = --mes;
        String nombreMes = "";
        if (lenguaje.equals("es")) {
            nombreMes = mes_es[indiceMes];
        } else if (lenguaje.equals("ca")) {
            nombreMes = mes_ca[indiceMes];
        } else {
            nombreMes = mes_ca[indiceMes];
        }
        return nombreMes;
    }

    public static void mayor(int numeros) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime cuantos numeros me vas a introducir: ");
        int numMayor = Integer.parseInt(scan.nextLine());
        String arrayDeNumeros[] = new String[numMayor];
        for (int i = 0; i < arrayDeNumeros.length; i++) {
            System.out.println("Dime un numero: " + (i++) + " : ");
            arrayDeNumeros[i] = scan.nextLine();
        }

        for (int i = 0; i < arrayDeNumeros.length; i++) {
            System.out.println(numMayor);
        }
    }

    public static String pares() {
        int x = 1;
        while (x != 0) {
            System.out.println("Introduce un numero para saber si es par o impar. Introduce 0 para salir.");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();

            if (x % 2 == 0)
                System.out.println("El numero es par.");
            else
                System.out.println("El numero es impar.");
        }
        return "";
    }

    public static String palindromo() {
        System.out.println("Escribe una palabra para darle la vuelta:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Palabra al reves es:");

        return reverse;
    }

}
