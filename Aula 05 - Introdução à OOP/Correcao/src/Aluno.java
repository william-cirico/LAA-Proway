public class Aluno {
    private int matricula;
    private String nome;
    private double n1;
    private double n2;
    private double trabalho;

    public Aluno(int matricula, String nome, double n1, double n2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        setN1(n1);
        setN2(n2);
        setTrabalho(trabalho);
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        if (this.validaNota(n1)) {
            this.n1 = n1;
        }
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        if (this.validaNota(n2)) {
            this.n2 = n2;
        }
    }

    public double getTrabalho() {
        return trabalho;
    }    

    public void setTrabalho(double trabalho) {
        if (this.validaNota(trabalho)) {
            this.trabalho = trabalho;
        }
    }

    private boolean validaNota(double nota) {
        return nota > 0 && nota < 11;
    }

    public double getMedia() {
        double media = (this.n1 * 3 + this.n2 * 3 + this.trabalho * 2) / 8;
        return media;
    }

    public String getSituacao() {
        double media = this.getMedia();

        if (media <= 4.99) {
            return "Reprovado";
        } else if (media <= 6.99) {
            return "Recuperação";
        } else if (media <= 10) {
            return "Aprovado";
        }

        return "Média inválida";
    }
}