import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de compra da mercadoria: ");
        double valor_compra = scanner.nextDouble();

        double representante = valor_compra * 0.2;
        double impostos = valor_compra * 0.3;
        double valor_venda = valor_compra + representante + impostos;

        System.out.printf("\nValor do representante: %.2f", representante);
        System.out.printf("\nValor dos impostos: %.2f", impostos);
        System.out.printf("\nO valor de venda da mercadoria é: %.2f", valor_venda);
    }
}
