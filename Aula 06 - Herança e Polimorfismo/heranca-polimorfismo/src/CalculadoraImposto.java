public class CalculadoraImposto {
    private double totalImposto;
    
    public void registraTributavel(Tributavel tributavel) {
       this.totalImposto += tributavel.getValorImposto();
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}