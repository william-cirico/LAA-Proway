public abstract class Animal {
    private String nome;
    private double comprimento;
    private int numeroPatas;
    private String cor;
    private Ambiente ambiente;
    private double velocidadeMedia;

    public Animal(String nome, double comprimento, int numeroPatas, String cor, Ambiente ambiente,
            double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public void mostrarDados() {
        System.out.printf("Nome: %s", this.nome);
        System.out.printf("Comprimento: %.2f", this.comprimento);
        System.out.printf("Número de patas: %d", this.numeroPatas);
        System.out.printf("Cor: %s", this.cor);
        System.out.printf("Ambiente: %s", this.ambiente);
        System.out.printf("Velocidade Média: %.2f", this.velocidadeMedia);        
    };
}
