class Listas {
    public static void main(String[] args) {
        int[] lista_numeros = { 23, 4, 3, 2, 5, 534, 1, 54 };

        int[] trio = new int[3];

        trio[0] = 11;
        trio[1] = 77;
        trio[2] = 44;
        trio[3] = 28;

        String ciudad = "Constantinopla";

        for (char letra : ciudad.toCharArray()) {
            System.out.println(letra);
        }

        for (int i = 0; i < ciudad.length(); i++) {
            System.out.print(ciudad.charAt(i));
        }

        for (int numero : lista_numeros) {
            System.out.println(numero);
        }
    }
}