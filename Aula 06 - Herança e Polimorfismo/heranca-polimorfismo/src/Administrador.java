public class Administrador extends Funcionario implements Autenticavel {
    private String senha;

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return 0;
    }

    @Override
    public boolean autenticacao(String senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
