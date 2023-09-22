package funciones;

import java.util.Scanner;

public class ejercicios21_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");

        System.out.println("2 (con funcion).");

        System.out.println(" ");

        System.out.println("25. Calcular la letra del dni (con funcion).");
        int dni;
            do{
            System.out.print("Introduce el DNI: ");
            dni = sc.nextInt();
            if (dni <= 0) {
                System.out.println("Error");
            }
        }while(dni < 1);
            System.out.println("Letra del dni: " + obtenerLetraDNI(dni));
            System.out.println(" ");
    }
        public static char obtenerLetraDNI(int dni) {
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                    'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            return letras[dni % 23];
        }
}
