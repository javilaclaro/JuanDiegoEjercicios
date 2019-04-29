
public class infoNums {
    public static void main(String[] args) {
        int total = 0;
        int numeroMayor = Integer.parseInt(args[0]);
        int numeroMenor = Integer.parseInt(args[0]);
        int count = 0;
        for (String s : args) {
            int num = Integer.parseInt(s);
            total += num;
            count++;
            if (num > numeroMayor) {
                numeroMayor = num;
            }

            if (num < numeroMenor) {
                numeroMenor = num;
            }

        }
        System.out.println("El total es " + total + ", " + count + " numeros introducidos. El numero mayor es "
                + numeroMayor + ", el numero menor es " + numeroMenor + " y la media aritmetica es " + total / count);
    }
}
