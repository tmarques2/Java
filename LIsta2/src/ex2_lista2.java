import java.util.Scanner;

public class ex2_lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto: ");
        Double valor_unitario = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Quantas unidades deseja comprar: ");
        int quantidade = scanner.nextInt();

        Double valor_total;

        if (quantidade <= 12){
            valor_total = quantidade * valor_unitario;
            System.out.printf("O valor total é: %.2f", valor_total);
        } else {
            Double valor_desconto = (quantidade * valor_unitario) * 0.1;
            valor_total = (quantidade * valor_unitario) - valor_desconto;
            System.out.printf("O valor total é: %.2f", valor_total);
        }
    }
}
