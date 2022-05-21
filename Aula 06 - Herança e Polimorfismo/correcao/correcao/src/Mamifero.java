public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comprimento, int numeroPatas, String cor, Ambiente ambiente,
            double velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        setAlimento(alimento);
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Alimento: %s", this.alimento);
    }
}
