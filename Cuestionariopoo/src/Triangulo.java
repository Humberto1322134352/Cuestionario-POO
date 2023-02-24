public class Triangulo {

    private double base; // Base en centímetros
    private double altura; // Altura en centímetros

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return base * altura / 2;
    }

    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String determinarTipoTriangulo() {
        double lado1 = base;
        double lado2 = altura;
        double hipotenusa = calcularHipotenusa();
        if (lado1 == lado2 && lado2 == hipotenusa) {
            return "Equilatero";
        } else if (lado1 == lado2 || lado1 == hipotenusa || lado2 == hipotenusa) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}


