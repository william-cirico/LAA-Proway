public class TestePonto2D {
    public static void main(String[] args) {
        Ponto2D pontoA = new Ponto2D(2, 3);
        Ponto2D pontoB = new Ponto2D(2, 3);

        System.out.println(Ponto2D.temEixoEmComum(pontoA, pontoB));
    }
}
