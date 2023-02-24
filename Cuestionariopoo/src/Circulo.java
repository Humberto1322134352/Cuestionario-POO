public class Circulo {
    private double radio; // Radio en centímetros

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

