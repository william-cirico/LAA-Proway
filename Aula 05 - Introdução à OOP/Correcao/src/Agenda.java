import java.util.ArrayList;

public class Agenda {
    ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();

    public boolean armazenarPessoa(Pessoa pessoa) {
        if (agenda.size() < 10) {
            agenda.add(pessoa);
            
            return true;
        }

        return false;
    }

    public boolean removerPessoa(String nome) {        
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNome() == nome) {
                agenda.remove(i);

                return true;                
            }
        }

        return false;
    }

    public Pessoa buscaPessoa(String nome) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNome() == nome) {
                return agenda.get(i);
            }
        }
        
        return new Pessoa("","");
    }

    public void imprimirAgenda() {
        for (int i = 0; i < agenda.size(); i++) {
            String nome = agenda.get(i).getNome();
            String telefone = agenda.get(i).getTelefone();

            System.out.printf("Nome: %s | Telefone: %s\n", nome, telefone);
        }
    }
}
