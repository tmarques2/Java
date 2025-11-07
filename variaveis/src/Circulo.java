public class Circulo {
    /* Cor e raio são variveis dinamicas, elas mudam de acordo com o objeto instanciado */
    String cor;
    double raio;
    /* pi é uma varivel estatica, ela pertence a classe, oe seja, cada vez que uma instancia se referir ao pi
    * ele sempre usará o mesmo espaço de memória que foi alocado*/
    static final double PI = Math.PI;

    public Circulo(String cor, double raio){
        this.cor = cor;
        this.raio = raio;
    }

    double calcularArea(){
        return PI*this.raio*this.raio;
    }
}
