package ejercicio24;

public class Rombo {

    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public double calcularLado() {
        return Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2));
    }

    public double calcularArea() {
        return diagonalMayor * diagonalMenor / 2;
    }

    public double calcularPerimetro() {
        return 4 * calcularLado();
    }
}
