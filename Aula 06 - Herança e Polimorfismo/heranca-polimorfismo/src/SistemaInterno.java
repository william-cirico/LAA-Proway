public class SistemaInterno {
    private String senha = "123456";

    public void autentica(Autenticavel autenticavel) {
        if (autenticavel.autenticacao(senha)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login inválido");
        }
    }
}
