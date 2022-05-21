public class Gerente extends Funcionario implements Autenticavel {
    private Autenticacao autenticacao;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.autenticacao = new Autenticacao();
    }

    // public double getBonificacao() {
    //     return super.salario;
    // }

    // public double getBonificacao() {
    //     // return (super.salario * .1) + super.salario;
    //     return super.getBonificacao() + super.getSalario();
    // }

    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public boolean autenticacao(String senha) {
        return this.autenticacao.autenticacao(senha);
    }

    @Override
    public void setSenha(String senha) {
        this.autenticacao.setSenha(senha);
    }
}
