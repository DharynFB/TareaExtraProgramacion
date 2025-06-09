import java.util.Scanner;

public class ejercicio12 {
    public static int[] llenarArrayAleatorio(int cantidad) {
        int[] array = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            array[i] = (int)(Math.random() * 21); 
        }
        return array;
    }

    public static void mostrarArray(int[] array, int resaltarMultiplo) {
        System.out.println("\nVector:");
        for (int i = 0; i < array.length; i++) {
            if (resaltarMultiplo > 0 && array[i] % resaltarMultiplo == 0) {
                System.out.print("[" + array[i] + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static int leerOpcionMultiplo() {
        Scanner t = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("\n¿Quieres resaltar múltiplos de 5 o de 7? (Escribe 5 o 7): ");
            opcion = t.nextInt();
        } while (opcion != 5 && opcion != 7);
        return opcion;
    }


    public static void main(String[] args) {
        int[] numeros = llenarArrayAleatorio(10);
        int multiplo;
        mostrarArray(numeros, 0); 

        multiplo = leerOpcionMultiplo();

        mostrarArray(numeros, multiplo);
    }
}
