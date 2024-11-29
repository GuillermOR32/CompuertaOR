import java.util.Random;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        int[] arreglo = new int[100];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 500 + random.nextInt(501); 
        }

        System.out.println("Arreglo antes del ordenamiento:");
        mostrarArreglo(arreglo);

        ordenarBurbuja(arreglo);

        System.out.println("Arreglo después del ordenamiento:");
        mostrarArreglo(arreglo);
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
        }
    }
}
