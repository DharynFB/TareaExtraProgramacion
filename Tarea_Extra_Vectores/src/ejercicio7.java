import java.util.Random;

public class ejercicio7 {

    public static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(max - min + 1) + min;
        }
        return numeros;
    }

    public static void mostrarArray(String titulo, int[] array) {
        System.out.println(titulo);
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] ordenarParesImpares(int[] arrayOriginal) {
        int[] resultado = new int[arrayOriginal.length];
        int pos = 0;

        for (int n : arrayOriginal) {
            if (n % 2 == 0) {
                resultado[pos++] = n;
            }
        }


        for (int n : arrayOriginal) {
            if (n % 2 != 0) {
                resultado[pos++] = n;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] original = generarNumerosAleatorios(10, 0, 15);
        mostrarArray("Array original:", original);

        int[] reorganizado = ordenarParesImpares(original);
        mostrarArray("Array con pares primero, impares después:", reorganizado);
    }
}
