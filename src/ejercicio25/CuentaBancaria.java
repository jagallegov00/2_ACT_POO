package ejercicio25;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class CuentaBancaria {

    private static final DecimalFormat FORMATO_PESOS = construirFormato();

    private String nombresTitular;
    private String apellidosTitular;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta;
    private double saldo = 0;
    private double porcentajeInteresMensual;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, String numeroCuenta,
            TipoCuenta tipoCuenta, double porcentajeInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        setPorcentajeInteresMensual(porcentajeInteresMensual);
    }

    private static DecimalFormat construirFormato() {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator(',');
        simbolos.setGroupingSeparator('.');
        return new DecimalFormat("$#,##0.00", simbolos);
    }

    public double getSaldo() {
        return saldo;
    }

    public double getPorcentajeInteresMensual() {
        return porcentajeInteresMensual;
    }

    public void setPorcentajeInteresMensual(double porcentajeInteresMensual) {
        if (porcentajeInteresMensual < 0) {
            throw new IllegalArgumentException(
                    "El porcentaje de interes no puede ser negativo.");
        }
        this.porcentajeInteresMensual = porcentajeInteresMensual;
    }

    public void imprimir() {
        System.out.println("Nombres del titular    = " + nombresTitular);
        System.out.println("Apellidos del titular  = " + apellidosTitular);
        System.out.println("Numero de la cuenta    = " + numeroCuenta);
        System.out.println("Tipo de cuenta         = " + tipoCuenta);
        System.out.println("Saldo                  = " + formatearPesos(saldo));
        System.out.println("Interes mensual        = " + porcentajeInteresMensual + " %");
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es     = " + formatearPesos(saldo));
    }

    public boolean consignar(double valor) {
        if (valor <= 0) {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
        saldo += valor;
        System.out.println("Se ha consignado " + formatearPesos(valor)
                + ". Nuevo saldo = " + formatearPesos(saldo));
        return true;
    }

    public boolean retirar(double valor) {
        if (valor <= 0) {
            System.out.println("El valor a retirar debe ser mayor que cero.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("No se puede retirar " + formatearPesos(valor)
                    + ": el valor supera el saldo disponible.");
            return false;
        }
        saldo -= valor;
        System.out.println("Se ha retirado " + formatearPesos(valor)
                + ". Nuevo saldo = " + formatearPesos(saldo));
        return true;
    }

    public double calcularNuevoSaldo() {
        double intereses = saldo * porcentajeInteresMensual / 100;
        saldo += intereses;
        System.out.println("Intereses del mes      = " + formatearPesos(intereses));
        return saldo;
    }

    public String formatearPesos(double valor) {
        return FORMATO_PESOS.format(valor);
    }
}
