import java.util.ArrayList;
import java.util.Scanner;

class Album {
    String genero;
    String ano;
    String nomeAlbum;
    String artista;
    ArrayList <Musica> musica = new ArrayList<Musica>();

    public Album (String genero, String ano, String nomeAlbum, String artista) {
        this.genero = genero;
        this.ano = ano;
        this.nomeAlbum = nomeAlbum;
        this.artista = artista;
    }

    public void addMusica(Musica m) {
        this.musica.add(m);
    }

    public void mostrarMusica() {
        System.out.println("Gênero: " + genero + " Ano: " + ano + " NomeAlbum: " + nomeAlbum + " Artista: " + artista);
        for (int i = 0; i < musica.size(); i++) {
            System.out.println(musica.get(i));
        }
    }
}

class Musica {
    String titulo;
    String duracao;

    public String toString() {
        return String.format("Titulo: %s\nDuração: %s", this.titulo, this.duracao);
    }

    public Musica(String titulo, String duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }
}

class Main {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        Album a1 = new Album("Alternativo", "1993", "Eros", "Viza");

        for (int i = 0; i < 5; i++){
            Musica m = new Musica(teclado.nextLine(), teclado.nextLine());
            a1.addMusica(m);
        }

        a1.mostrarMusica();
    }
}