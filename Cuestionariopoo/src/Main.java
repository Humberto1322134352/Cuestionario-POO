import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir los tamaños de las figuras al usuario
        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        System.out.println("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();

        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = sc.nextDouble();

        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();

        System.out.println("Ingrese la base del triangulo rectangulo: ");
        double baseTriangulo = sc.nextDouble();

        System.out.println("Ingrese la altura del triangulo rectangulo: ");
        double alturaTriangulo = sc.nextDouble();



        // Crear las figuras con los tamaños ingresados
        Circulo circulo = new Circulo(radio);
        Rectangulo rectangulo = new Rectangulo(base, altura);
        Cuadrado cuadrado = new Cuadrado(lado);
        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);

        // Probar los métodos de cada figura
        System.out.println("Circulo:");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());

        System.out.println("Rectangulo:");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());

        System.out.println("Cuadrado:");
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Area: " + cuadrado.calcularArea());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());

        System.out.println("Triangulo:");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo: " + triangulo.determinarTipoTriangulo());



    }

}
