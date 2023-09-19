/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1_5;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicios1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
             //Ejercicio 1
        
        String variable1 = "Hola";
        
        System.out.println("Variable 1: " + variable1);
        
        String variable2 = "Adios";
        
        System.out.println("Variable 2: " + variable2);
        
       String aux = variable1;
       
       variable1 = variable2;
       
       variable2 = aux;
       
        System.out.println("La variable uno quedo como: " + variable1);
        
        System.out.println("La variable dos quedo como: " + variable2);
        
        //Ejercicio 2
        
        System.out.println("Ingrese un número, se contara la cantidad de digitos que tiene");
        
        int num = leer.nextInt();
        
        int cifras = 0;
        
        do{
        
        num = num / 10;
        
        cifras++;
        
        }while(num != 0);
        
        System.out.println("La cantidad de dígitos es: " + cifras);
        
        //Ejercicio 3
        
        boolean salir = true;

        do {
            System.out.println("Ingrese grados centígrados: ");
            
            Double centigrados = leer.nextDouble();

            Double kelvin = centigrados + 273;
            
            System.out.println("Kelvin: " + kelvin);

            System.out.println("¿Desea repetir el proceso? (S/N)");

            String respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("s")) {
                
                System.out.println("Repetir");
                
            } else if (respuesta.equalsIgnoreCase("n")) {
                
                System.out.println("Saliendo...");
                
                salir = false;
            } else {
                System.out.println("Error");
                
                salir = false;
                        
            }

        } while (salir);
        
        //Ejercicio 4
        
         System.out.println("Ingrese un número, se mostrará la tabla de multiplicar de este");
        
       int numMult = leer.nextInt();
       
       for (int i = 0 ; i <= 10 ; i++){
       
           System.out.println(numMult + " x " + i + " = " + (numMult * i));
   
       }
        
      //Ejercicio 5
      
       int cont2 = 0;

        while (true) {
            
            System.out.println("Ingrese un número, ingrese un número negativo para salir ");
            
            int numTermina2 = leer.nextInt();

            if (numTermina2 % 10 == 2) {
                
                cont2++;
                
            } else if (numTermina2 < 0) {
                
                System.out.println("Saliendo...");
                
                break;
            }
        }

        System.out.println("Se han ingresado " + cont2 + " números terminados en 2");
        
        
    }
    
}
