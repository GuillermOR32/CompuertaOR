import java.util.Scanner;

public class CalcularAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción para calcular el área:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Triángulo
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;

                case 2: // Cuadrado
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;

                case 3: // Círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Math.PI * radio * radio;
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;

                case 4: // Rectángulo
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRect = scanner.nextDouble();
                    double areaRectangulo = baseRect * alturaRect;
                    System.out.println("El área del rectángulo es: " + areaRectangulo);
                    break;

                case 5: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default: // Opción inválida
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }
}
