package ejercicio21;

public class Persona {

    private String nombre;
    private String apellidos;
    private String numeroDocumentoIdentidad;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad,
            int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        setGenero(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        char valor = Character.toUpperCase(genero);
        if (valor != 'H' && valor != 'M') {
            throw new IllegalArgumentException("El genero debe ser 'H' o 'M'.");
        }
        this.genero = valor;
    }

    public void imprimir() {
        System.out.println("Nombre                           = " + nombre);
        System.out.println("Apellidos                        = " + apellidos);
        System.out.println("Numero de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Anio de nacimiento               = " + anioNacimiento);
        System.out.println("Pais de nacimiento               = " + paisNacimiento);
        System.out.println("Genero                           = " + genero);
        System.out.println();
    }
}
