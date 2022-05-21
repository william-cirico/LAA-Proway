public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(111, "Joãozinho", -10, 12, 15);
        System.out.println(aluno.getN1());
        System.out.println(aluno.getN2());
        System.out.println(aluno.getTrabalho());

        double media = aluno.getMedia();
        System.out.println(media);
        aluno.getSituacao();
    }
}
