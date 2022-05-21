// Interface é um contrato. Os métodos que são declarados por ela devem ser implementador
// pelas classes que a utilizam.
public interface Autenticavel {
    boolean autentica(String senha);
    String getSenha();
    void setSenha(String senha);
}
