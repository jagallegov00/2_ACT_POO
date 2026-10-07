package ejercicio24;

import java.util.Locale;

public class MainEjercicio24 {

    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Rombo figura5 = new Rombo(8, 6);
        Trapecio figura6 = new Trapecio(10, 4, 4);

        System.out.println("=== EJERCICIO 2.4 - FIGURAS GEOMETRICAS ===");
        System.out.println();
        mostrar("Circulo (radio 2 cm)", figura1.calcularArea(), figura1.calcularPerimetro());
        mostrar("Rectangulo (base 1 cm, altura 2 cm)",
                figura2.calcularArea(), figura2.calcularPerimetro());
        mostrar("Cuadrado (lado 3 cm)", figura3.calcularArea(), figura3.calcularPerimetro());
        mostrar("Triangulo rectangulo (base 3 cm, altura 5 cm)",
                figura4.calcularArea(), figura4.calcularPerimetro());
        System.out.printf(Locale.US, "  Hipotenusa         : %.4f cm%n",
                figura4.calcularHipotenusa());
        System.out.println("  Tipo de triangulo  : " + figura4.determinarTipoTriangulo());
        mostrar("Rombo (diagonales 8 cm y 6 cm)",
                figura5.calcularArea(), figura5.calcularPerimetro());
        mostrar("Trapecio isosceles (bases 10 cm y 4 cm, altura 4 cm)",
                figura6.calcularArea(), figura6.calcularPerimetro());
    }

    private static void mostrar(String figura, double area, double perimetro) {
        System.out.println(figura);
        System.out.printf(Locale.US, "  Area               : %.4f cm2%n", area);
        System.out.printf(Locale.US, "  Perimetro          : %.4f cm%n", perimetro);
    }
}
