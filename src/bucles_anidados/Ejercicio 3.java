/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
          
        System.out.print("Ingrese un número para calcular su factorial: ");
        
        int numero = leer.nextInt();
        
        
        long factorial = 1; 
        
        
        for (int i = 1; i <= numero; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                factorial *= j;
            }
        }
        
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
    
    

