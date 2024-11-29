import java.util.ArrayList;

public class CombinarArrays {
    public static void main(String[] args) {
        // 1) Generar un Array que contenga los números del 1 al 100
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Números del 1 al 100
        }

        // 2) Crear un ArrayList que contenga los números del 101 al 200
        ArrayList<Integer> arrayList101a200 = new ArrayList<>();
        for (int i = 101; i <= 200; i++) {
            arrayList101a200.add(i);
        }

        // 3) Crear un ArrayList que contenga los valores de ambos (1-200)
        ArrayList<Integer> arrayListCombinado = new ArrayList<>();
        for (int num : array) {
            arrayListCombinado.add(num); // Agregar valores del array (1-100)
        }
        arrayListCombinado.addAll(arrayList101a200); // Agregar valores del ArrayList (101-200)

        // Mostrar resultados
        System.out.println("Valores del Array (1-100):");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nValores del ArrayList (101-200):");
        for (int num : arrayList101a200) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nValores combinados (1-200):");
        for (int num : arrayListCombinado) {
            System.out.print(num + " ");
        }
    }
}
