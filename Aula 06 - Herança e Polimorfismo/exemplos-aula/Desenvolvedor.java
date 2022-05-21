// Desenvolvedor é um funcionário
public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, String cpf, double salario) {
        // Chamar o construtor da classe funcionário
        super(nome, cpf, salario);
    }

    // O método que está na classe filha sobreescreva o método que está na classe pai.
    // public double getBonificacao() {
    //     // super -> Funcionario
    //     return super.getSalario() * .1;
    // }

    @Override
    public double getBonificacao() {
        return super.getSalario() * .1;
    }
}
