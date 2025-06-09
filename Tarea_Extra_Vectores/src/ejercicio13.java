import java.util.Scanner;

public class ejercicio13 {

    public static int[] generarArrayAleatorio(int longitud) {
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = (int)(Math.random() * 101); 
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static boolean contiene(int[] array, int numero) {
        for (int valor : array) {
            if (valor == numero) {
                return true;
            }
        }
        return false;
    }

    public static int posicionDelNumero(int[] vector, int numero) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                return i;
            }
        }
        return -1; 
    }

    public static void rotarDerechaUnaVez(int[] array) {
        int ultimo = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;
    }

    public static void rotarHastaFrente(int[] array, int numero) {
        while (array[0] != numero) {
            rotarDerechaUnaVez(array);
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] numeros = generarArrayAleatorio(10);

        System.out.println("Array generado:");
        mostrarArray(numeros);

        int numero;
        do {
            System.out.print("\nIntroduce un número que esté en el array: ");
            numero = t.nextInt();
            if (!contiene(numeros, numero)) {
                System.out.println("Ese número no está en el vector. Intenta de nuevo.");
            }
        } while (!contiene(numeros, numero));

        rotarHastaFrente(numeros, numero);

        System.out.println("\nVector rotado con " + numero + " al inicio:");
        mostrarArray(numeros);
    }
}
