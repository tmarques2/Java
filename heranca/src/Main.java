public class Main {
    public static void main(String[] args) {

//    Colaborador ana = new Colaborador(92900000, "Ana C", "Desenvolvedora");
//    System.out.println(ana.nome);

//        Mensalista mensalista = new Mensalista(91900010, "Emily", "Analista", 4000);
//        System.out.println(mensalista);


//        Horista gabriel = new Horista(92907421, "Gabriel", "Operador de Manufatura", 240, 8.50);
//        System.out.printf("O salário de Gabriel é: %.2fR$", gabriel.receberSalario());


//        Usuario usuario = new Usuario("Isabela", "12345678", "isabela@email.com");
//        usuario.autenticar();
//        usuario.concederAcessos();

//        UsuarioAdmin usuarioAdmin = new UsuarioAdmin("Murilo", "12345678", "murilo@email.com");
//        usuarioAdmin.autenticar();
//        usuarioAdmin.concederAcessos();



        // ENUM

        Prioridade prioridade = Prioridade.URGENTE;

        switch (prioridade){
            case BAIXA -> System.out.println("Chamado com prioridade baixa, resolver quando houver disponibilidade.");
            case MEDIA -> System.out.println("Chamado com prioridade média, resolver assim que possível.");
            case ALTA -> System.out.println("Chamado com prioridade alta, resolver o quanto antes.");
            case URGENTE -> System.out.println("Chamado urgente, resolver imediatamente.");
        }
    }
}