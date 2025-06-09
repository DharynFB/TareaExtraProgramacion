import java.util.Scanner;

public class ejercicio6 {

    public static int[] leerNumeros(int cantidad) {
        Scanner t = new Scanner(System.in);
        int[] numeros = new int[cantidad];
        System.out.println("Introduce " + cantidad + " números enteros:");

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = t.nextInt();
        }
        return numeros;
    }

    public static void mostrarParImpar(int[] numeros) {
        System.out.println("\nResultado:");
        String tipo;
        for (int numero : numeros) {
            tipo = (numero % 2 == 0) ? "par" : "impar";
            System.out.println(numero + " es " + tipo);
        }
    }

    public static void main(String[] args) {
        int[] numeros = leerNumeros(8);
        mostrarParImpar(numeros);
    }
}
