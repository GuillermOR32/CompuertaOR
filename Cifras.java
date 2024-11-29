import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero >= 0) {

            int numeroDeCifras = String.valueOf(numero).length();
            
            if (numeroDeCifras == 1) {
                System.out.println("El número tiene 1 cifra.");
            } else {
                System.out.println("El número tiene " + numeroDeCifras + " cifras.");
            }
        } else {
            System.out.println("Por favor, introduce un número entero positivo.");
        }
        
        scanner.close();
    }
}
