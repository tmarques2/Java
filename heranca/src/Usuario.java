public class Usuario {
    String nome, senha, email;

    Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    void autenticar(){
        System.out.printf("Usuário %s está autenticado\n", this.nome);
    }

    //Sobreescrita
    // é quando eu tenho na mesma classe métados com assinaturas diferentes
    // Assinatura é a quantidade e o tipo dos parâmetros de um métedo
    void autenticar(String sobrenome){
        System.out.printf("Usuário %s está autenticado\n", this.nome);
    }

    void concederAcessos(){
        System.out.printf("Usuário %s está com acesso reulares\n", this.nome);
    }

    void configurar(){

    }
}