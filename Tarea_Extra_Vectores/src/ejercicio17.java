import java.util.Random;

public class ejercicio17 {

    public static void rellenarMatriz(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 200 + random.nextInt(101); 
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz completa:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d ", valor);
            }
            System.out.println();
        }
    }

    public static void procesarDiagonal(int[][] matriz) {
        int max = matriz[0][0];
        int min = matriz[0][0];
        int suma = 0;

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            int valor = matriz[i][i];
            System.out.print(valor + " ");
            suma += valor;
            if (valor > max) max = valor;
            if (valor < min) min = valor;
        }

        double media = (double) suma / matriz.length;

        System.out.println("\n\nMáximo en la diagonal: " + max);
        System.out.println("Mínimo en la diagonal: " + min);
        System.out.printf("Media en la diagonal: %.2f\n", media);
    }

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();

        rellenarMatriz(matriz, random);
        mostrarMatriz(matriz);
        procesarDiagonal(matriz);
    }
}
