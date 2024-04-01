class Cliente {
    String nome;
    double saldo;
    
    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = saldo - valor;
        } else {
            System.out.println("Não possui saldo suficiente.");
        }
    }

    public void imprimir() {
        System.out.println(nome + " " + saldo);
    }
}

class Banco {
    public static void main (String[] args){
        Cliente c1 = new Cliente("Jandira da Silva", 2500.00);
        Cliente c2 = new Cliente("Sandra Rodrigues", 1800.00);
        Cliente c3 = new Cliente("Luciana Teixeira", 5000.00);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        c1.retirar(1000);
        c1.imprimir();

        c2.retirar(2000);

        c2.depositar(500);
        c2.imprimir();

        c2.retirar(2000);
        c2.imprimir();

        c3.depositar(1000);
        c3.imprimir();
    }
}