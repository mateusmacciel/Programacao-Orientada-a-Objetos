import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro termo da PA: ");
        int a_1 = teclado.nextInt();

        System.out.println("Digite a razão da PA: ");
        int r = teclado.nextInt();

        System.out.println("Digite o número de termos da PA: ");
        int n = teclado.nextInt();

        int a_n = a_1 + (n - 1) * r;

        System.out.println("O último termo da PA: " + a_n);

        int s_n = (a_1 + a_n) * n / 2;

        System.out.println("Soma de todos os termos da PA: " + s_n);
    }
}