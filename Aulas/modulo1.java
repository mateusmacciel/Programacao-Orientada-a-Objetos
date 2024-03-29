package Aulas;
import java.util.Scanner;

public class modulo1 { // Classe
    public static void main(String[] args) { // Metódo 'main'
        System.out.println("Hello World!"); // O comando 'System.out.println' imprime uma string na saída padrão
        copia();
    }

    public static void variaveis() {
        int k = 10; // k é uma variável do tipo inteiro
        short s = 8; // s é uma variável do tipo inteiro curto
        long z = 2081; // z é uma variável do tipo inteiro longo
        byte w = 127; // w é uma variável do tipo inteiro, 8 bits
        char c = '@'; // c é uma variável do tipo carácter
        boolean b = false; // b é uma variável do tipo boolean (true/false)
        float f = 0; // f é uma variável do tipo real simples
        double d = 3.14F; // d é uma variável do tipo real duplo
    }

    public static void copia() {
        int r = 2;
        int t = 3;

        t = r; // t recebe o valor de r
    }

    public static void operadores() {
        // + adição
        // - subtração
        // * multiplicação
        // / divisão
        // % módulo (resto da divisão inteira)
    }

    public static void leitura() {
        Scanner teclado = new Scanner(System.in); // criando a variável teclado para ler a entrada do usuário

        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt(); // recebendo o próximo inteiro digitado e alocando na variável idade

        System.out.println("Idade: " + idade);
    }
}
