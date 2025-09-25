import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3_lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcoes = "\n1- Ótimo \n2- Bom \n3- Ruim";

        int otimo = 0, bom = 0, ruim = 0, total = 0, somaNotas = 0;
        String continuar;

         do {
            System.out.println("\nQual sua opção sobre o filme Crepúsculo?" + opcoes);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    otimo ++;
                    total ++;
                    somaNotas +=1;
                    break;
                case 2:
                    bom ++;
                    total ++;
                    somaNotas += 2;
                    break;
                case 3:
                    ruim ++;
                    total ++;
                    somaNotas +=3;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

             System.out.print("Deseja continuar? (s/n): ");
             continuar = scanner.next().toLowerCase();

        } while (continuar.equalsIgnoreCase("s"));

        double pctotimo = (otimo * 100) / total;
        double pctbom = (bom * 100) / total;
        double pctruim = (ruim * 100) / total;
        double media = (double) somaNotas / total;


        System.out.println("\nResultados: ");
        System.out.printf("Total de pessoas que responderam: %d\n", total);
        System.out.printf("Otimo: %d pessoas - %.2f %%\n", otimo, pctotimo);
        System.out.printf("Bom: %d pessoas - %.2f %%\n", bom, pctbom);
        System.out.printf("Ruim: %d pessoas - %.2f %%\n", ruim, pctruim);
        System.out.printf("Média das notas: %.2f\n", media);

        scanner.close();
    }
}
