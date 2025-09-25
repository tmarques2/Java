import java.util.ArrayList;
import java.util.Scanner;

public class ex5_lista3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        int totalPessoas = 0;
        int saldosPositivos = 0;
        int saldosNegativos = 0;
        double saldo;
        String continuar;

        do{
            System.out.print("Digite seu saldo: ");
            saldo=scanner.nextDouble();

            totalPessoas ++;

            if (saldo > 0) {
                saldosPositivos ++;
            } else {
                saldosNegativos ++;
            }

            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next().toLowerCase();
        } while (continuar.equalsIgnoreCase("s"));
        

        double percentualPositivos = (double) saldosPositivos / totalPessoas;

        if (percentualPositivos >= 0.05) {
            System.out.printf("Numero de saldos positivos: %d\n", saldosPositivos);
            System.out.println("Nenhum risco ao banco!");
        } else {
            System.out.printf("Numero de saldos negativos: %d\n", saldosNegativos);
            System.out.println("Risco ao banco!");
        }
    }
}
