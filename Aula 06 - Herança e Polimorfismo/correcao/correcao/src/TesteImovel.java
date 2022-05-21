public class TesteImovel {
    public static void main(String[] args) {
        Novo imovelNovo = new Novo("Rua 1", 350000, 10000);
        Velho imovelVelho = new Velho("Rua 2", 175000, 5000);
        
        System.out.println(imovelNovo.getTotal());
        System.out.println(imovelVelho.getTotal());
    }
}
