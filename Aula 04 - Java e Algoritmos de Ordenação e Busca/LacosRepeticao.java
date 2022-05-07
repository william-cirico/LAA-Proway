public class LacosRepeticao {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Percorrendo os elementos de um Array
        String[] nomes = {"João", "Maria", "Pedro"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        for (String nome: nomes) {
            System.out.println(nome);
        }

        int i = 10;
        // While
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}
