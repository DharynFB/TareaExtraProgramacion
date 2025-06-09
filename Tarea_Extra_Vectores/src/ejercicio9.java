import java.util.Scanner;

public class ejercicio9 {
    public static int[] leerNumeros(int cantidad) {
        Scanner t = new Scanner(System.in);
        int[] numeros = new int[cantidad];
        System.out.println("Introduce " + cantidad + " números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + i + ": ");
            numeros[i] = t.nextInt();
        }
        return numeros;
    }

    public static void mostrarArray(String titulo, int[] array) {
        System.out.println("\n" + titulo);
        System.out.print("Índice:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.print("\nValor:   ");
        for (int val : array) {
            System.out.printf("%4d", val);
        }
        System.out.println();
    }
    public static int[] leerPosicionesValidas() {
        Scanner t = new Scanner(System.in);
        int inicial, fin;
        do {
            System.out.print("Introduce posición inicial (0 a 8): ");
            inicial = t.nextInt();
            System.out.print("Introduce posición final (1 a 9): ");
            fin = t.nextInt();
        } while (inicial < 0 || inicial > 8 || fin < 1 || fin > 9 || inicial >= fin);

        return new int[]{inicial, fin};
    }

    public static void rotarSegmento(int[] array, int inicial, int fin) {
        int valor = array[inicial];
        for (int i = fin; i > inicial; i--) {
            array[i] = array[i - 1];
        }
        array[inicial + 1] = valor; 
    }

    public static void main(String[] args) {
        int[] numeros = leerNumeros(10);
        mostrarArray("Array original:", numeros);

        int[] posiciones = leerPosicionesValidas();
        int inicial = posiciones[0];
        int fin = posiciones[1];

        rotarSegmento(numeros, inicial, fin);
        mostrarArray("Array tras rotación de posición " + inicial + " a " + fin + ":", numeros);
    }
}
