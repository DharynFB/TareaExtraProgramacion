import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {
    public static int[] generarArrayAleatorio(int tamaño, int min, int max) {
        Random random = new Random();
        int[] vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i] = random.nextInt(max - min + 1) + min;
        }
        return vector;
    }

    public static void mostrarArray(int[] array, Integer destacar, String tipo) {
        System.out.println("\nContenido del array:");
        for (int num : array) {
            if (destacar != null && num == destacar) {
                System.out.print("**" + num + "** ");
            } else {
                System.out.print(num + " ");
            }
        }
        if (destacar != null) {
            System.out.println("\nNúmero destacado: " + tipo + " = " + destacar);
        }
        System.out.println();
    }

    public static int encontrarMaximo(int[] array) {
        int max = array[0];
        for (int n : array) {
            if (n > max) max = n;
        }
        return max;
    }

    public static int encontrarMinimo(int[] array) {
        int min = array[0];
        for (int n : array) {
            if (n < min) min = n;
        }
        return min;
    }

    public static String pedirOpcion() {
        Scanner t = new Scanner(System.in);
        String opcion;
        do {
            System.out.print("¿Deseas destacar el 'maximo' o el 'minimo'?: ");
            opcion = t.nextLine().toLowerCase();
        } while (!opcion.equals("maximo") && !opcion.equals("minimo"));
        return opcion;
    }

    public static void main(String[] args) {
        int[] array = generarArrayAleatorio(15, 0, 20);
        mostrarArray(array, null, "");

        String opcion = pedirOpcion();
        int valorDestacado = opcion.equals("maximo") ? encontrarMaximo(array) : encontrarMinimo(array);

        mostrarArray(array, valorDestacado, opcion);
    }
}
