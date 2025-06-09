import java.util.Random;

public class ejercicio15 {
    public static int[] generarArrayAleatorio(int tamaño) {
        int[] array = new int[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(501); 
        }
        return array;
    }

    public static int siguienteMultiploDe5(int numero) {
        if (numero % 5 == 0) {
            return numero;
        } else {
            return numero + (5 - numero % 5);
        }
    }
    public static int[] cincuerizarArray(int[] original) {
        int[] resultado = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            resultado[i] = siguienteMultiploDe5(original[i]);
        }
        return resultado;
    }
    public static void imprimirArray(String mensaje, int[] array) {
        System.out.println(mensaje);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arrayOriginal = generarArrayAleatorio(15);
        int[] arrayCincuerizado = cincuerizarArray(arrayOriginal);
        imprimirArray("Array original:", arrayOriginal);
        imprimirArray("Array cincuerizado:", arrayCincuerizado);
    }
}
