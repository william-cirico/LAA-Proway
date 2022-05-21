// Cliente é um funcionário
public class Cliente implements Autenticavel {
    private String nome;
    private String telefone;
    private Autenticacao autenticacao;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.setTelefone(telefone);
        this.autenticacao = new Autenticacao();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean autentica(String senha) {
       return this.autenticacao.autentica(senha);
    }

    @Override
    public String getSenha() {
        return this.autenticacao.getSenha();
    }

    @Override
    public void setSenha(String senha) {
        this.autenticacao.setSenha(senha);        
    }
}
