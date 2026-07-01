
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        // Tradicional
        System.out.print("Tradicional: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Abreviado
        System.out.println("Abreviado: " + Arrays.toString(numeros));
    }
}

