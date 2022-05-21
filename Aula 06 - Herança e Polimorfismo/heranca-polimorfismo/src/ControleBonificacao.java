public class ControleBonificacao {
    private double total;

    // public void registraBonificacao(Gerente gerente) {
    //     this.total += gerente.getBonificacao();
    // }

    public void registraBonificacao(Funcionario funcionario) {
        this.total += funcionario.getBonificacao();
    }

    // public void registraBonificacao(Diretor diretor) {
    //     this.total += diretor.getBonificacao();
    // }

    public double getTotal() {
        return this.total;
    }
}
