import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o mês: ");
        String mes = scanner.nextLine();

        System.out.print("Número de carros vendidos pelo vendedor: ");
        int carros = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Valor total das vendas do mês: ");
        double valor_venda = scanner.nextDouble();

        double comissao = valor_venda * 0.00001;
        double comissao_carro = 350 * carros;
        double salario = 1550 + comissao_carro + comissao;
        System.out.printf("\nVendedor: %s \nMês: %s \nNúmero de carros vendidos: %d \nValor total das vendas no mês: %.2f \n\nComissão do valor da venda do mês: %.2f \nComissão por carro vendido: %.2f \nSalário total: %.2f",
                nome, mes, carros, valor_venda, comissao, comissao_carro, salario);
    }
}
