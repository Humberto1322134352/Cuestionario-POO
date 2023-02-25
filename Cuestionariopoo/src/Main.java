import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Pedir los tamaños de las figuras al usuario utilizando JOptionPane
        double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del circulo:"));
        double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del rectangulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del rectangulo:"));
        double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado del cuadrado:"));
        double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del triangulo:"));
        double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo:"));

        // Crear las figuras con los tamaños ingresados
        Circulo circulo = new Circulo(radio);
        Rectangulo rectangulo = new Rectangulo(base, altura);
        Cuadrado cuadrado = new Cuadrado(lado);
        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);

        // Probar los métodos de cada figura
        JOptionPane.showMessageDialog(null,"Circulo:\n"+"Radio: "+circulo.getRadio()+"\nArea: "+circulo.calcularArea()+"\nPerimetro: "+circulo.calcularPerimetro());

        JOptionPane.showMessageDialog(null,"Rectangulo:\n"+"Base: "+rectangulo.getBase()+"\nAltura: "+rectangulo.getAltura()+"\nArea: "+rectangulo.calcularArea()+"\nPerimetro: "+rectangulo.calcularPerimetro());

        JOptionPane.showMessageDialog(null,"Cuadrado:\n"+"Lado: "+cuadrado.getLado()+"\nArea: "+cuadrado.calcularArea()+"\nPerimetro: "+cuadrado.calcularPerimetro());

        JOptionPane.showMessageDialog(null,"Triangulo:\n"+"Base: "+triangulo.getBase()+"\nAltura: "+triangulo.getAltura()+"\nArea: "+triangulo.calcularArea()+"\nPerimetro: "+triangulo.calcularPerimetro()+"\nHipotenusa: "+triangulo.calcularHipotenusa()+"\nTipo: "+triangulo.determinarTipoTriangulo());
    }
}



