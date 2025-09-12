import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        int total_segundos = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("O total em segundos é: " + total_segundos);
    }
}
