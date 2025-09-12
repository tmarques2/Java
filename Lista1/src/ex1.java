import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao Processo Seletivo da BOSCH!");
        System.out.println("Para continuar sua inscrição, é necessário algumas informações: ");

        Scanner scanner = new Scanner(System.in);

        //nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        //sobrenome
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        //Data de nascimento
        System.out.print("Digite sua data de nascimento: ");
        String data = scanner.nextLine();

        //Pretensão salarial
        System.out.print("Digite sua pretensão salarial: ");
        Double salario = scanner.nextDouble();
        scanner.nextLine();

        //Grau de instrução
        System.out.print("Digite seu grau de instrução (ensino médio, ensino técnico ou ensino superior): ");
        String grau = scanner.nextLine();

        //Cargo pretendido
        System.out.print("Digite seu cargo pretendido: ");
        String cargo = scanner.nextLine();

        //CNH
        System.out.print("Possui CNH tipo B (Sim/Não): ");
        String cnh = scanner.nextLine();

        System.out.printf("Seu cadastro foi confirmado! \nNome: %s \nSobrenome: %s \nData de nascimento: %s \nPretensão Salarial: %f \nGrau de instrução: %s \nCargo Pretendido: %s \nPossui CNH tipo B: %s",
                nome, sobrenome, data, salario, grau, cargo, cnh);
    }
}