/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones1y6;

import colecciones1y6.entidad.Celda;
import colecciones1y6.entidad.Matriz;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Colecciones1y6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Ejercicio 1
        

          
         ArrayList<Integer> numeros = new ArrayList<>();

    
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese números (ingrese un número negativo para detenerse):");

        
        while (true) {
           
            int numero = leer.nextInt();

  
            if (numero < 0) {
                break;
            }

            
            numeros.add(numero);
        }

        
        leer.close();

    
        System.out.println("Números ingresados:");
        
        for (int num : numeros) {
            System.out.println(num);
        }
        
        
        //Ejercicio 6
        
        
        Matriz matriz = new Matriz();

     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese valores para la matriz (Ingrese 'FIN' para terminar):");

     
        while (true) {
            
            System.out.print("Ingrese el valor: ");
            
            String valor = scanner.nextLine();

         
            if (valor.equals("FIN")) {
                
                break;
                
            }

            System.out.print("Ingrese la fila: ");
            int fila = scanner.nextInt();

            System.out.print("Ingrese la columna: ");
            int columna = scanner.nextInt();

          
            Celda nuevaCelda = new Celda(fila, columna, valor);
            
            matriz.agregarCelda(nuevaCelda);

            
            scanner.nextLine();
        }

      
        scanner.close();

     
        System.out.println("Valores ingresados en la matriz:");
        
        for (Celda celda : matriz.matrizCuadrada) {
            
            System.out.println("Fila: " + celda.fila + ", Columna: " + celda.columna + ", Valor: " + celda.valor);
        }

       
        System.out.println("Valor en la fila 2 y columna 3: " + matriz.obtenerValor(2, 3));
        
        
        
        
    }
    
}
