import java.util.Scanner;

public class ex1_lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade>=0 && idade <= 14){
            System.out.println("Categoria: Criança");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if (idade >=18 && idade <=30) {
            System.out.println("Categoria: Adulto Jovem");
        } else {
            System.out.println("Categoria: Adulto");
        }
    }
}
