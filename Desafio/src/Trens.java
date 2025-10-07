import java.util.InputMismatchException;
import java.util.Scanner;

public class Trens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            double s0a = 0, s0b = 0, va = 0, vb = 0;

            try {
                // Entrada da posição inicial do trem A
                System.out.print("Digite a posição inicial do trem A (km): ");
                s0a = sc.nextDouble();
                if (s0a < 0 || s0a > 10000) {
                    System.out.println("Erro: a posição deve estar entre 0 e 10000 km.");
                    continue;
                }

                // Entrada da posição inicial do trem B
                System.out.print("Digite a posição inicial do trem B (km): ");
                s0b = sc.nextDouble();
                if (s0b < 0 || s0b > 10000) {
                    System.out.println("Erro: a posição deve estar entre 0 e 10000 km.");
                    continue;
                }

                // Entrada da velocidade do trem A
                System.out.print("Digite a velocidade do trem A (km/h): ");
                va = sc.nextDouble();
                if (va <= 0 || va > 300) {
                    System.out.println("Erro: a velocidade do trem A deve ser positiva e no máximo 300 km/h.");
                    continue;
                }

                // Entrada da velocidade do trem B
                System.out.print("Digite a velocidade do trem B (km/h): ");
                vb = sc.nextDouble();
                if (vb >= 0 || Math.abs(vb) > 300) {
                    System.out.println("Erro: a velocidade do trem B deve ser negativa e o módulo no máximo 300 km/h.");
                    continue;
                }

            } catch (InputMismatchException e) {
                System.out.println("Você digitou um caractere inválido. Por favor, digite novamente.");
                sc.nextLine(); // limpa o buffer
                continue;
            }

            // Verifica se irão colidir
            if (va <= Math.abs(vb) && s0a > s0b) {
                System.out.println("Os trens não irão colidir, pois o trem A já está à frente do trem B.");
            } else if (va >= Math.abs(vb) && s0a < s0b && vb == 0) {
                System.out.println("Os trens não irão colidir, pois o trem B está parado e o A não o alcançará.");
            } else {
                // Cálculo do tempo até a colisão (em horas)
                double tempoHoras = (s0a - s0b) / (vb - va);
                if (tempoHoras < 0) {
                    System.out.println("Os trens não irão colidir, pois estão se afastando um do outro.");
                } else {
                    // Converte tempo para segundos
                    double tempoSegundos = tempoHoras * 3600;

                    // Calcula posição da colisão
                    double posicaoColisao = s0a + va * tempoHoras;

                    // Calcula horário da colisão (partindo das 17:00:00)
                    int segundosTotais = (int) Math.round(tempoSegundos);
                    int horas = 17 + segundosTotais / 3600;
                    int minutos = (segundosTotais % 3600) / 60;
                    int segundos = segundosTotais % 60;

                    if (horas >= 24) horas -= 24; // caso ultrapasse o dia

                    System.out.printf("Colisão no km: %.2f%n", posicaoColisao);
                    System.out.printf("Tempo até a colisão: %.0f segundos%n", tempoSegundos);
                    System.out.printf("Horário da colisão: %02d:%02d:%02d%n", horas, minutos, segundos);
                }
            }

            // Pergunta se deseja executar novamente
            System.out.print("Deseja executar novamente? (s/n): ");
            char opcao = sc.next().toLowerCase().charAt(0);
            repetir = (opcao == 's');
        }

        System.out.println("FIM DO PROGRAMA");
        sc.close();
    }
}
