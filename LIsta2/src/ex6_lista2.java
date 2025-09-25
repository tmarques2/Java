import java.util.Random;
import java.util.Scanner;

public class ex6_lista2 {
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = gerador.nextInt(100) + 1;
        int chance = 3;

        System.out.println("Tente acertar o numero secreto!");

        for (int i = 1; i <= chance; i++) {
            System.out.printf("Você tem %d tentativas", (chance - i + 1));
            System.out.print("\nDigite um número de 1 a 100: ");
            int numero = scanner.nextInt();

            if (numero == numeroSecreto) {
                System.out.println("Você acertou!");
                break;
            } else {
                System.out.println("Você errou!");
            }
        }

        System.out.println("O numero era: " + numeroSecreto);

        scanner.close();
    }
}
