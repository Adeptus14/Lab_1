/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_4_5_6;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio_3_4_5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 3
        
         Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese la cantidad de alumnos de la clase: ");
        
        int alumnos = leer.nextInt();
        
        int notas[] = new int[alumnos];
        
        int suma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            
            System.out.println("Ingrese nota para el alumno " + (i+1));
            
            notas[i] = leer.nextInt();
            
           suma = suma + notas[i];
            
        }
        
        int media = Math.round(suma / alumnos);
        
        System.out.println("La media es: " + media);
        
        for (int i = 0; i < notas.length; i++) {
            
            
            if (notas[i] > media){
            
                System.out.println("Nota mayor a la media: " + notas[i]);
            
            }
            
            
        }
        
   
          //Ejercicio 4
     
      int pares[] = new int[20] ;
     
      int num = 0;
     
        for (int i = 0; i < pares.length; i++) {
           
            pares[i] =  num;
           
            num += 2;
                   
        }
     
     
        for (int i = 0; i < pares.length; i++) {
           
            System.out.println(pares[i]);
           
        }
       
        //Ejercicio 5
       
       
        int[] arreglo = new int[10];
       
        int ceros = 0, positivos = 0, negativos = 0;
       
        for (int i = 0; i < arreglo.length; i++) {
           
            System.out.println("Ingrese el elemento " + (i+1));
           
            arreglo[i] = leer.nextInt();
           
            if (arreglo[i] == 0){
           
            ceros += 1;
           
            }else if(arreglo[i] < 0){
           
            negativos += 1;
           
            }else{
           
            positivos += 1;
     
            }
           
        }
       
        System.out.println("Cantidad de ceros: " + ceros);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de positivos: " + positivos);
       
       
       
       //Ejercicio 6
       
       int positivos5 = 0, negativos5 = 0, sumaPositivos = 0, sumaNegativos = 0;

       int[] arregloEjercicio5 = new int[10];
       
        for (int i = 0; i < arregloEjercicio5.length; i++) {
            
            System.out.println("Ingrese el numero para la casilla: " + (i + 1));
            
            arregloEjercicio5[i] = leer.nextInt();

            if (arregloEjercicio5[i] < 0) {
                
                negativos5++;
                
                sumaNegativos += arregloEjercicio5[i];
                
            } else {
                
                positivos5++;
                
                sumaPositivos += arregloEjercicio5[i];
            }
        }

        if (positivos5 > 0) {
            
            double mediaPositivos = (double) sumaPositivos / positivos5;
            
            System.out.println("La media de los numeros positivos: " + mediaPositivos);
            
        } else {
            
            System.out.println("No ingresaste números positivos.");
        }

        if (negativos5 > 0) {
            
            double mediaNegativos = (double) sumaNegativos / negativos5;
            
            System.out.println("La media de los numeros negativos: " + mediaNegativos);
            
        } else {
            
            System.out.println("No ingresaste números negativos.");
        }
    }
    
}
