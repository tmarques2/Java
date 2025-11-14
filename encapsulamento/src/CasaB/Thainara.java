package CasaB;

import CasaA.Rebeca;

public class Thainara extends Rebeca {
    void teste(){
        System.out.println(super.segredo);  //private - só ve na msm classe
        System.out.println(super.facoDentroDeCasa); //package - só ve no msm pacote
        System.out.println(super.familiaSabe);  //protected - pode ser de pacotes diferentes, desde que seja herança
        System.out.println(super.todoMundoSabe);    //public - todas as classes podem visualizar
    }
}
