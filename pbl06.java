import java.util.ArrayList;
import java.util.Scanner;

class Pedido {
    String nomeCliente;
    String telefone;
    String endereço;
    ArrayList<Pizza> pizza = new ArrayList<Pizza>();

    public Pedido(String nomeCliente, String telefone, String endereço) {
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public void addPizza (Pizza p) {
        this.pizza.add(p);
    }   

    public void mostrarPedido() {
        System.out.println("Nome: " + nomeCliente + " Telefone: " + telefone + " Endereço: " + endereço);
        for(int i = 0; i < pizza.size(); i++) {
            System.out.println(pizza.get(i));
        }
    }
}

class Pizza {
    String sabor;
    String tamanho;

    public Pizza(String sabor, String tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public double getPreco() {
        if (this.tamanho.equals("P")) {
            return 20.00;
        } else if (this.tamanho.equals("M")) {
            return 30.00;
        } else if (this.tamanho.equals("G")) {
            return 40.00;
        } else {
            return 0;
        }
    }

    public String toString() {
        return String.format("Sabor: %s  Tamanho: %s  Preço: %f", this.sabor, this.tamanho, this.getPreco());
    }
}

class pbl06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Pedido pedido1 = new Pedido(teclado.nextLine(), teclado.nextLine(), teclado.nextLine());

        int i = 1;

        while (i == 1) {
            Pizza pizza1 = new Pizza(teclado.nextLine(), teclado.nextLine());
            pedido1.addPizza(pizza1);
            System.out.println("Deseja pedir mais uma pizza? 0 - Não / 1 - Sim");
            i = teclado.nextInt();
            teclado.nextLine();
        }

        pedido1.mostrarPedido();
    }
}