package aula;

import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();

        System.out.printf("A idade é: %d\n", idade);

        sc = new Scanner(System.in);

        System.out.println("Digite o seu nome completo:");
        String nome = sc.nextLine();
        System.out.printf("O nome é: %s\n", nome);

        System.out.println("Digite o seu salário:");
        double salario = sc.nextDouble();

        System.out.println("O salário é: " + salario);
        System.out.printf("O salário é: %.2f\n",salario);
    }
}
