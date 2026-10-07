package ejercicio24;

public class Trapecio {

    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularLadoOblicuo() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow((baseMayor - baseMenor) / 2, 2));
    }

    public double calcularArea() {
        return (baseMayor + baseMenor) * altura / 2;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + 2 * calcularLadoOblicuo();
    }
}
