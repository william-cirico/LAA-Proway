import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inteiro;
        double decimal;
        String palavra;
        String frase;

        System.out.println("Digite um número inteiro:");
        inteiro = input.nextInt();

        System.out.println("Digite um número decimal:");
        decimal = input.nextDouble();

        System.out.println("Digite uma palavra:");
        palavra = input.next();

        input = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        frase = input.nextLine();

        // Mostrando os dados
        System.out.printf("O número inteiro é: %d\n", inteiro);
        System.out.printf("O número decimal é: %.2f\n", decimal);
        System.out.printf("A palavra é: %s\n", palavra);
        System.out.printf("A frase é: %s", frase);
    }
}
