package Aulas;
import java.util.Scanner;

public class modulo2 {
    public static void main(String[] args) {
        ifpreco();
        whilenome();
    }

    public static void ifpreco() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o preço do produto:  ");
        int preco = teclado.nextInt();

        if (preco >= 100) { 
            System.out.println("Está caro."); // se preço for maior ou igual a 100.
        } else {
            System.out.println("Está barato."); // senão 
        }
    }

    public static void whilenome() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();

        System.out.println("Digite o número de vezes: ");
        int vezes = teclado.nextInt();

        int i = 0;

        while (i <= vezes) {
            System.out.println("Nome: " + nome + " Vezes: " + i);
            i += 1;
        }

        System.out.println("Fim do programa.");
    }

}
