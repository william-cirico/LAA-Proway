public class Autenticacao implements Autenticavel {
    private String senha;

    @Override
    public boolean autentica(String senha) {
        if (this.senha == senha) {
            return true;
        }

        return false;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }    
}
