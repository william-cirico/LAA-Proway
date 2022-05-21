// O profissional de Marketin é um funcionário
public class Marketing extends Funcionario {
    public Marketing(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * .15;
    }
}
