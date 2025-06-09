import java.util.Random;

public class ejercicio18 {

    public static void rellenarMatriz(int[][] matriz, Random rand) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 500 + rand.nextInt(401); 
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

    public static void procesarDiagonalSecundaria(int[][] matriz) {
        int max = matriz[8][0];
        int min = matriz[8][0];
        int suma = 0;

        System.out.println("\nDiagonal secundaria (de inferior izquierda a superior derecha):");
        for (int i = 0; i < matriz.length; i++) {
            int valor = matriz[matriz.length - 1 - i][i];
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
        int[][] matriz = new int[9][9];
        Random rand = new Random();

        rellenarMatriz(matriz, rand);
        mostrarMatriz(matriz);
        procesarDiagonalSecundaria(matriz);
    }
}
