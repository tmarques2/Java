public class Main {
    public static void main(String[] args) {
//        Colaborador colaborador = new Colaborador("Thainara");    //instanciação
//        Colaborador colaborador1 = new Colaborador("Thainara", 92900000);
//        Colaborador colaborador2 = new Colaborador("Thainara", 92900000, "aprendiz");
////        colaborador.nome = "Thainara";
////        colaborador.cargo = "Aprendiz";
////        colaborador.edv = 92900000;
//        System.out.println(colaborador.nome);


        Departamento departamento = new Departamento("ETS", 1000000, 200);
        System.out.println(departamento.nome);
        departamento.atualizarNome("ETC");
        System.out.println(departamento.nome);

        departamento.exibirDetalhes();
        System.out.println("O orcamento foi de : " + departamento.calcularAumentoOrcamento(0.2));
        System.out.printf("O departamento %s tem %.0f funcionarios", departamento.nome, departamento.obterNumerodeFuncionarios());
    }
}