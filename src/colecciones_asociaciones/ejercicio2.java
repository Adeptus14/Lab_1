package colecciones_asociaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();

        int numPlatos;
        System.out.print("Ingrese el numero de platos: ");
        numPlatos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        for (int i = 0; i < numPlatos; i++) {
            System.out.println("Ingrese los datos del plato N°" + (i + 1) + ":");
            System.out.print("Nombre completo del plato: ");
            String nombrePlato = scanner.nextLine();
            System.out.print("Precio del plato: $");
            double precioPlato = scanner.nextDouble();
            System.out.print("¿Es una bebida? (true/false): ");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            Plato plato = new Plato(nombrePlato, precioPlato, esBebida);

            if (!esBebida) {
                int numIngredientes;
                System.out.print("Ingrese el número de ingredientes del plato: ");
                numIngredientes = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                for (int j = 0; j < numIngredientes; j++) {
                    System.out.println("Ingrese los datos del ingrediente #" + (j + 1) + ":");
                    System.out.print("Nombre del ingrediente: ");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.print("Cantidad del ingrediente: ");
                    double cantidadIngrediente = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Unidad de medida del ingrediente: ");
                    String unidadMedidaIngrediente = scanner.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente, unidadMedidaIngrediente);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            platosMenu.add(plato);
        }

        System.out.println("-----------MENÚ----------------");
        for (Plato plato : platosMenu) {
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $" + plato.getPrecio());

            if (!plato.esBebida()) {
                System.out.println("Ingredientes:");
                System.out.printf("%-20s%-10s%-20s\n", "Nombre", "Cantidad", "Unidad de Medida");
                for (Ingrediente ingrediente : plato.getIngredientes()) {
                    System.out.printf("%-20s%-10.2f%-20s\n", ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getUnidadMedida());
                }
            }

            System.out.println("----------------------------------");
        }
    }
}

class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidadMedida;

    public Ingrediente(String nombre, double cantidad, String unidadMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }
}

class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esBebida() {
        return esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
