package ejercicios_generales;

import java.util.Scanner;
import java.io.IOException;

public class ejercicios_11_13_14_15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        //ejercicio 11
        int numeromano, ii, uni, dec, cen, mil;
        String romano ="";
        do {
            System.out.println("ingresa número del 1 al 3999");
            numeromano = sc.nextInt();
        } while (numeromano < 1|| numeromano> 3999);
        
        uni = numeromano %10;
        dec = numeromano /10 %10;
        cen = numeromano /100 %10;
        mil = numeromano /1000;
        
        for (ii=1; ii <= mil; ii++){
            romano = romano + "M";
        }

        if (cen ==9){
            romano = romano + "CM";
        } else if (cen >=5) {
            romano = romano + "D";
            for ( ii=6; ii <= cen; ii++){
                romano=romano+"C";
            }
        } else if (cen ==4) {
            romano=romano+"CD";
        }else {
            for(ii=1;ii <= cen; ii++){
                romano=romano+"C";
            }
        }

        if (dec ==9){
            romano = romano + "XC";
        } else if (dec >=5) {
            romano = romano + "L";
            for ( ii=6; ii <= dec; ii++){
                romano=romano+"X";
            }
        } else if (dec ==4) {
            romano=romano+"XL";
        }else {
            for(ii=1;ii <= dec; ii++){
                romano=romano+"X";
            }
        }

        if (uni ==9){
            romano = romano + "IV";
        } else if (uni >=5) {
            romano = romano + "V";
            for ( ii=6; ii <= uni; ii++){
                romano=romano+"I";
            }
        } else if (uni ==4) {
            romano=romano+"IV";
        }else {
            for(ii=1;ii <= uni; ii++){
                romano=romano+"I";
            }
        }
        System.out.println("el número "+numeromano+" en romanos es; "+romano);

        // ejercicio 13
            int N =0;
            int aux =0 ;
            int cifra =0 ;
            int inverso =0;

        do {
            System.out.print("Introduce un número para determinar si es capicua: ");
            N = sc.nextInt();
        } while (N < 10);

        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }

        // ejercicio 15
        int base ;
        int expo ;
        System.out.println("ingresa la base del número a factorizar");
        base = sc.nextInt();
        System.out.println("ingresa el exponente");
        expo = sc.nextInt();
        int base2 = 1 ;

        while (expo > 0){
            base2 *= base ;
            expo -= 1;
        }
        System.out.println(base2);

        //ejercicio 14

        int alumnos ;
        double nota, suma =0, may, men ;

        do {
            System.out.println("ingresa la cantidad de alumnos: ");
            alumnos = sc.nextInt();
        } while (alumnos <=0);

        System.out.println("nota del alumno 1: ");
        nota = sc.nextDouble();
        suma=suma+nota;
        may=nota;
        men=nota;

        for (int i =2; i <= alumnos; i++){
            System.out.println("nota del alumno "+alumnos+": ");
            nota = sc.nextDouble();
            suma=suma+nota;
            if (nota > may) {
                may = nota;
            } else if (nota < men) {
                men = nota;
            }

        }
        System.out.println("promedio de las notas: "+(suma/alumnos));
        System.out.println("nota mayor: "+may);
        System.out.println("nota menor; "+men);


    }
}