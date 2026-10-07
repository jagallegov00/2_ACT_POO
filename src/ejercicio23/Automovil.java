package ejercicio23;

public class Automovil {

    private static final double VALOR_MULTA = 500000;

    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual = 0;
    private boolean esAutomatico;
    private int cantidadMultas = 0;

    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible,
            TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos,
            int velocidadMaxima, Color color, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.esAutomatico = esAutomatico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        if (velocidadActual < 0 || velocidadActual > velocidadMaxima) {
            throw new IllegalArgumentException(
                    "La velocidad debe estar entre 0 y " + velocidadMaxima + " km/h.");
        }
        this.velocidadActual = velocidadActual;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    public int getCantidadMultas() {
        return cantidadMultas;
    }

    public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad > velocidadMaxima) {
            cantidadMultas++;
            System.out.println("No se puede superar la velocidad maxima (" + velocidadMaxima
                    + " km/h). Se genera la multa No " + cantidadMultas + ".");
        } else {
            velocidadActual += incrementoVelocidad;
        }
    }

    public void desacelerar(int decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        } else {
            velocidadActual -= decrementoVelocidad;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoLlegada(int distancia) {
        if (velocidadActual == 0) {
            throw new IllegalStateException(
                    "Con el vehiculo detenido no es posible estimar el tiempo de llegada.");
        }
        return (double) distancia / velocidadActual;
    }

    public boolean tieneMultas() {
        return cantidadMultas > 0;
    }

    public double calcularValorTotalMultas() {
        return cantidadMultas * VALOR_MULTA;
    }

    public void imprimir() {
        System.out.println("Marca                  = " + marca);
        System.out.println("Modelo                 = " + modelo);
        System.out.println("Motor (litros)         = " + motor);
        System.out.println("Tipo de combustible    = " + tipoCombustible);
        System.out.println("Tipo de automovil      = " + tipoAutomovil);
        System.out.println("Numero de puertas      = " + numeroPuertas);
        System.out.println("Cantidad de asientos   = " + cantidadAsientos);
        System.out.println("Velocidad maxima       = " + velocidadMaxima + " km/h");
        System.out.println("Color                  = " + color);
        System.out.println("Es automatico          = " + esAutomatico);
        System.out.println("Velocidad actual       = " + velocidadActual + " km/h");
    }
}
