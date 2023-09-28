package arrays_y_matrices;

import java.util.Scanner;
/**
 * *@author ENZO ROSS HAUSBERGER
 */
public class Ejercicio_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1) Calcular la media de una serie de números que se leen por teclado.
        int[] numbers = new int[10];
        float mean = 0.0f;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = sc.nextInt();
            mean += numbers[i];
        }

        System.out.println("Mean: " + (mean / 10));

        //2) Leer 10 números enteros por teclado y guardarlos en un array.
        //Calcula y muestra la media de los números que estén en las posiciones pares del array.
        int[] num2 = new int[10];
        int j = 0;
        mean = 0.0f;

        for (int i = 0; i < num2.length; i++) {
            System.out.println("Please enter a number: ");
            num2[i] = sc.nextInt();
            if (i % 2 == 0) {
                mean += num2[i];
                j++;
            }
        }

        System.out.println("Mean only in even indexs: " + (mean / j));
        sc.close();
    }
}

