import java.util.Scanner;

public class pratica {
    public static void main (String[] args) {
        questao1();
        questao2();
        questao3();
    }

    public static void questao1(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        int base = teclado.nextInt();

        System.out.println("Digite a altura do retângulo: ");
        int altura = teclado.nextInt();

        int area = base * altura;

        System.out.println("A área do retângulo é: " + area);
    }

    public static void questao2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }

    public static void questao3() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}