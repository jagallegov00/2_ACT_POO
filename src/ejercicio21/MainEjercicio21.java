package ejercicio21;

public class MainEjercicio21 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Perez", "1053121010", 1998, "Colombia", 'H');
        Persona p2 = new Persona("Luisa", "Leon", "1053223344", 2001, "Ecuador", 'M');

        System.out.println("=== EJERCICIO 2.1 - CLASE PERSONA ===");
        System.out.println();
        p1.imprimir();
        p2.imprimir();
    }
}
