/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesyasociaciones1;

import coleccionesyasociaciones1.entidades1.Alumno;
import coleccionesyasociaciones1.entidades1.Nota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ColeccionesyAsociaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Alumno> alumnos = new ArrayList<>();

        while (true) {
            
            System.out.println("---------INGRESE DATOS DEL ALUMNO----------");
            
            System.out.println("INGRESE NOMBRE COMPLETO: ");
            
            String nombreCompleto = leer.nextLine();
            
            System.out.println("INGRESE LEGAJO");
            long legajo = leer.nextLong();
            leer.nextLine(); 

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            while (true) {
                
                System.out.println("INGRESE NOMBRE CATEDRA: ");
                
                String nombreCatedra = leer.nextLine();
                
                System.out.println("Nota");
                double notaExamen = leer.nextDouble();
                leer.nextLine(); 

                Nota nota = new Nota(nombreCatedra, notaExamen);
                alumno.addNota(nota);

                System.out.println("DESEA SALIR DE LA CARGA DE NOTAS? (s/n): ");
                
                String salirNotas = leer.nextLine();
                
                if (salirNotas.equalsIgnoreCase("s")) {
                    
                    break;
                    
                }
            }

            alumnos.add(alumno);

            System.out.println("DESEA SALIR DE CARGA DE ALUMNOS? (s/n)");
            
            String salirAlumno = leer.nextLine();
            
            if (salirAlumno.equalsIgnoreCase("s")) {
                
                break;
                
            }
        }

        for (Alumno alumno : alumnos) {
            
            System.out.println("Datos Alumno: " + alumno.getNombreCompleto() + ", Legajo: " + alumno.getLegajo());
            
            for (Nota nota : alumno.getNotas()) {
                
                System.out.println("Nota: " + nota.getNotaExamen() + ", Catedra: " + nota.getCatedra());
                
            }
            
            System.out.println("El promedio del alumno es: " + alumno.calcularPromedio());
        }

      
        
       
        
        
    }
    
}
