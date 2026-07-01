public class Ejercicio5 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Tradicional
        int mayor;
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }
        System.out.println("Tradicional - Mayor: " + mayor);

        // Abreviado
        System.out.println("Abreviado - Mayor: " + Math.max(a, b));
        System.out.println("Abreviado - Menor: " + Math.min(a, b));
    }
}

