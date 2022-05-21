public class TesteVoo {
    public static void main(String[] args) {
        Voo voo = new Voo(100, "21/05/2022");

        voo.proximaCadeiraLivre();
        voo.ocupa(2);
        System.out.println(voo.vagas());
        System.out.println(voo.verifica(1));
    }
}
