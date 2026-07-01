package adicional1;

import java.util.ArrayList;
import java.util.List;

public class IsEmptyExample {
    public static void main(String[] args) {
        System.out.println("=== isEmpty() ===\n");

        // --- Con String ---
        String texto = "";
        System.out.println("TRADICIONAL: " + (texto.length() == 0));
        System.out.println("ABREVIADO:   " + texto.isEmpty());

        // --- Con List ---
        List<String> lista = new ArrayList<>();
        System.out.println("\nTRADICIONAL: " + (lista.size() == 0));
        System.out.println("ABREVIADO:   " + lista.isEmpty());

        // --- Con String no vacío ---
        String saludo = "Hola";
        System.out.println("\nTRADICIONAL: " + (saludo.length() == 0));
        System.out.println("ABREVIADO:   " + saludo.isEmpty());
    }
}