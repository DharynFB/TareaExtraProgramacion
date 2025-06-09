import java.util.Random;

public class ejercicio16 {

    public static void rellenarMatriz(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(1001); 
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] encontrarMaximo(int[][] matriz) {
        int max = matriz[0][0];
        int fila = 0, columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        return new int[]{max, fila, columna};
    }

    public static int[] encontrarMinimo(int[][] matriz) {
        int min = matriz[0][0];
        int fila = 0, columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        return new int[]{min, fila, columna};
    }

    public static void main(String[] args) {
        int[][] matriz = new int[6][10];
        Random random = new Random();
        rellenarMatriz(matriz, random);
        mostrarMatriz(matriz);
        int[] maximo = encontrarMaximo(matriz);
        int[] minimo = encontrarMinimo(matriz);
        System.out.printf("\nMáximo: %d en posición [%d][%d]\n", maximo[0], maximo[1], maximo[2]);
        System.out.printf("Mínimo: %d en posición [%d][%d]\n", minimo[0], minimo[1], minimo[2]);
    }
}
