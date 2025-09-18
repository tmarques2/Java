import java.util.Scanner;

public class ex4_lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)

        System.out.println("Para onde deseja ir? \n1 - Maceió \n2 - Porto de Galinhas");

        System.out.print("Digite o número da sua opção: ");
        int destino = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Deseja almoço/janta incluso? \n1 - Sim \n2 - Não");

        System.out.print("Digite o número da sua opção: ");
        int comida = scanner.nextInt();
        scanner.nextLine();

        Double valor_base = 3000.00;

        if (destino == 1 && comida == 1){
            System.out.printf("O valor da viagem será: %.2f", valor_base);
        }
    }
}
