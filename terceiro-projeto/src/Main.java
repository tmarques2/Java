import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        String valor = "";

        //Toda vez que o usuario digitar algo diferente de sair, o codigo continua,
        //quando o usuario digitar a palavra sair, o codigo encerra.

        //Strings só se compara com o metodo equals, não utilize ==
        //Só se utiliza ==para tipo primitivo de dados: int, double, boolean e etc.
        while (!valor.equalsIgnoreCase("sair")){
            System.out.println("Digite algo: ");
            valor = entrada.nextLine();
        }
        entrada.close();*/


        /*Scanner entrada = new Scanner(System.in);
        int contador = 0, acumulador = 0;

        while (contador<5){
            System.out.println(contador);
            contador++;
            System.out.print("Digite um numero: ");
            acumulador+=entrada.nextInt();
            entrada.nextLine();
            System.out.printf("Contador está em %d e " + "o acumulador em %d\n", contador, acumulador);
        }*/

        /*for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=10; j++) {
                int resultado = i * j;
                System.out.printf("%d"+"x"+"%d"+"="+"%d\n", i, j, resultado);
            }
        }*/

        /*int i = 1;
        while(i<=10){
            int j = 1;
            while(j<=10) {
                int resultado = i * j;
                System.out.printf("%d" + "x" + "%d" + "=" + "%d\n", i, j, resultado);
                j++;
            }
            i++;
        }*/


        /*Scanner entrada = new Scanner(System.in);
        String valor;

        do{
            System.out.println("Diga algo: ");
            valor = entrada.nextLine();
        }while (!valor.equalsIgnoreCase("algo"));
        entrada.close();*/

        /*Scanner scanner = new Scanner(System.in);

        try {
            int numero = scanner.nextInt();
            System.out.println(numero);
        }catch (InputMismatchException e){
            System.out.println("Digite apenas numeros: ");
        }*/

        //Scanner scanner = new Scanner(System.in);
        //String numeroEmTexto = scanner.nextLine();
        //WRAPPER
        //Tipos primitivos: são básicos, eles salvam apenas valores
        //Wrappers: Eles são complexos, tem valores e funções
        //Exemplos de Wrappers: Integer, Double, Boolean, Character
        //Obs: tipo primitivo são com letras minuscula, o wrappers iniciam com letra maiuscula

        //parseInt -- Converte Strings em numeros inteiros
        /*int numeroEmInt = Integer.parseInt(numeroEmTexto);
        Double numeroEmDouble = Double.parseDouble(numeroEmTexto);

        int numero = 18;
        //ToString -- converte número em Strings
        String numeroEmString = Integer.toString(numero);

        System.out.println(numeroEmString+18);*/
    }
}