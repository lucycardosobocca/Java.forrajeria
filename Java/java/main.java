import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Producto> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú de Productos ---");
            System.out.println("1. Crear artículo");
            System.out.println("2. Crear producto tecnológico");
            System.out.println("3. Listar productos");
            System.out.println("4. Modificar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> crearArticulo();
                case 2 -> crearProductoTecnologico();
                case 3 -> listarProductos();
                case 4 -> modificarProducto();
                case 5 -> eliminarProducto();
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 6);
    }

    public static void crearArticulo() {
        System.out.print("ID: ");
      
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        lista.add(new Articulo(id, nombre, precio));
        System.out.println("Artículo creado.");
    }

    public static void crearProductoTecnologico() {
        System.out.print("ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble(); sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();

        lista.add(new ProductoTecnologico(id, nombre, precio, marca));
        System.out.println("Producto tecnológico creado.");
    }

    public static void listarProductos() {
        if (lista.isEmpty()) {
            System.out.println("No hay productos.");
        } else {
            for (Producto p : lista) {
              
                p.mostrarDetalle(); 
            }
        }
    }

    public static void modificarProducto() {
        System.out.print("ID del producto a modificar: ");
        int id = sc.nextInt(); sc.nextLine();
      
        for (Producto p : lista) {

           
            if (p.getId() == id && p instanceof Vendible) {

              
                System.out.print("Nuevo nombre: ");
                p.setNombre(sc.nextLine());  

              
                System.out.print("Nuevo precio: ");
              
                ((Vendible) p).setPrecio(sc.nextDouble());   
                System.out.println("Producto modificado.");
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public static void eliminarProducto() {
        System.out.print("ID del producto a eliminar: ");
        int id = sc.nextInt();
        lista.removeIf(p -> p.getId() == id);
        System.out.println("Producto eliminado si existía.");
    }
}