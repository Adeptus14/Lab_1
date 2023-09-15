package condicionales;

import java.util.Scanner;

public class ejercicio15_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double numero = (double)sc.nextInt();
        System.out.println("Ingrese otro número");
        double numer2 = (double)sc.nextInt();
        double divi2;
        if (numero != 0.0 && numer2 != 0.0) {
            if (numero > 0.0 && numer2 > 0.0) {
                System.out.println("La división de estos números:");
                divi2 = numero / numer2;
                System.out.println(divi2);
            }
        } else {
            System.out.println("operación inválida");
        }

        if (numero != 0.0 && numer2 != 0.0) {
            if (numero < numer2) {
                System.out.println("El número más grande es dividio por el más pequeño");
                divi2 = numer2 / numero;
                System.out.println(divi2);
            } else if (numer2 < numero) {
                System.out.println("El número más grande es dividio por el más pequeño");
                divi2 = numero / numer2;
                System.out.println(divi2);
            }
        } else {
            System.out.println("operación inválida");
        }

    }
}
