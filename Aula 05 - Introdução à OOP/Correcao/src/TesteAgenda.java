public class TesteAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa("João", "(47) 9 9999-9999");
        Pessoa pessoa2 = new Pessoa("Marcos", "(47) 9 8888-8888");

        agenda.armazenarPessoa(pessoa1);
        agenda.armazenarPessoa(pessoa2);
        agenda.imprimirAgenda();
        agenda.removerPessoa("João");
        agenda.imprimirAgenda();
        Pessoa pessoa = agenda.buscaPessoa("");

        if (pessoa.getNome() == "") {
            System.out.println("A pessoa não está cadastrada na agenda");
        } else {
            System.out.println(pessoa.getNome());
        }        
    }
}
