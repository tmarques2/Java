package CasaB;

import CasaA.Rebeca;

public class Eric {
    Rebeca sogra = new Rebeca();

    void teste(){
        System.out.println(sogra.segredo);  //private
        System.out.println(sogra.facoDentroDeCasa); //package
        System.out.println(sogra.familiaSabe);  //protected
        System.out.println(sogra.todoMundoSabe);    //public
    }
}
