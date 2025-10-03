import java.util.Scanner;

public class ex7_lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomePesado = "";
        double maisPesado = 0;
        String nomeAlto = "";
        double maisAlto = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu peso: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            if (peso > maisPesado) {
                maisPesado = peso;
                nomePesado = nome;
            }

            if (altura > maisAlto) {
                maisAlto = altura;
                nomeAlto = nome;
            }
        }
        scanner.close();

        System.out.printf("A pessoa mais pesada é %s com %.2f Kg.", nomePesado, maisPesado);
        System.out.printf("\nA pessoa mais alta é %s com %.2f m.", nomeAlto, maisAlto);

    }
}
