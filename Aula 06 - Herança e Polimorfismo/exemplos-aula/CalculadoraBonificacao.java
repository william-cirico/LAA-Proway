public class CalculadoraBonificacao {
    private double totalBonificacao;

    public void adicionaBonificacao(Funcionario funcionario) {
        this.totalBonificacao += funcionario.getBonificacao();
    }

    public double getTotalBonificacao() {
        return this.totalBonificacao;
    }
}
