public class Case {
    public static void main(String[] args) {
        int opcao = 5;

        /*switch (opcao){
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default:
                System.out.println("Caso padrão");
        }*/

        switch (opcao){
            case 1 -> System.out.println("Caso 1");
            case 2 -> System.out.println("Caso 2");
            case 3 -> System.out.println("Caso 3");
            default -> System.out.println("Caso padrão");
        }
    }
}
