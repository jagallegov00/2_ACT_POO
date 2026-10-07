package ejercicio24;

public class TrianguloRectangulo {

    private static final double TOLERANCIA = 1e-9;

    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
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

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        boolean baseIgualAltura = Math.abs(base - altura) < TOLERANCIA;
        boolean baseIgualHipotenusa = Math.abs(base - hipotenusa) < TOLERANCIA;
        boolean alturaIgualHipotenusa = Math.abs(altura - hipotenusa) < TOLERANCIA;

        if (baseIgualAltura && alturaIgualHipotenusa) {
            return "Equilatero";
        } else if (baseIgualAltura || baseIgualHipotenusa || alturaIgualHipotenusa) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}
