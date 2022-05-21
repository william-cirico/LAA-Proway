// Assinando um contrato
public class Diretor extends Funcionario implements Autenticavel {
    private Autenticacao autenticacao;

    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.autenticacao = new Autenticacao();
    }

    public double getBonificacao() {
        return super.getSalario() + 5000;
    }

    @Override
    public boolean autenticacao(String senha) {
        return this.autenticacao(senha);
    }

    @Override
    public void setSenha(String senha) {
        this.autenticacao.setSenha(senha);
    }
}
