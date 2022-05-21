public class Ponto2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static boolean temEixoEmComum(Ponto2D pontoA, Ponto2D pontoB) {
        return pontoA.getX() == pontoB.getY() || pontoA.getY() == pontoB.getY();
    }
}
