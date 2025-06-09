public class ejercicio14 {
    public static int[] generarArrayAleatorio(int longitud) {
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = (int)(Math.random() * 201); 
        }
        return array;
    }
    public static void mostrarArrayConIndices(int[] array) {
        System.out.print("Índices: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("Valores: ");
        for (int valor : array) {
            System.out.printf("%4d", valor);
        }
        System.out.println("\n");
    }

    public static int[] obtenerMenoresOIgual100(int[] array) {
        int[] temp = new int[array.length];
        int contador = 0;
        for (int valor : array) {
            if (valor <= 100) {
                temp[contador++] = valor;
            }
        }
        return copiarArray(temp, contador);
    }
    public static int[] obtenerMayores100(int[] array) {
        int[] temp = new int[array.length];
        int contador = 0;
        for (int valor : array) {
            if (valor > 100) {
                temp[contador++] = valor;
            }
        }
        return copiarArray(temp, contador);
    }

    public static int[] copiarArray(int[] array, int cantidad) {
        int[] resultado = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            resultado[i] = array[i];
        }
        return resultado;
    }

    public static int[] alternarArrays(int[] menores, int[] mayores, int tamañoFinal) {
        int[] resultado = new int[tamañoFinal];
        int i = 0, m = 0, M = 0;

        while (i < tamañoFinal) {
            if (m < menores.length) {
                resultado[i++] = menores[m++];
            }
            if (i < tamañoFinal && M < mayores.length) {
                resultado[i++] = mayores[M++];
            }
        }

        while (m < menores.length) {
            resultado[i++] = menores[m++];
        }
        while (M < mayores.length) {
            resultado[i++] = mayores[M++];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] numeros = generarArrayAleatorio(10);
        System.out.println("Array original:");
        mostrarArrayConIndices(numeros);
        int[] menores = obtenerMenoresOIgual100(numeros);
        int[] mayores = obtenerMayores100(numeros);
        int[] mezclado = alternarArrays(menores, mayores, numeros.length);
        System.out.println("Array reordenado (alternando ≤100 y >100):");
        mostrarArrayConIndices(mezclado);
    }
}
