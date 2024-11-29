import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumerosUnicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0;

        System.out.println("Ingresa números enteros. Ingresa un número negativo para finalizar.");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; 
            }

            if (!numeros.contains(numero)) {
                numeros.add(numero);
                suma += numero; 
            } else {
                System.out.println("El número ya está en la lista. Intenta con otro.");
            }
        }

        System.out.println("\nNúmeros ingresados: " + numeros);
        System.out.println("Suma total: " + suma);

        scanner.close();
    }
}
