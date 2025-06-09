import java.util.Scanner;

public class ejercicio3 {

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

    public static void mostrarInverso(int[] numeros) {
        System.out.println("\nNúmeros en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

    public static void main(String[] args) {
        int[] numeros = leerNumeros(10);
        mostrarInverso(numeros);
    }
}
