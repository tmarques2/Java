import java.util.ArrayList;
import java.util.Scanner;

public class ex2_lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaDeIdade = new ArrayList<>();
        ArrayList<Double> listaDeAltura = new ArrayList<>();
        ArrayList<Double> listaDePeso = new ArrayList<>();

        int contadorPessoa = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("\nPessoa %d ", contadorPessoa+=1);
            System.out.print("\nDigite sua idade: ");
            int idade = scanner.nextInt();
            listaDeIdade.add(idade);
            scanner.nextLine();

            System.out.print("Digite sua altura (em metros): ");
            double altura = scanner.nextDouble();
            listaDeAltura.add(altura);
            scanner.nextLine();

            System.out.print("Digite seu peso (em kg): ");
            double peso = scanner.nextDouble();
            listaDePeso.add(peso);
            scanner.nextLine();
        }

        /*System.out.println(listaDeIdade);
        System.out.println(listaDeAltura);
        System.out.println(listaDePeso);*/

        int contadorIdade = 0;
        int contadorAltura = 0;
        int contadorPeso = 0;

        for (Integer idade: listaDeIdade) {
            if (idade >= 50) {
                contadorIdade ++;
            }
        }
        System.out.printf("%d pessoas tem a idade acima de 50 anos.", contadorIdade);


        for (Double altura: listaDeAltura) {
            if (altura >= 1.6) {
                contadorAltura++;
            }
        }
        System.out.printf("\n%d pessoas tem altura acima de 1.60m.", contadorAltura);


        for (Double peso: listaDePeso) {
            if (peso <= 80) {
                contadorPeso ++;
            }
        }
        System.out.printf("\n%d pessoas tem o peso abaixo de 80kg.", contadorPeso);
    }
}
