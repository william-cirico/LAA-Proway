package OOP.src;

public class Conta {
    // double saldo;
    private double saldo;
    private int agencia;
    private int numero;
    // String titular;
    // Composição - Utilizar outro objeto como atributo da classe.
    private Cliente titular;
    
    // Atributo estático
    private static int totalContas;

    // Construtor
    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;

        System.out.println("A conta " + numero + " foi criada!");

        totalContas++;
    }

    public void deposita(double valor) {
        // this -> Serve para se referir ao objeto em si.
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            
            return true;
        }
        
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getNumero() {
        return this.numero;
    }

    // public void setNumero(int valor) {
    //     if (valor >= 0) {
    //         this.numero = valor;
    //     }
    // }

    public int getAgencia() {
        return this.agencia;
    }

    // public void setAgencia(int valor) {
    //     if (valor >= 0) {
    //         this.agencia = valor;
    //     }
    // }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotalContas() {
        return Conta.totalContas;
    }
}
