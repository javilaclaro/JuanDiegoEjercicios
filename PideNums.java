
import java.util.Scanner;

public class PideNums {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int num = 0;
        do {
            System.out.println("Entra un num: ");
            try {
                num = keyboard.nextInt();
                total += num;
            } catch (Exception e) {
                System.out.println("***Dato incorrecto - pulsa 0 para salir***");
                keyboard.next();
            }
            num = keyboard.nextInt();
            total += num;
        } while (num > 0);

        System.out.println("La suma es " + total);
        keyboard.close();
    }
}