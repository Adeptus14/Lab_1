package bucles_anidados;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");

System.out.println("6. Mostrar los números primos desde 2 hasta N.");
        int num, i, j;
        do {
            System.out.print("Ingrese un numero mayor que 2: ");
            num = sc.nextInt();
            if (num <= 2) {
                System.out.println("Error");
            }
        } while (num <= 2);
        System.out.print("Los numeros primos desde 1 hasta "+num+" son: ");
        for (j = 2; j <= num; j++) {
            i = 2;
            while (j % i != 0) {
                i++;
            }
            if (i == j) {
                System.out.print(j);
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
