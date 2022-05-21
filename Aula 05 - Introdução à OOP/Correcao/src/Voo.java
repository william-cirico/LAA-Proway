public class Voo {
    private int numeroVoo;
    private String data;
    private Boolean[] cadeiras = new Boolean[100];

    public Voo(int numeroVoo, String data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void proximaCadeiraLivre() {
        for (int i = 0; i < this.cadeiras.length; i++) {
            if (this.cadeiras[i] == null) {
                System.out.println("A próxima cadeira livre é: " + i);
                break;
            }
        }
    }

    public boolean verifica(int numeroCadeira) {
        if (this.cadeiras[numeroCadeira] == null) {
            return true;
        }
        
        return false;
    }

    public boolean ocupa(int numeroCadeira) {
        if (this.verifica(numeroCadeira)) {
            this.cadeiras[numeroCadeira] = true;

            return true;
        }

        return false;
    }

    public int vagas() {
        int quantidadeVagas = 0;
        for (int i = 0; i < this.cadeiras.length; i++) {
            if (verifica(i)) {
                quantidadeVagas++;
            }
        }

        return quantidadeVagas;
    }
}
