public class App {
    public static void main(String[] args) throws Exception {
        Desenvolvedor desenvolvedor = new Desenvolvedor("William", "110.111.111-11", 1000);        

        Gerente gerente = new Gerente("Carlos", "222.222.111-11", 3000, "123456");

        // System.out.println("Salário do DEV: " + desenvolvedor.getSalario());
        // System.out.println("Salário do gerente: " + gerente.getSalario());

        // System.out.println("Bonificação do DEV: " + desenvolvedor.getBonificacao());
        // System.out.println("Bonificação do gerente: " + gerente.getBonificacao());

        System.out.println(gerente.autentica("123456"));

        CalculadoraBonificacao calculadoraBonificacao = new CalculadoraBonificacao();
        calculadoraBonificacao.adicionaBonificacao(gerente);
        calculadoraBonificacao.adicionaBonificacao(desenvolvedor);
        System.out.println("O total de bonificações pagas é: " + calculadoraBonificacao.getTotalBonificacao());
    }
}
