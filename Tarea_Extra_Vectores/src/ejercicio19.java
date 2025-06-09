import java.util.Random;

public class ejercicio19 {

    public static void rellenarEstaturas(int[][] estaturas, Random rand) {
        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = 140 + rand.nextInt(71); 
            }
        }
    }

    public static int calcularMaximo(int[] array) {
        int max = array[0];
        for (int val : array) {
            if (val > max) max = val;
        }
        return max;
    }

    public static int calcularMinimo(int[] array) {
        int min = array[0];
        for (int val : array) {
            if (val < min) min = val;
        }
        return min;
    }

    public static int calcularMedia(int[] array) {
        int suma = 0;
        for (int val : array) {
            suma += val;
        }
        return suma / array.length; 
    }

    public static void mostrarEstadisticas(String[] paises, int[][] estaturas) {
        for (int i = 0; i < estaturas.length; i++) {
            int max = calcularMaximo(estaturas[i]);
            int min = calcularMinimo(estaturas[i]);
            int media = calcularMedia(estaturas[i]);

            System.out.printf("País: %s\n", paises[i]);
            System.out.printf("Estatura máxima: %d cm\n", max);
            System.out.printf("Estatura mínima: %d cm\n", min);
            System.out.printf("Estatura media: %d cm\n", media);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        int[][] estaturas = new int[4][10];
        Random rand = new Random();

        rellenarEstaturas(estaturas, rand);
        mostrarEstadisticas(paises, estaturas);
    }
}
