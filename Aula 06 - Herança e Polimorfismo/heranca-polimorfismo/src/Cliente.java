public class Cliente implements Autenticavel {
    String nome;
    String cpf;
    String telefone;
    Autenticacao autenticacao;

    public Cliente() {
        this.autenticacao = new Autenticacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean autenticacao(String senha) {
        return this.autenticacao.autenticacao(senha);
    }

    @Override
    public void setSenha(String senha) {
        this.autenticacao.setSenha(senha);
    }
}
