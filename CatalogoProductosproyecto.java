import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Producto {
    int id;
    String nombre;
    String descripcion;
    String categoria;
    double precio;

    public Producto(int id, String nombre, String descripcion, String categoria, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Descripción: " + descripcion +
               ", Categoría: " + categoria + ", Precio: $" + precio;
    }
}

public class CatalogoProductosproyecto {
    static List<Producto> productos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarProductos();

        while (true) {
            mostrarMenuPrincipal();
            int opcion = leerEntero();

            switch (opcion) {
                case 1:
                    buscarProductos();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el catálogo de productos!");
                    return;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }
        }
    }

    public static void inicializarProductos() {
        productos.add(new Producto(1, "Laptop", "Laptop gaming", "Electrónica", 1500));
        productos.add(new Producto(2, "Teléfono", "Teléfono inteligente", "Electrónica", 800));
        productos.add(new Producto(3, "Silla", "Silla ergonómica", "Muebles", 200));
        productos.add(new Producto(4, "Mesa", "Mesa de madera", "Muebles", 300));
        productos.add(new Producto(5, "Televisor", "Smart TV 4K", "Electrónica", 1200));
        productos.add(new Producto(6, "Audífonos", "Audífonos inalámbricos", "Electrónica", 150));
        productos.add(new Producto(7, "Refrigerador", "Refrigerador doble puerta", "Electrodomésticos", 2000));
        productos.add(new Producto(8, "Horno", "Horno microondas", "Electrodomésticos", 250));
        productos.add(new Producto(9, "Zapatos", "Zapatos deportivos", "Moda", 100));
        productos.add(new Producto(10, "Camiseta", "Camiseta básica", "Moda", 25));
        productos.add(new Producto(11, "Libro", "Libro de programación", "Libros", 50));
        productos.add(new Producto(12, "Tablet", "Tablet gráfica", "Electrónica", 600));
        productos.add(new Producto(13, "Monitor", "Monitor de 27 pulgadas", "Electrónica", 400));
        productos.add(new Producto(14, "Impresora", "Impresora multifunción", "Oficina", 350));
        productos.add(new Producto(15, "Mochila", "Mochila impermeable", "Accesorios", 70));
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("***************************************************");
        System.out.println("* Bienvenido al catálogo de productos.            *");
        System.out.println("* Selecciona una de las siguientes opciones:      *");
        System.out.println("* 1) Buscar productos                             *");
        System.out.println("* 2) Eliminar producto                            *");
        System.out.println("* 0) Salir                                        *");
        System.out.println("***************************************************");
        System.out.print("Selecciona una opción: ");
    }

    public static void buscarProductos() {
        System.out.println("1) Buscar productos por:");
        System.out.println("   a) ID");
        System.out.println("   b) Categoría");
        System.out.println("   c) Nombre/Descripción");
        System.out.println("   d) Rango de precio");
        System.out.print("Selecciona una opción de búsqueda (a/b/c/d): ");
        String opcion = scanner.nextLine();

        List<Producto> resultados = new ArrayList<>();

        switch (opcion) {
            case "a":
                System.out.print("Ingresa el ID del producto: ");
                int id = leerEntero();
                productos.stream()
                        .filter(p -> p.id == id)
                        .forEach(resultados::add);
                break;
            case "b":
                System.out.print("Ingresa la categoría: ");
                String categoria = limpiarTexto(scanner.nextLine());
                productos.stream()
                        .filter(p -> limpiarTexto(p.categoria).contains(categoria))
                        .forEach(resultados::add);
                break;
            case "c":
                System.out.print("Ingresa el nombre o descripción: ");
                String palabraClave = limpiarTexto(scanner.nextLine());
                productos.stream()
                        .filter(p -> limpiarTexto(p.nombre).contains(palabraClave) || limpiarTexto(p.descripcion).contains(palabraClave))
                        .forEach(resultados::add);
                break;
            case "d":
                System.out.print("Ingresa el precio mínimo: ");
                double precioMin = leerDouble();
                System.out.print("Ingresa el precio máximo: ");
                double precioMax = leerDouble();
                productos.stream()
                        .filter(p -> p.precio >= precioMin && p.precio <= precioMax)
                        .forEach(resultados::add);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        if (resultados.isEmpty()) {
            System.out.println("Producto no encontrado...");
        } else {
            System.out.println("Producto(s) Encontrado(s):");
            resultados.forEach(System.out::println);

            System.out.print("¿Deseas imprimir los resultados en un archivo PDF? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals("s")) {
                generarArchivoPDF(resultados);
            }
        }
    }

    public static void eliminarProducto() {
        System.out.print("Ingresa el ID del producto a eliminar: ");
        int id = leerEntero();
        Producto producto = productos.stream()
                                      .filter(p -> p.id == id)
                                      .findFirst()
                                      .orElse(null);

        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado: " + producto);
        } else {
            System.out.println("Producto no encontrado...");
        }
    }

    public static void generarArchivoPDF(List<Producto> resultados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("productos.pdf"))) {
            writer.write("Catálogo de Productos - Resultados de Búsqueda\n\n");
            for (Producto producto : resultados) {
                writer.write(producto.toString() + "\n");
            }
            System.out.println("Archivo PDF generado exitosamente: productos.pdf");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo PDF: " + e.getMessage());
        }
    }

    public static int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Por favor, ingresa un número válido: ");
            }
        }
    }

    public static double leerDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Por favor, ingresa un número válido: ");
            }
        }
    }

    public static String limpiarTexto(String texto) {
        texto = texto.toLowerCase();
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }
}
