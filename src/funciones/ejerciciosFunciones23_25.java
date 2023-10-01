package funciones;

import java.util.Scanner;

public class ejerciciosFunciones23_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");

System.out.println("23. Sumar las cifras de un número (con funcion).");
        int num23;
        do {
            System.out.print("Ingrese un numero positivo: ");
            num23 = sc.nextInt();
            if (num23 <= 0) {
                System.out.println("Error");
            }
        } while (num23 <= 0);
            System.out.println("La suma da como resultado:" + sumCifras(num23));

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
    }
        public static char obtenerLetraDNI(int dni) {
            char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                    'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            return letters[dni % 23];
        }

        public static int sumCifras(int num23) {
            int add, digit23;
            add = 0;
            while (num23 != 0) {
                digit23 = num23 % 10;
                add += digit23;
                num23 = num23 / 10;
            }
            return add;
        }
}
