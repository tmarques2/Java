import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double p1 = 0.4;
        double p2 = 0.6;
        double media_pond = (nota1 * p1 + nota2 * p2);


        System.out.printf("A media ponderada das notas é: %.2f", media_pond);

    }
}
