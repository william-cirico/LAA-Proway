package aula;

class TiposDados {
    public static void main(String[] args) {
        // Saída de dados
        System.out.println("Hello World!");

        // Tipos primitivos
        int inteiro = 2;
        float decimal = 3.4f;
        double decimalMaior = 24.2;
        char caractere = 'A';
        boolean booleano = true;
        String texto = "Um texto";

        // Arrays
        String[] nomes = {"João", "Maria", "Pedro"};
        System.out.println(nomes[0]);

        int[] numeros = new int[100];
        numeros[99] = 10;
        System.out.println(numeros[99]);

        // Matriz
        String[][] matriz = new String[3][3];

        // Type casting
        // Inteiro para String
        int valorEmInteiro = 10;
        String valorEmString = String.valueOf(valorEmInteiro);
        System.out.println(valorEmString);

        // String para Inteiro 
        valorEmInteiro = Integer.parseInt(valorEmString);
        System.out.println(valorEmInteiro);

        double valorDecimal = 10.2;
        int valorInteiro = (int) valorDecimal;
        System.out.println(valorInteiro);
    }
}