import java.util.Scanner;
public class Exercicios {
    public static void main(String[] args) {
//1
/*
    double temperatura;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a temperatura em graus fahrenheit: ");
    temperatura = scanner.nextDouble();

    double celsius = (temperatura - 32) / 1.8;
    System.out.println("A temperatura em celsius é: " + celsius);
 */


//2
/*
    double temperatura;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a temperatura em graus celsius: ");
    temperatura = scanner.nextDouble();

    double fahrenheit = temperatura*1.8 + 32;
    System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
 */

//3
/*
        double altura;
        double peso;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso(kg): ");
        peso = scanner.nextDouble();

        System.out.println("Digite sua altura(m): ");
        altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        System.out.println("O seu IMC é: " + imc);

        scanner.close();
*/

//4
/*
    double valor;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    valor = scanner.nextDouble();

    System.out.println("O número ao quadrado é: " + Math.pow(valor, 2));
    System.out.println("O número ao cubo é: " + Math.pow(valor, 3));
*/

//5
/*
    double base;
    double altura;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Base do triângulo: ");
    base = scanner.nextDouble();

    System.out.println("ALtura do triângulo: ");
    altura = scanner.nextDouble();

    double area = (base * altura) / 2;
    System.out.println("Área do triângulo: " + area);
*/

//6
        /*
    int a = 1;
    int b = 12;
    int c = -13;
    double delta = Math.pow(b, 2) - 4 * a * c;

    System.out.println("Delta é igual a: " + delta);
    }
}

         */
        //desafio1
        double v = -1;
        double x = -3;
        double a = 3 * Math.pow((x / 4), -2) + 6 * (Math.pow(3, v) / 4) - 4;
        double b = 7 * Math.pow((x / 4   ), v) + 2;
        double c = Math.pow((a / b), v) + 4;
        System.out.println(c);
    }
}