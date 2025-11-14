package Operacao;

import Estrategia.Diretoria;

public class PlanejamentoEstrategico extends Diretoria {
    void teste(){
        System.out.println(super.segredo); //private
        System.out.println(super.memorandoInterno); //package
        System.out.println(super.orcamentoAnual); //protected
        System.out.println(super.missaoDaEmpresa); //pubic

    }
}
