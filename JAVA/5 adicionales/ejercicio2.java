import java.util.Arrays;
import java.util.List;

public class ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Carlos");

        // Tradicional
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nombres.size(); i++) {
            sb.append(nombres.get(i));
            if (i < nombres.size() - 1) {
                sb.append(", ");
            }
        }
        System.out.println("Tradicional: " + sb.toString());

        // Abreviado
        System.out.println("Abreviado: " + String.join(", ", nombres));
    }
}

