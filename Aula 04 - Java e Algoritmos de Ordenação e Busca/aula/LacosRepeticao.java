package aula;

public class LacosRepeticao {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int i = 0;
        while (true) {
            i++;

            System.out.println(i);

            if (i == 10) {
                break;
            } else if (i < 10) {
                System.out.println("i é menor 10");
            } else {
                System.out.println("i é um número desconhecido");
            }
        }

        String[] nomes = {"João", "Maria", "Pedro"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
