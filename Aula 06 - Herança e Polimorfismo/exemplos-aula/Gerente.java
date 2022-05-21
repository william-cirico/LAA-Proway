// Gerente é um funcionário
public class Gerente extends Funcionario implements Autenticavel {
    private Autenticacao autenticacao;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.autenticacao = new Autenticacao();
        this.setSenha(senha);
    }    

    @Override
    public double getBonificacao() {
        return super.getSalario() * .2;
    }

    @Override
    public boolean autentica(String senha) {
        return this.autenticacao.autentica(senha);
    }

    @Override
    public String getSenha() {
        return this.autenticacao.getSenha();
    }  
    
    @Override
    public void setSenha(String senha) {
        this.autenticacao.setSenha(senha);
    }  
}
