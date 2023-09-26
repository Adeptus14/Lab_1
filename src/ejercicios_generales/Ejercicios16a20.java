package com.mycompany.ejercicios16a20;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Ejercicios16a20 {
    public static void main(String[] args) {
        //16) Comprobar si un número es primo
        int numero = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número");
            numero = sc.nextInt();
        } while (numero <= 0);
        if (numero == 1) {
            System.out.println("El número no es primo");
        } else {
            i = 2;
         while (numero % i != 0) { 
              i++;
         }
         if (i == numero) {
            System.out.println("El número es primo");  
         } else {
              System.out.println("El número no es primo");
         }
         }
        
        //17) Mostrar por separado las cifras de un número
        System.out.println("Ingrese un número");
        numero = sc.nextInt();
        String cadena = "";
        do {
            int numeroMod = numero % 10;
            cadena = " " + numeroMod + cadena;
            numero = numero / 10;
        } while (numero >= 1);
        System.out.println("El número separado es" + cadena);
        
        //18 Invertir las cifras de un número
        System.out.println("Ingrese un número");
        numero = sc.nextInt();
        int numero2 = 0;
        do {
            numero2 = numero2 * 10 + numero % 10;
            numero = numero / 10;
        } while (numero >=1);
        System.out.println("El número invertido es " + numero2);
        
        //19 Calcular el mayor de N números
        int mayor = 1;
        System.out.println("Ingrese un número positivo o negativo, ponga 0 para terminar el ingreso de números");
        do {
            numero = sc.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
        } while (numero != 0);
        System.out.println("El número mayor es " + mayor);
        
        //20 Calcular la cifra mayor de un número y su posición 
        int posMayor, cifra, pos, cont;
        mayor = 0;
        posMayor = 0;
        cont = 0;
        
        do {
            System.out.println("Introduce un numero entero mayor a 0: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        int aux = numero;
        do {
            aux = aux / 10;
            cont++;
        } while (aux >= 1);
        
        pos = cont;
        
        while (numero != 0) {
            cifra = numero % 10;
            if (cifra >= mayor) {
                mayor = cifra;
                posMayor = pos;
            }
            pos--;
            numero = numero / 10;
        }
        System.out.print("Cifra mayor: " + mayor);
        System.out.println(" Posición: " + posMayor);
    }
}
