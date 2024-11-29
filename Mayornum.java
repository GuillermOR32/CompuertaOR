import java.util.Scanner;

public class Mayornum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce el tercer número entero: ");
        int num3 = scanner.nextInt();
        
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El mayor de los tres números es: " + mayor);
        
        scanner.close();
    }
}
