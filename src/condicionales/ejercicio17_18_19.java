package condicionales;

import java.util.Scanner;

public class ejercicio17_18_19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int higher = num1;
        if (num2 > num1) {
            higher = num2;
        }

        if (num3 > higher) {
            higher = num3;
        }

        System.out.println("El número mayor es: " + higher);
        System.out.println("Ingrese la hora");
        int hou = leer.nextInt();
        System.out.println("Ingrese los minutos");
        int minu = leer.nextInt();
        System.out.println("Ingrese lo segundos");
        int seco = leer.nextInt();
        if (hou >= 0 && hou < 24 && minu < 60 && minu > 0 && seco < 60 && seco > 0) {
            System.out.println("La hora ingresada es correcta");
        }

        System.out.println("Hora incorrecta");
        System.out.println("Ingrese un número, se imprimirá el nombre del mes");
        int month = leer.nextInt();
        switch (month) {
            case 1:
                System.out.println("Enero");
            case 2:
                System.out.println("Febrero");
            case 3:
                System.out.println("Marzo");
            case 4:
                System.out.println("Abril");
            case 5:
                System.out.println("Mayo");
            case 6:
                System.out.println("Junio");
            case 7:
                System.out.println("Julio");
            case 8:
                System.out.println("Agosto");
            case 9:
                System.out.println("Septiembre");
            case 10:
                System.out.println("Octubre");
            case 11:
                System.out.println("Noviembre");
            case 12:
                System.out.println("Diciembre");
        }

        if (month != 4 && month != 6 && month != 9 && month != 11) {
            if (month == 2) {
                System.out.println(" es un mes de 28 días");
            } else {
                System.out.println(" es un mes de 31 días");
            }
        } else {
            System.out.println(" es un mes de 30 días");
        }

    }
}
