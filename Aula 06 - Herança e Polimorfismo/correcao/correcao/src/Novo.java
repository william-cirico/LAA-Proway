public class Novo extends Imovel {
    private double acrescimo;

    public Novo(String endereco, double preco, double acrescimo) {
        super(endereco, preco);
        this.setAcrescimo(acrescimo);
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    @Override
    public double getTotal() {
        return super.getPreco() + this.acrescimo;
    }

}
