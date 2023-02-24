public class Cuadrado {

    private double lado; // Longitud del lado en centímetros

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
