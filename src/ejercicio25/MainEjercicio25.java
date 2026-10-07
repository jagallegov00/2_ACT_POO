package ejercicio25;

public class MainEjercicio25 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Perez", "123456789",
                TipoCuenta.AHORROS, 1.5);

        System.out.println("=== EJERCICIO 2.5 - CLASE CUENTA BANCARIA ===");
        System.out.println();
        cuenta.imprimir();
        System.out.println();

        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.retirar(150000);
        cuenta.consultarSaldo();

        System.out.println();
        double nuevoSaldo = cuenta.calcularNuevoSaldo();
        System.out.println("Saldo con intereses    = " + cuenta.formatearPesos(nuevoSaldo));
    }
}
