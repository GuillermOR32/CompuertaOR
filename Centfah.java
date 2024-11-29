import java.util.Scanner;

public class Centfah {

    public static double convertirACentigradosAFahrenheit(double centigrados) {
        return 32 + (9 * centigrados / 5);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Introduce la cantidad de grados centígrados: ");
        double centigrados = scanner.nextDouble();
        

        double fahrenheit = convertirACentigradosAFahrenheit(centigrados);
        System.out.println("La cantidad de " + centigrados + " grados centígrados equivale a " + fahrenheit + " grados Fahrenheit.");
        

        scanner.close();
    }
}
