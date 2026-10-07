package ejercicio22;

public class MainEjercicio22 {

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150,
                TipoPlaneta.TERRESTRE, true, 1.0, 0.997);
        Planeta p2 = new Planeta("Jupiter", 79, 1.899E27, 1.4313E15, 139820, 750,
                TipoPlaneta.GASEOSO, true, 11.86, 0.414);

        System.out.println("=== EJERCICIO 2.2 - CLASE PLANETA ===");
        System.out.println();
        mostrar(p1);
        System.out.println();
        mostrar(p2);
    }

    private static void mostrar(Planeta planeta) {
        planeta.imprimir();
        System.out.println("Densidad del planeta (kg/km3)   = " + planeta.calcularDensidad());
        System.out.println("Es planeta exterior             = " + planeta.esPlanetaExterior());
    }
}
