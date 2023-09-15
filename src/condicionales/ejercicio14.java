package condicionales;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inv = 0;
        System.out.println("Ingrese un numero de 3 cifras: ");
        int whimsical = sc.nextInt();

        for(int num = whimsical; num > 0; num /= 10) {
            int rest = num % 10;
            inv = inv * 10 + rest;
        }

        if (whimsical == inv) {
            System.out.println("Es capicua " + inv);
        } else {
            System.out.println("No es capicua " + inv);
        }
    }
}
