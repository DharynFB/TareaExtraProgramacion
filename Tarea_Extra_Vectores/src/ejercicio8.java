import java.util.Scanner;

public class ejercicio8 {
    public static int[] leerNumeros(int cantidad) {
        Scanner t = new Scanner(System.in);
        int[] numeros = new int[cantidad];
        System.out.println("Introduce " + cantidad + " números enteros:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + i + ": ");
            numeros[i] = t.nextInt();
        }
        return numeros;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void mostrarTabla(int[] array, String titulo) {
        System.out.println("\n" + titulo);
        System.out.print("Índice:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.print("\nValor:   ");
        for (int valor : array) {
            System.out.printf("%4d", valor);
        }
        System.out.println();
    }

    public static int[] reorganizarPrimos(int[] original) {
        int[] resultado = new int[original.length];
        int pos = 0;
        for (int valor : original) {
            if (esPrimo(valor)) {
                resultado[pos++] = valor;
            }
        }

        for (int valor : original) {
            if (!esPrimo(valor)) {
                resultado[pos++] = valor;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] numeros = leerNumeros(10);
        mostrarTabla(numeros, "Array original:");

        int[] reorganizado = reorganizarPrimos(numeros);
        mostrarTabla(reorganizado, "Array con primos al inicio:");
    }
}
