public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    // private int tipo = 0; // 0 - Funcionário Comum | 1 - Gerente | 2 - Diretor

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // public double getBonificacao() {
    //     if (this.tipo == 0) {
    //         return this.salario * .1;
    //     } else if (this.tipo == 1) {
    //         return this.salario;
    //     } else {
    //         return this.salario + 1000;
    //     }
    // }

    // public void setTipo(int tipo) {
    //     this.tipo = tipo;
    // }

    // Método abstrato
    // public double getBonificacao() {
    //     return this.salario * .1;
    // }

    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}