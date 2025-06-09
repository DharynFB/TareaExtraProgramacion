import java.util.Scanner;

public class ejercicio2 {

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

    public static void rotarUnaPosicionDerecha(int[] array) {
        int ultimo = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;
    }

    public static void mostrarArray(int[] array) {
        System.out.println("Array rotado una posición a la derecha:");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = leerNumeros(15);
        rotarUnaPosicionDerecha(numeros);
        mostrarArray(numeros);
    }
}
