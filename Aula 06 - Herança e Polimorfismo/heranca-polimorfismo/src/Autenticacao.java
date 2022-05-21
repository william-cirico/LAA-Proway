public class Autenticacao {
    private String senha;

    public boolean autenticacao(String senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
