/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        //Ejercicio 1 Funciones
        
        String variable1 = "Hola";
        
        System.out.println("Variable 1: " + variable1);
        
        String variable2 = "Adios";
        
        System.out.println("Variable 2: " + variable2);
        
        cambiarVariable(variable1, variable2);
        
       
        System.out.println("La variable uno quedo como: " + cambiarVariable(variable1, variable2));
        
        System.out.println("La variable dos quedo como: " + cambiarVariable(variable2, variable1));
        
        //Ejercicio 2
        
         System.out.println("Ingrese un número, se contara la cantidad de digitos que tiene");
        
        int num = leer.nextInt();
        
        System.out.println("La cantidad de dígitos de su número son: " + calcularDigitos(num));
        
       
        
        
        
        
    }
    
    
    
 static int calcularDigitos(int num){
 
  int cifras = 0;
        
        do{
        
        num = num / 10;
        
        cifras++;
        
        }while(num != 0);
        
       return cifras;
 
 }
    
    
    static String cambiarVariable(String var1, String var2){
    
    String aux = var1;
    
    var1 = var2;
    
    var2 = aux;
    
    return var1;
    
    
    }
    
    
    
}
