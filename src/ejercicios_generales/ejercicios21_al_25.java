package ejercicios_generales;

import java.util.Scanner;

public class ejercicios21_al_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");

System.out.println("21. Calcular la cifra mayor de un número y su posición. Versión 2.");
        int num, aux, digit, max, pos, maxPos, numDig;
        numDig = 0;
        max = 0;
        maxPos = 0;
        pos = 0;
        do {
            System.out.print("Ingrese un numero positivo: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Error");
            }
        } while (num <= 0);
        aux = num;
        while (aux != 0) {
            numDig++;
            aux = aux / 10;
        }
        for(int i = numDig-1; i >= 0; i--){
            pos++;
            digit = num / (int)Math.pow(10, i);
            if (digit > max) {
                max = digit;
                maxPos = pos;
            }
            num = num % (int)Math.pow(10, i);
        }
        System.out.println("La mayor cifra es: " + max);
        System.out.println("Se encuentra en la posición: " + maxPos);

        System.out.println(" ");

System.out.println("22. Mostrar las cifras de un número con su nombre.");
        int num22, aux22, digit22, count;
        count=0;
        do {
            System.out.print("Ingrese un numero positivo: ");
            num22 = sc.nextInt();
            if (num22 <= 0) {
                System.out.println("Error");
            }
        } while (num22 <= 0);
        aux22 = num22;
        while (aux22 != 0) {
            count++;
            aux22 = aux22 / 10;
        }
        for(int i = count-1; i >= 0; i--){
            digit22 = num22 / (int)Math.pow(10, i);
            switch(digit22){
                case 0:
                    System.out.print("cero");
                    break;
                case 1:
                    System.out.print("uno");
                    break;
                case 2:
                    System.out.print("dos");
                    break;
                case 3:
                    System.out.print("tres");
                    break;
                case 4:
                    System.out.print("cuatro");
                    break;
                case 5:
                    System.out.print("cinco");
                    break;
                case 6:
                    System.out.print("seis");
                    break;
                case 7:
                    System.out.print("siete");
                    break;
                case 8:
                    System.out.print("ocho");
                    break;
                case 9:
                    System.out.print("nueve");
                    break;
            }
            if (i != 0){
                System.out.print("-");
                num22 = num22 % (int)Math.pow(10, i);
            }
        }
        System.out.println(" ");

        System.out.println(" ");

System.out.println("23. Sumar las cifras de un número.");
        int num23, add, digit23;
        add=0;
        do {
            System.out.print("Ingrese un numero positivo: ");
            num23 = sc.nextInt();
            if (num23 <= 0) {
                System.out.println("Error");
            }
        } while (num23 <= 0);

        while (num23 != 0) {
            digit23 = num23 % 10;
            add += digit23;
            num23 = num23 / 10;
        }
        System.out.println("La suma da como resultado:"+add);

        System.out.println(" ");

System.out.println("24. Comprobar si un número es narcisista.");
        int num24, count24, aux24, add24;
        count24=0;
        add24=0;
        do {
            System.out.print("Ingrese un numero positivo: ");
            num24 = sc.nextInt();
            if (num24 <= 0) {
                System.out.println("Error");
            }
        } while (num24 <= 0);
        aux24=num24;
        while (aux24 != 0) {
            aux24 /= 10;
            count24 += 1;
        }
        aux24=num24;
        while (aux24 != 0) {
            digit23 = aux24 % 10;
            add24 += Math.pow(digit23, count24);
            aux24 /= 10;
        }
        if (add24==num24){
            System.out.println("El numero es narcisista");
        }else {
            System.out.println("El numero no es narcisista");
        }

        System.out.println(" ");

System.out.println("25. Calcular la letra del dni.");
        int dni;
        do{
            System.out.print("Introduce el DNI: ");
            dni = sc.nextInt();
            if (dni <= 0) {
                System.out.println("Error");
            }
        }while(dni < 1);
        System.out.println("Letra del dni: " + obtainDNILetter(dni));
        System.out.println(" ");
    }
        public static char obtainDNILetter(int dni) {
            char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                    'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            return letters[dni % 23];
        }
}
