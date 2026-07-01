import java.util.ArrayList;

/**
 * Ejercicio1
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        // Tradicional
        if (lista.size() == 0) {
            System.out.println("Tradicional: La lista está vacía");
        }

        // Abreviado
        if (lista.isEmpty()) {
            System.out.println("Abreviado: La lista está vacía");
        }

        String texto = "";
        System.out.println("\nTradicional: " + (texto.length() == 0));
        System.out.println("Abreviado: " + texto.isEmpty());
    }

    public Ejercicio1() {
    }
}