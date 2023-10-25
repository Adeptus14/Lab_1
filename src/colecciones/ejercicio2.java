package colecciones;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();

        // Numeros ingresados por el usuario
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa el " + i + "° numero: ");
            int num = sc.nextInt();
            numList.add(num);
        }

        // Mayor y menor de los numeros
        int max = numList.get(0);
        int min = numList.get(0);
        for (int num : numList) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Rango
        int range = max - min;

        System.out.println("El mayor numero es: " + max);
        System.out.println("El menor numero es: " + min);
        System.out.println("El rango es: " + range);
    }
}