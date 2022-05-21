package OOP.src;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciando objetos da classe
        // Conta primeiraConta = new Conta();
        // primeiraConta.saldo = 20;

        // System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        // Conta segundaConta = new Conta();
        // segundaConta.saldo = 30;

        // System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        // Utilizando métodos
        // Conta terceiraConta = new Conta();
        // terceiraConta.deposita(100);

        // System.out.println("Saldo da terceira conta: " + terceiraConta.saldo);

        // if (terceiraConta.saca(100)) {
        //     System.out.println("Foi possível realizar o saque");
        // } else {
        //     System.out.println("Não foi possível realizar o saque");
        // }

        // Conta quartaConta = new Conta();
        // quartaConta.deposita(200);
        // quartaConta.transfere(100, terceiraConta);

        // System.out.println("Saldo na terceira conta: " + terceiraConta.saldo);
        // System.out.println("Saldo na quarta conta: " + quartaConta.saldo);

        // Adicionando o titular da conta
        // Cliente primeiroCliente = new Cliente();
        // primeiroCliente.nome = "João";
        // primeiroCliente.cpf = "110.814.329-69";
        // primeiroCliente.telefone = "(47) 9 8408-8520";

        // quartaConta.titular = primeiroCliente;

        // System.out.println("O nome do tituar da quarta conta é: " + quartaConta.titular.nome);

        // Encapsulamento
        // System.out.println("O saldo da quarta conta é: " + quartaConta.getSaldo());
        // quartaConta.setTitular(primeiroCliente);

        // System.out.println(quartaConta.getTitular().getNome());

        // Construtores
        Conta contaConstrutor = new Conta(100, 100);

        // Atributos e métodos estáticos
        System.out.println(Conta.getTotalContas());
    }
}
