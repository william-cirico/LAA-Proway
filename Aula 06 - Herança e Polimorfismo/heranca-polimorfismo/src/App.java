public class App {
    public static void main(String[] args) throws Exception {
        // Funcionario funcionario1 = new Funcionario("Testando", "110.222.123-12", 2500);
        // funcionario1.setTipo(2);
        // System.out.println(funcionario1.getNome());
        // System.out.println(funcionario1.getBonificacao());

        Gerente gerente1 = new Gerente("Gerente", "111.222.333-11", 5000);
        System.out.println(gerente1.getBonificacao());

        Funcionario gerente2 = new Gerente("Gerente 2", "101.101.123-12", 6000);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registraBonificacao(gerente1);

        System.out.println(controleBonificacao.getTotal());

        ContaCorrente contaCorrente = new ContaCorrente(111, 222);
        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 333);
        contaCorrente.deposita(100);
        contaCorrente.transfere(50, contaPoupanca);
        System.out.println(contaPoupanca.getSaldo());

        // Classes e métodos abstratos

        // Interfaces
        Diretor diretor = new Diretor("Diretor", "121.123.123-11", 3000);
        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(diretor);
    }
}
