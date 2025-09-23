import java.util.Random;
import java.util.Scanner;

public class ex6_lista2 {
    public static void main(String[] args) {
        Random gerador = new Random();

        for (int i = 1; i < 2; i++) {
            System.out.println(gerador.nextInt(101));
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 100: ");
        int numero = scanner.nextInt();

        if (numero == gerador)
    }
}
