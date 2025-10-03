public class Departamento {
    String nome;
    double orcamento;
    int numeroFuncionarios;

    public Departamento(String nome, double orcamento, int numeroFuncionarios){
        this.nome = nome;
        this.orcamento = orcamento;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    void atualizarNome(String nome) {
        //void sao metodos que nao possuem retorno
        this.nome = nome;
    }

    void exibirDetalhes(){
        System.out.printf("O departamento de %s está com %d funcionarios e com o orçamento de %.2f\n", this.nome, this.numeroFuncionarios, this.orcamento);
    }

    double calcularAumentoOrcamento(double percentual){
        return (orcamento * percentual)+orcamento;
    }

    double obterNumerodeFuncionarios(){
        return numeroFuncionarios;
    }
}
