import java.util.Scanner;

public class ex4_lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para onde deseja ir? \n1 - Maceió \n2 - Porto de Galinhas");

        System.out.print("Digite o número da sua opção: ");
        int destino = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Deseja almoço/janta incluso? \n1 - Sim \n2 - Não");

        System.out.print("Digite o número da sua opção: ");
        int comida = scanner.nextInt();
        scanner.nextLine();

        Double valor_base = 3000.00;
        Double desconto;
        Double valor_final;

        if (destino == 1 && comida == 1){
            System.out.printf("O valor da viagem será: %.2f", valor_base);
        } else if (destino == 1 && comida == 2) {
            desconto = valor_base * 0.85;
            valor_final = valor_base - desconto;
            System.out.printf("O valor da viagem será: %.2f", valor_final);
        } else if (destino == 2 && comida == 1) {
            desconto = valor_base * 0.6;
            valor_final = valor_base - desconto;
            System.out.printf("O valor da viagem será: %.2f", valor_final);
        } else if (destino == 2 && comida == 2) {
            desconto = valor_base * 0.45;
            valor_final = valor_base - desconto;
            System.out.printf("O valor da viagem será: %.2f", valor_final);
        } else {
            System.out.println("Essa opção não existe");
        }
    }
}
