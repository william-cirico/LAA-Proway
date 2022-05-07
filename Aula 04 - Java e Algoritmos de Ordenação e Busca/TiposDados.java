class TipoDados {
    public static void main(String[] args) {
        // Tipos primitivos
        int inteiro = 2;
        float decimal = 2.3f;
        double decimalMaior = 3.2789;
        char caractere = 'A';
        boolean booleano = true;
        String texto = "Uma string qualquer";

        // Arrays
        String[] nomes = {"João", "Maria", "Pedro"};
        int[] numeros = new int[100];
        numeros[0] = 10;
        numeros[1] = 11;

        // Matrizes
        int[][] matriz = new int[10][10];
        matriz[0][0] = 1;

        // Type Casting
        int num = 10;
        String numEmString = String.valueOf(num);
        num = Integer.parseInt(numEmString);

        double valorDecimal = 10.3;
        int valorInteiro = (int) valorDecimal;
    }
}