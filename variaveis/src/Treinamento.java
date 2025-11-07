public class Treinamento {
    String nome;
    double preco;
    boolean excluisivoGestores;

    Instrutor instrutor;

    public Treinamento(String nome, double preco, boolean excluisivoGestores, Instrutor instrutor) {
        this.nome = nome;
        this.preco = preco;
        this.excluisivoGestores = excluisivoGestores;
        this.instrutor = instrutor;
    }

    public Treinamento() {
    }

    @Override
    public String toString() {
        return String.format("O treinamento de %s está " +
                "com o preço R$%.2f e " +
                "ele %s exclusivo para gestores e ministrado pelo treinador %s", this.nome, this.preco, this.excluisivoGestores ? "é": "não é", this.instrutor);
    }
}
