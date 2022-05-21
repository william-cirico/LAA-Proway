public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, double comprimento, int numeroPatas, String cor, Ambiente ambiente,
            double velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        setCaracteristica(caracteristica);
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Característica: %s", this.caracteristica);
    }

}
