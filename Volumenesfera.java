import java.util.Scanner;

public class Volumenesfera {
    
    public static double calcularVolumenEsfera(double radio) {
        return (4.0 / 3) * Math.PI * Math.pow(radio, 3);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la longitud del radio de la esfera: ");
        double radio = scanner.nextDouble();
        
        double volumen = calcularVolumenEsfera(radio);

        System.out.println("El volumen de la esfera con radio " + radio + " es: " + volumen);
        
        scanner.close();
    }
}
