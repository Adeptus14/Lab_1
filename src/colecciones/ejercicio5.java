package colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        // Solicitar y cargar 10 dígitos enteros en la ArrayList
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Crear dos nuevas ArrayList y ordenarlas
        List<Integer> ascendente = new ArrayList<>(numeros);
        List<Integer> descendente = new ArrayList<>(numeros);

        Collections.sort(ascendente); // Ordenar de forma ascendente
        Collections.sort(descendente, Collections.reverseOrder()); // Ordenar de forma descendente

        // Mostrar las listas por pantalla
        System.out.println("Lista Ascendente: " + ascendente);
        System.out.println("Lista Descendente: " + descendente);
    }
}
