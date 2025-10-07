import java.util.Scanner;

public class ex7_lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pergunta1 = "Qual a melhor linguagem de programação?";
        String alternativas1 = "a - Python \nb- Java \nc - Javascript";

        String pergunta2 = "Qual o melhor instrutor da ETS?";
        String alternativas2 = "a - Wilson \nb - Luca \nc - Leo";

        System.out.print("Deseja responder a pergunta 1 ou 2? ");
        int pergunta = scanner.nextInt();
        scanner.nextLine();

        String escolha;

        switch (pergunta) {
            case 1:
                System.out.println(pergunta1);
                System.out.println(alternativas1);
                System.out.print("Escolha a opção:");
                escolha = scanner.nextLine().toLowerCase();
                if (escolha.equalsIgnoreCase("a")) {
                    System.out.println("Quase!");
                } else if (escolha.equalsIgnoreCase("b")) {
                    System.out.println("Acertouuuu");
                } else if (escolha.equalsIgnoreCase("c")){
                    System.out.println("Passou beeeem longe");
                } else {
                    System.out.println("Opção invalida");
                }
                break;

            case 2:
                System.out.println(pergunta2);
                System.out.println(alternativas2);
                System.out.print("Escolha a opção: ");
                escolha = scanner.nextLine().toLowerCase();
                if (escolha.equalsIgnoreCase("a")) {
                    System.out.println("Vixi, nada ve");
                } else if (escolha.equalsIgnoreCase("b")) {
                    System.out.println("Jamais");
                } else if (escolha.equalsIgnoreCase("c")){
                    System.out.println("CLARO Q É O MAIORAL!!!!");
                } else {
                    System.out.println("Opção invalida");
                }
                break;

            default:
                System.out.println("Número de pergunta inválido. escolha 1 ou 2.");
                break;
        }

    }
}
