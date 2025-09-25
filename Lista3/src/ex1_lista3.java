import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ex1_lista3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            listaDeNumeros.add(num);
        }
        /*System.out.println(listaDeNumeros);*/

        String opcoes = "a. Quantos números pares?\n" +
                "b. Quantos números ímpares?\n" +
                "c. Quantos negativos?\n" +
                "d. Quantos positivos?\n" +
                "e. Sair do programa";

        while (true) {

            System.out.println("\nO que deseja saber?");
            System.out.println(opcoes);
            System.out.println("Escolha uma opção: ");
            String escolha = scanner.nextLine().toLowerCase();

            int contador = 0;
            try {

                switch (escolha) {
                    case "a":
                        for (Integer num : listaDeNumeros) {
                            if (num % 2 == 0) {
                                contador++;
                            }
                        }
                        System.out.printf("Possuem %d numeros pares", contador);
                        break;

                    case "b":
                        for (Integer num : listaDeNumeros) {
                            if (num % 2 != 0) {
                                contador++;
                            }
                        }
                        System.out.printf("Possuem %d numeros impares", contador);
                        break;

                    case "c":
                        for (Integer num : listaDeNumeros) {
                            if (num < 0) {
                                contador++;
                            }
                        }
                        System.out.printf("Possuem %d numeros negativos", contador);
                        break;

                    case "d":
                        for (Integer num : listaDeNumeros) {
                            if (num >= 0) {
                                contador++;
                            }
                        }
                        System.out.printf("Possuem %d numeros positivos", contador);
                        break;

                    case "e":
                        System.out.println("Saindo...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opção inválida");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido.");
                scanner.next();
            }
        }
    }
}