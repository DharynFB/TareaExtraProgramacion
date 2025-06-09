import java.util.Scanner;

public class ejercicio5 {

    public static final String[] MESES = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    public static int[] leerTemperaturas() {
        Scanner t = new Scanner(System.in);
        int[] temperaturas = new int[12];

        System.out.println("Introduce la temperatura media de cada mes:");
        for (int i = 0; i < 12; i++) {
            System.out.print(MESES[i] + ": ");
            temperaturas[i] = t.nextInt();
        }

        return temperaturas;
    }
    public static void mostrarDiagrama(int[] temperaturas) {
        System.out.println("\nDiagrama de temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("%-12s | ", MESES[i]);
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + temperaturas[i] + "°C)");
        }
    }
    public static void main(String[] args) {
        int[] temperaturas = leerTemperaturas();
        mostrarDiagrama(temperaturas);
    }
}
