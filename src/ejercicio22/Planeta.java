package ejercicio22;

public class Planeta {

    private static final double UA_EN_MILLONES_KM = 149.59787;
    private static final double LIMITE_CINTURON_UA = 3.4;

    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int distanciaSol = 0;
    private TipoPlaneta tipo;
    private boolean esObservable = false;
    private double periodoOrbital = 0;
    private double periodoRotacion = 0;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen,
            int diametro, int distanciaSol, TipoPlaneta tipo, boolean esObservable,
            double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimir() {
        System.out.println("Nombre del planeta              = " + nombre);
        System.out.println("Cantidad de satelites           = " + cantidadSatelites);
        System.out.println("Masa del planeta (kg)           = " + masa);
        System.out.println("Volumen del planeta (km3)       = " + volumen);
        System.out.println("Diametro del planeta (km)       = " + diametro);
        System.out.println("Distancia al Sol (millones km)  = " + distanciaSol);
        System.out.println("Tipo de planeta                 = " + tipo);
        System.out.println("Es observable a simple vista    = " + esObservable);
        System.out.println("Periodo orbital (anios)         = " + periodoOrbital);
        System.out.println("Periodo de rotacion (dias)      = " + periodoRotacion);
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaExterior() {
        double limite = UA_EN_MILLONES_KM * LIMITE_CINTURON_UA;
        return distanciaSol > limite;
    }
}
