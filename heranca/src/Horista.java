public class Horista extends Colaborador{
    double horasTrabalhadas;
    double salarioPorHora;

    public Horista(int edv, String nome, String cargo, double horasTrabalhadas, double salarioPorHora){
        super(edv, nome, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }
    double receberSalario(){
        return this.salarioPorHora * this.horasTrabalhadas;
    }
}
