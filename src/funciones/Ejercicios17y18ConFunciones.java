package com.mycompany.ejercicios17y18confunciones;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Ejercicios17y18ConFunciones {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        //17) Mostrar por separado las cifras de un número
        System.out.println("Ingrese un número");
        numero = sc.nextInt();
        String cadena = "";
        cadena = separar(cadena, numero);
        System.out.println("El número separado es" + cadena);
        
        //18 Invertir las cifras de un número
        System.out.println("Ingrese un número");
        numero = sc.nextInt();
        int numero2 = 0;
        numero2 = invertir(numero, numero2);
        System.out.println("El número invertido es " + numero2);
    }
    
    public static String separar(String pCad, int pNum) {
        do {
            int numeroMod = pNum % 10;
            pCad = " " + numeroMod + pCad;
            pNum = pNum / 10;
        } while (pNum >= 1);
        return pCad;
    }
    public static int invertir(int pNum, int pNum2) {
        do {
            pNum2 = pNum2 * 10 + pNum % 10;
            pNum = pNum / 10;
        } while (pNum >=1);
        return pNum2;
    }
    
}
