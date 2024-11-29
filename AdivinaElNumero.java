import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bajo = 1;
        int alto = 100;
        int intento;
        String respuesta;
        
        System.out.println("Piensa en un número entre 1 y 100, yo lo adivinaré.");
        
        while (true) {
            // El programa hace una suposición al promediar el valor bajo y alto
            intento = (bajo + alto) / 2;
            System.out.println("¿Es " + intento + "? (responde 'muy bajo', 'muy alto', o 'correcto')");
            
            // Leer la respuesta del usuario
            respuesta = scanner.nextLine().toLowerCase();
            
            // Verificar la respuesta
            if (respuesta.equals("correcto")) {
                System.out.println("¡He adivinado correctamente! El número es " + intento + ".");
                break; // Terminar el juego
            } else if (respuesta.equals("muy bajo")) {
                bajo = intento + 1; // El número debe ser mayor, ajustamos el rango inferior
            } else if (respuesta.equals("muy alto")) {
                alto = intento - 1; // El número debe ser menor, ajustamos el rango superior
            } else {
                System.out.println("Respuesta no válida, por favor responde 'muy bajo', 'muy alto', o 'correcto'.");
            }
        }
        
        scanner.close();
    }
}
