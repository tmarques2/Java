import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        int numero1 = 9;
        int numero2 = 2;

        System.out.println(numero1+numero2);
        System.out.println(numero1-numero2);
        System.out.println(numero1*numero2);
        System.out.println(numero1/numero2);
        System.out.println(numero1%numero2);
    }
}*/
/*public class Main {
    public static void main(String[] args){
        double potencia = Math.pow(2, 3);       //função para potência, primeiro argumento é a base e o segundo é o expoente
        System.out.println(potencia);

        double raiz = Math.sqrt(4);     //função para raiz quadrada
        System.out.println(raiz);
    }
}*/
public class Main {
    public static void main(String[] args) {
        /*
        * Criar o projeto
        * Comentário de linha unica e multiplas linhas
        * Funções print, println e printf (máscaras de substituição)
        * Tipos de dados primitivos, os 8 tipos byte, short, int long, float double, char, boolean
        * Strings
        * Operadores aritiméticos
        * Funções de potência e raiz
        * Entrada de dados via teclado - scanner
        * */

        /*int numero;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero = input.nextInt();
        System.out.print("O numero que vc digitou foi " + numero);
        input.close();*/

        /*String palavra;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        palavra = entrada.nextLine();
        System.out.print("A palavra que vc digitou foi: " + palavra);
        entrada.close();*/

        /*String nome, sobrenome;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.printf("O meu nome é %s e meu sobrenome é %s", nome,sobrenome);
        scanner.close();*/

        String nome, sobrenome;
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);

    }
}