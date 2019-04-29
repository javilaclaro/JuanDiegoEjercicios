package sjava_03;

public class SumaNums {
    public static void main(String[] args) {
        int total = 0;
        for (String s : args) {
            int num = Integer.parseInt(s);
            total += num;
        }
        System.out.println("El total es " + total);
    }
}
