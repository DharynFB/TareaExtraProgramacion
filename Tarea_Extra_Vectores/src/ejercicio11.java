import java.util.Scanner;

public class ejercicio11 {
    public static String[] obtenerColores() {
        return new String[] {
            "verde", "rojo", "azul", "amarillo", "naranja",
            "rosa", "negro", "blanco", "morado"
        };
    }
    public static String[] leerPalabras(int cantidad) {
        Scanner t = new Scanner(System.in);
        String[] palabras = new String[cantidad];
        System.out.println("Introduce " + cantidad + " palabras:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = t.nextLine().toLowerCase();
        }
        return palabras;
    }

    public static boolean esColor(String palabra, String[] colores) {
        for (int i = 0; i < colores.length; i++) {
            if (palabra.equals(colores[i])) {
                return true;
            }
        }
        return false;
    }

    public static String[] reorganizarPalabras(String[] palabras, String[] colores) {
        String[] resultado = new String[palabras.length];
        int indice = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (esColor(palabras[i], colores)) {
                resultado[indice] = palabras[i];
                indice++;
            }
        }

        for (int i = 0; i < palabras.length; i++) {
            if (!esColor(palabras[i], colores)) {
                resultado[indice] = palabras[i];
                indice++;
            }
        }

        return resultado;
    }

    public static void mostrarArray(String titulo, String[] array) {
        System.out.println("\n" + titulo);
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] " + array[i]);
        }
    }
    public static void main(String[] args) {
        String[] colores = obtenerColores();
        String[] palabras = leerPalabras(8);

        mostrarArray("Palabras ingresadas:", palabras);

        String[] reorganizadas = reorganizarPalabras(palabras, colores);
        mostrarArray("Palabras con colores al inicio:", reorganizadas);
    }
}
