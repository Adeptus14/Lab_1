
package com.mycompany.ejercicio_7_8_9;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_7_8_9 {

    public static void main(String[] args) {
        // Variables que usaremos en múltiples ejercicios:
        int cont, num;
        Scanner sc = new Scanner(System.in);
        // Ejercicio 7
        int contMen = 0, contMas = 0;
        double promed = 0;
        do{
            System.out.print("Número de personas: ");                                                             
            num = sc.nextInt();
        }while(num <= 0);
        double[] altura = new double[num];
        System.out.println("Ingrese la altura de las personas: ");
        for (cont = 0; cont < num; cont++) {
            System.out.println("Altura de la persona " + (cont + 1) + ": ");
            altura[cont] = sc.nextDouble();
            promed += altura[cont];
        }
        promed = promed / num;
        for (cont = 0; cont < num; cont++) {
            if (altura[cont] > promed) {
                contMas++;
            } else if (altura[cont] < promed) {
                contMen++;
            }
        }
        System.out.println("El promedio de estatura de las personas ingresadas es: " + promed);
        System.out.println("La cantidad de personas con estatura superior a la media es: " + contMas);
        System.out.println("La cantidad de personas con estatura inferior a la media es: " + contMen); 
        
        //Ejercicio 8
        
        double[] sueldo = new double[20]; 
        String[] nombre = new String[20];
        double sueldoMay = 0;
        String nombreMay = "";
        for (cont = 0; cont < 20; cont++) {
            sc.nextLine();
            System.out.println("Ingrese el nombre del empleado; " + (cont + 1));
            nombre[cont] = sc.nextLine();
            System.out.println("Ahora ingrese su sueldo; ");
            sueldo[cont] = sc.nextDouble();
            if (sueldo[cont] > sueldoMay) {
                sueldoMay = sueldo[cont];
                nombreMay = nombre[cont];
            }
        }
        System.out.println("El empleado con mayor sueldo es " + nombreMay + " con un sueldo de " + sueldoMay);
        
        //Ejercicio 9
        
        int[] arregloRan = new int[10];                                                                             
        Random rnd = new Random();
        for (cont = 0; cont < arregloRan.length; cont++) {
            arregloRan[cont] = rnd.nextInt(100);                                                 
        }
        System.out.println("El arreglo ha sido llenado, sus valores son: ");
        for (cont = 0; cont < arregloRan.length; cont++) {
            System.out.println("Valor del índice " + (cont + 1) + ": " + arregloRan[cont]);                                                 
        }
    }
}
