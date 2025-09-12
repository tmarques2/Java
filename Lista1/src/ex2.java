import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        double potencia = Math.pow(num1, num2);

        System.out.printf("A soma dos dois numero é: %d", (num1 + num2));
        System.out.printf("\nA subtração dos dois numero é: %d", (num1 - num2));
        System.out.printf("\nA multiplicação dos dois numero é: %d", (num1 * num2));
        System.out.printf("\n%d elevado a %d é: %.2f", num1, num2, potencia);

        if (num2 == 0) {
            System.out.println("\nA divisão não pode ser realizada, pois o segundo numero é 0");
        } else {
            System.out.printf("\nA divisão dos dois numero é: %.2f", ((double) num1 / num2));
            System.out.printf("\nO resto da divisão dos dois numero é: %d", (num1 % num2));
        }
    }
}
