package condicionales;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("Es año bisiesto");
        } else {
            System.out.println("No es año bisiesto");
        }

    }
}
