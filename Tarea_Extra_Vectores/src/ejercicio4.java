import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    public static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
        Random rand = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = rand.nextInt(max - min + 1) + min;
        }
        return numeros;
    }
    public static void mostrarNumerosOriginales(int[] numeros) {
        System.out.println("Números generados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static int pedirNumero(String mensaje) {
        Scanner t = new Scanner(System.in);
        System.out.print(mensaje);
        return t.nextInt();
    }
    public static void reemplazarYMostrar(int[] numeros, int buscar, int reemplazo) {
        System.out.println("\nLista modificada (valores cambiados entre comillas):");
        for (int n : numeros) {
            if (n == buscar) {
                System.out.print("\"" + reemplazo + "\" ");
            } else {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(15, 0, 20);
        mostrarNumerosOriginales(numeros);

        int buscar = pedirNumero("\nIntroduce el valor que deseas reemplazar: ");
        int reemplazo = pedirNumero("Introduce el nuevo valor: ");

        reemplazarYMostrar(numeros, buscar, reemplazo);
    }
}
