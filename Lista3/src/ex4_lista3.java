import java.util.Scanner;

public class ex4_lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, incremento;
        int contador = 0;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite um incremento: ");
        incremento = scanner.nextInt();

        while (contador < numero) {
            contador += incremento;
            System.out.println(contador);
        }
    }
}
