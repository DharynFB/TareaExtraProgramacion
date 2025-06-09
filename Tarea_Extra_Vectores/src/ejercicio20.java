import java.util.Scanner;
public class ejercicio20 {
    public static void leerNumeros(int[][] matriz, Scanner sc) {
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Número para posición [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public static int[] sumaFilas(int[][] matriz) {
        int[] sumaFilas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            sumaFilas[i] = suma;
        }
        return sumaFilas;
    }
    public static int[] sumaColumnas(int[][] matriz) {
        int[] sumaCols = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            sumaCols[j] = suma;
        }
        return sumaCols;
    }
    public static int sumaTotal(int[] sumaFilas) {
        int total = 0;
        for (int val : sumaFilas) {
            total += val;
        }
        return total;
    }
    public static void mostrarMatrizConSumas(int[][] matriz, int[] sumaFilas, int[] sumaColumnas, int sumaTotal) {
        System.out.println("\nMatriz con sumas parciales:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.printf(" |%5d\n", sumaFilas[i]);
        }

        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("-----");
        }
        System.out.println("");

        for (int j = 0; j < sumaColumnas.length; j++) {
            System.out.printf("%5d", sumaColumnas[j]);
        }
        System.out.printf(" |%5d\n", sumaTotal);
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[][] matriz = new int[4][5];

        leerNumeros(matriz, t);

        int[] sumaFilas = sumaFilas(matriz);
        int[] sumaColumnas = sumaColumnas(matriz);
        int total = sumaTotal(sumaFilas);

        mostrarMatrizConSumas(matriz, sumaFilas, sumaColumnas, total);

    }
}
