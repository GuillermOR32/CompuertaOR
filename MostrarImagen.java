import javax.swing.*;
import java.awt.*;
import java.net.URI;  
import java.io.File;

public class MostrarImagen {

    public static void mostrarImagen(String ruta) {
        try {

            JFrame ventana = new JFrame("Visualizador de Imagen");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(600, 400); 
            
            ImageIcon imagen;
            if (ruta.startsWith("http://") || ruta.startsWith("https://")) {

                URI uri = new URI(ruta);
                imagen = new ImageIcon(uri.toURL());  
            } else {

                imagen = new ImageIcon(new File(ruta).getAbsolutePath());
            }
            
            Image imagenEscalada = imagen.getImage().getScaledInstance(
                    ventana.getWidth(), ventana.getHeight(), Image.SCALE_SMOOTH);
            JLabel etiquetaImagen = new JLabel(new ImageIcon(imagenEscalada));
            
            ventana.add(etiquetaImagen);
            ventana.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String rutaEjemplo = "https://www.1zoom.me/prev/303/302250.jpg";
        mostrarImagen(rutaEjemplo);
    }
}
