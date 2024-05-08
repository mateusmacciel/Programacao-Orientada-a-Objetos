public class Main {
  public static void main(String[] args) {
    Mamifero c1 = new Cachorro(20.0f, 1, 4, "Branco");
    c1.alimentar("carne");
    c1.emitirSom();
  }
}

abstract class Animal {
  private float peso;
  private int idade;
  private int membros;

  public Animal(float peso, int idade, int membros) {
    this.peso = peso;
    this.idade = idade;
    this.membros = membros;
  }

  public abstract void locomover();

  public abstract void alimentar(String alimento);

  public abstract void emitirSom();
}

abstract class Mamifero extends Animal {
  private String corPelo;

  public Mamifero(float peso, int idade, int membros, String corPelo) {
    super(peso, idade, membros);
    this.corPelo = corPelo;
  }
}

class Cachorro extends Mamifero {

  public Cachorro(float peso, int idade, int membros, String corPelo) {
    super(peso, idade, membros, corPelo);
  }

  public void enterrarOsso() {
    System.out.println("Enterrando osso");
  }

  public void abanarRabo() {
    System.out.println("Abanando rabo");
  }

  public void locomover() {
    System.out.println("Andando");
  }

  public void emitirSom() {
    System.out.println("Auau");
  }

  public void alimentar(String alimento) {
    System.out.println("Comendo " + alimento);
  }
}

class Canguru extends Mamifero {

  public Canguru(float peso, int idade, int membros, String corPelo) {
    super(peso, idade, membros, corPelo);
  }

  public void usarBolsa() {
    System.out.println("Usando bolsa");
  }

  public void locomover() {
    System.out.println("Andando");
  }

  public void emitirSom() {
    System.out.println("Som de canguru");
  }

  public void alimentar(String alimento) {
    System.out.println("Comendo" + alimento);
  }
}
