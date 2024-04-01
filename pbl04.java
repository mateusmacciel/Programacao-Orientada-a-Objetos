class Personagem {
    int x;
    int y;
    String nome;
    int vida = 10;

    public Personagem(int x, int y, String nome) {
        this.x = x;
        this.y = y;
        this.nome = nome;
    }

    public void mover(int x, int y) {
        if (this.x != x || this.y != y) {
            this.x += x;
            this.y += y;
        } else {
            System.out.println("Não se moveu.");
        }
    }

    public void mostrar(){
        System.out.println("Nome: " + nome + " Posições: " + x + " " + y + " Vida: " + vida);
    }
}

class Jogo{
    public static void main (String[] args) {
        Personagem p1 = new Personagem(0, 0, "Gandalf");
        Personagem p2 = new Personagem(7, -3, "Frodo");

        p1.mover(7, -4);
        p1.mover(-1, 0);

        p2.mover(0, 0);
        p2.mover(0, 3);

        p1.mostrar();
        p2.mostrar();
    }
}