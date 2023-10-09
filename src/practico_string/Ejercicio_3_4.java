/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_4;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio_3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Ejercicio 3
        
        Scanner leer = new Scanner(System.in);
        
        int menorPar = Integer.MAX_VALUE; 
        
        int cantidadImpares = 0;

        System.out.println("Ingrese la secuencia de números (0 para salir): ");

        while (true) {
            
            int numero = leer.nextInt();

            if (numero == 0) {
                
                break;
                
            }

            if (numero % 2 == 0 && numero < menorPar) {
                
                menorPar = numero;
                
            } else if (numero % 2 != 0) {
                
                cantidadImpares++;
                
            }
        }

        if (menorPar != Integer.MAX_VALUE) {
            
            System.out.println("El menor número par es: " + menorPar);
            
        } else {
            
            System.out.println("No se ingresaron números pares.");
            
        }

        System.out.println("La cantidad de números impares es: " + cantidadImpares);
        
        
        leer.nextLine();
        
        //Ejercicio 4
        
      System.out.print("Ingrese un texto terminado en un punto: ");
        
        String texto = leer.nextLine().toLowerCase(); 

        int contadorLetraA = 0;

        for (int i = 0; i < texto.length(); i++) {
            
            char caracter = texto.charAt(i);

        
            if (caracter == 'a') {
                
                contadorLetraA++;
                
            }
        }

        System.out.println("La cantidad de letras 'a' en el texto es: " + contadorLetraA);
        
        
        
        
        
        
        
        
    }
    
}
