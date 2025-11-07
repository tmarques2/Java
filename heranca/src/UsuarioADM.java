public class UsuarioAdm extends Usuario{
    public UsuarioAdm(String nome, String senha, String email){
        super(nome, senha, email);

    }

    // Sobrecarga de métodos
    // sobrecarga é sempre quando temos uma relação de herança
    @Override
    void concederAcessos(){
        super.concederAcessos();
        System.out.printf("Usuário %s está com acessos administrativos", this.nome);
    }


}