import java.util.Scanner;

public class ex5_lista2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        int qtd_estoque = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a quantidade máxima do estoque: ");
        int qtd_max = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a quantidade mínima do estoque: ");
        int qtd_min = scanner.nextInt();

        int qtd_media = (qtd_max + qtd_min) / 2;

        if (qtd_estoque >= qtd_media) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
