package colecciones_hashmap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ComponenteCPU {
    private String componente;
    private String marca;
    private int cantidad;
    private double precio;

    public ComponenteCPU(String componente, String marca, int cantidad, double precio) {
        this.componente = componente;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double calcularPrecioTotal() {
        return cantidad * precio;
    }

    public String toString() {
        return "ComponenteCPU{" +
                "componente='" + componente + '\'' +
                ", marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}

class Computadora {
    private String marca;
    private String modelo;
    private Set<ComponenteCPU> componentes;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = new HashSet<>();
    }

    public void agregarComponente(ComponenteCPU componente) {
        componentes.add(componente);
    }

    public double calcularPrecioCosto() {
        double precioCosto = 0.0;
        for (ComponenteCPU componente : componentes) {
            precioCosto += componente.calcularPrecioTotal();
        }
        return precioCosto;
    }

    public double calcularPrecioVentaSugerido() {
        double precioCosto = calcularPrecioCosto();
        return precioCosto < 50000 ? precioCosto + 0.4 * precioCosto : precioCosto + 0.3 * precioCosto;
    }

    @Override
    public String toString() {
        calcularPrecioCosto();
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", componentes=" + componentes +
                ", costo final=" + calcularPrecioVentaSugerido() +
                '}';
    }
}

public class EjercicioB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Ingrese la marca de la computadora:");
            String marcaComputadora = scanner.nextLine();

            System.out.println("Ingrese el modelo de la computadora:");
            String modeloComputadora = scanner.nextLine();

            Computadora computadora = new Computadora(marcaComputadora, modeloComputadora);

            System.out.println("Ingrese la cantidad de componentes:");
            int cantidadComponentes = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < cantidadComponentes; i++) {
                System.out.println("Ingrese el componente " + (i + 1) + ":");
                System.out.println("Ingrese el nombre del componente:");
                String nombreComponente = scanner.nextLine();

                System.out.println("Ingrese la marca del componente:");
                String marcaComponente = scanner.nextLine();

                System.out.println("Ingrese la cantidad del componente:");
                int cantidad = Integer.parseInt(scanner.nextLine());

                System.out.println("Ingrese el precio del componente:");
                double precio = Double.parseDouble(scanner.nextLine());

                ComponenteCPU componenteCPU = new ComponenteCPU(nombreComponente, marcaComponente, cantidad, precio);
                computadora.agregarComponente(componenteCPU);
            }

            System.out.println("Información de la computadora:");
            System.out.println(computadora);

            System.out.println("¿Desea cotizar una nueva computadora? (SI/NO)");
            respuesta = scanner.nextLine().toUpperCase();

        } while (respuesta.equals("SI"));

        System.out.println("Fin del programa.");
    }
}

