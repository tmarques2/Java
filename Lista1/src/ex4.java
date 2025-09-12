import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.printf("O número informado foi %d, o antecessor é %d e o sucessor é %d", numero, (numero - 1), (numero + 1));
    }
}
