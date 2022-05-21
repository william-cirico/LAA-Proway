public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public Funcionario(int matricula, String nome, double salario) {
        // Lançar exceção quando os dados forem inválidos.
        try {
            setMatricula(matricula);
            setNome(nome);
            setSalario(salario);
        } catch (Exception e) {
           System.out.println("Não foi possível criar o funcionário por conta dos valores informados.");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    private void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.contains(" ") && nome.length() > 6) {
            this.nome = nome;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception {
        if (salario < 465) {
            throw new Exception("Salário inválido");
        }

        this.salario = salario;
    }
}
