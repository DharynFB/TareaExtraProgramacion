import java.util.Scanner;

public class ejercicio1 {

    public static int[] leerNumeros(int cantidad) {
        Scanner t = new Scanner(System.in);
        int[] numeros = new int[cantidad];
        System.out.println("Introduce " + cantidad + " números:");

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = t.nextInt();
        }
        return numeros;
    }

    public static int encontrarMaximo(int[] numeros) {
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    public static int encontrarMinimo(int[] numeros) {
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    public static void mostrarNumerosConEtiquetas(int[] numeros, int max, int min) {
        System.out.println("Números introducidos:");
        for (int numero : numeros) {
            System.out.print(numero);
            if (numero == max) {
                System.out.print(" (máximo)");
            }
            if (numero == min) {
                System.out.print(" (mínimo)");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numeros = leerNumeros(10);
        int maximo = encontrarMaximo(numeros);
        int minimo = encontrarMinimo(numeros);
        mostrarNumerosConEtiquetas(numeros, maximo, minimo);
    }
}
