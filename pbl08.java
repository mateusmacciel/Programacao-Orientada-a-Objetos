interface FormaGeometrica {
    double getArea();
    double getPerimetro();
}

interface Desenho {
    void desenhar();
}

class Quadrilatero implements FormaGeometrica, Desenho {
    protected int lado1;
    protected int lado2;
    protected int lado3;
    protected int lado4;
    
    public Quadrilatero(int lado1, int lado2, int lado3, int lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    
    public double getPerimetro() {
        return lado1 + lado2 + lado3 + lado4;
    }
    
    public double getArea() {
        return lado1 * 4;
    }
    
    public void desenhar() {
        System.out.println("Quadrilátero");
    }
}

class Triangulo implements FormaGeometrica, Desenho {
    protected int lado1;
    protected int lado2;
    protected int lado3;
    
    Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double getArea() {
        return (lado1 + lado2 + lado3) / 2.0;
    }
    
    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public void desenhar() {
        System.out.println("Triângulo");
    }
}

class Quadrado extends Quadrilatero {
    
    Quadrado(int lado1, int lado2, int lado3, int lado4) {
        super(lado1, lado2, lado3, lado4);
    }

    public double getArea() {
        return lado1 * lado1;
    }

    public void desenhar() {
        System.out.println("Quadrado:  " + lado1);
    }
}

class Retangulo extends Quadrilatero {
    
    Retangulo(int lado1, int lado2, int lado3, int lado4) {
        super(lado1, lado2, lado3, lado4);
    }

    public double getArea() {
        return lado1 * lado2;
    }

    public void desenhar() {
        System.out.println("Retângulo: " + lado1 + " e " + lado2);
    }
}

class Isoceles extends Triangulo {
    
    Isoceles(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }

    public void desenhar() {
        System.out.println("Triângulo isósceles: " + lado1 + ", " + lado2 + " e " + lado3);
    }
}

class Escaleno extends Triangulo {
    
    Escaleno(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }

    public void desenhar() {
        System.out.println("Triângulo escaleno: " + lado1 + ", " + lado2 + " e " + lado3);
    }
}

class Equilatero extends Triangulo {
    
    Equilatero(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }

    public void desenhar() {
        System.out.println("Triângulo equilátero: " + lado1 + ", " + lado2 + " e " + lado3);
    }
}

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2, 2, 2, 2);
        Retangulo retangulo = new Retangulo(3, 4, 3, 4);
        Isoceles isoceles = new Isoceles(3, 4, 3);
        Escaleno escaleno = new Escaleno(3, 4, 5);
        Equilatero equilatero = new Equilatero(3, 3, 3);

        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());

        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());

        System.out.println("Área: " + isoceles.getArea());
        System.out.println("Perímetro: " + isoceles.getPerimetro());

        System.out.println("Área: " + escaleno.getArea());
        System.out.println("Perímetro: " + escaleno.getPerimetro());

        System.out.println("Área: " + equilatero.getArea());
        System.out.println("Perímetro: " + equilatero.getPerimetro());

        System.out.println("----------------");

        quadrado.desenhar();
        retangulo.desenhar();
        isoceles.desenhar();
        escaleno.desenhar();
        equilatero.desenhar();
    }
}
