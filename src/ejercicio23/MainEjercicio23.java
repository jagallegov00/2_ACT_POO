package ejercicio23;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MainEjercicio23 {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2018, 3.5, TipoCombustible.DIESEL,
                TipoAutomovil.EJECUTIVO, 5, 6, 250, Color.NEGRO, true);

        System.out.println("=== EJERCICIO 2.3 - CLASE AUTOMOVIL ===");
        System.out.println();
        auto1.imprimir();
        System.out.println();

        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual() + " km/h");
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual() + " km/h");
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual() + " km/h");
        System.out.printf(Locale.US, "Tiempo estimado para recorrer 105 km = %.2f horas%n",
                auto1.calcularTiempoLlegada(105));
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual() + " km/h");
        auto1.desacelerar(20);

        System.out.println();
        auto1.setVelocidadActual(240);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual() + " km/h");
        auto1.acelerar(30);
        auto1.acelerar(15);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual() + " km/h");

        System.out.println();
        System.out.println("Tiene multas           = " + auto1.tieneMultas());
        System.out.println("Cantidad de multas     = " + auto1.getCantidadMultas());
        System.out.println("Valor total de multas  = "
                + formatearPesos(auto1.calcularValorTotalMultas()));
    }

    private static String formatearPesos(double valor) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator(',');
        simbolos.setGroupingSeparator('.');
        return new DecimalFormat("$#,##0", simbolos).format(valor);
    }
}
