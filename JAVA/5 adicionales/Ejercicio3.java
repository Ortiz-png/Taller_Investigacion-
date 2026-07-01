
    import java.util.Objects;

public class Ejercicio3 {
    public static void main(String[] args) {
        String texto = null;

        // Tradicional
        String resultado;
        resultado = "Sin valor";
        System.out.println("Tradicional: " + resultado);

        // Abreviado
        System.out.println("Abreviado: " + Objects.toString(texto, "Sin valor"));
    }
}

