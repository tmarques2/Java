import java.util.Scanner;

public class ex3_lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===PALMEIRAS x CORINTHIANS===");

        System.out.print("Digite a quantidade de gol do Palmeiras: ");
        int pal = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a quantidade de gols do Corinthians(eca): ");
        int cor = scanner.nextInt();

        if (pal == cor){
            System.out.println("EMPATEE!");
        } else if (pal > cor) {
            System.out.println("O maioral o ganhou");
        } else {
            System.out.println("Corinthians ganhou (impossivel)");
        }
    }
}
