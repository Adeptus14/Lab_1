package bucles_anidados;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number from which you want to obtain the factorial:");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            int f = 1;
            System.out.print(i + "! = ");
            for (int j = 1; j <= i; j++) {
                    f *= j;
                    System.out.print((j != i) ? (j + " x ") : (j + " "));
                }
                System.out.println("= " + f);
            }

            sc.close();
        }

    }
