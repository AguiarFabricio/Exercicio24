package exercicio24;

public class Exercicio24 {

    public static void main(String[] args) {
        int numero = 13;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 23);
    }
}
