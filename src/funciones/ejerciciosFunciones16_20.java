package funciones;

import java.util.Scanner;

public class ejerciciosFunciones16_20 {
    public static void main(String[] args) {
        //ejercicio funciones 1
        Scanner sc = new Scanner(System.in);
        int base = 0, expo = 0;
        int factorizado;

        factorizado = FactorizarFun(base, expo);
        System.out.println(factorizado);

        //ejercicio funciones 2
        int alumnos = 0;

        PromedioNotas(alumnos);
    }

    public static int FactorizarFun(int bas, int exp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la base del número a factorizar");
        bas = sc.nextInt();
        System.out.println("ingresa el exponente");
        exp = sc.nextInt();
        int base2 = 1;

        while (exp > 0) {
            base2 *= bas;
            exp -= 1;
        }
        return base2;
    }

    public static int PromedioNotas(int alumnnos) {
        Scanner sc = new Scanner(System.in);
        double nota, suma = 0, may, men;
        do {
            System.out.println("ingresa la cantidad de alumnos: ");
            alumnnos = sc.nextInt();
        } while (alumnnos <= 0);

        System.out.println("nota del alumno 1: ");
        nota = sc.nextDouble();
        suma = suma + nota;
        may = nota;
        men = nota;

        for (int i = 2; i <= alumnnos; i++) {
            System.out.println("nota del alumno " + alumnnos + ": ");
            nota = sc.nextDouble();
            suma = suma + nota;
            if (nota > may) {
                may = nota;
            } else if (nota < men) {
                men = nota;
            }

        }
        System.out.println("promedio de las notas: " + (suma / alumnnos));
        System.out.println("nota mayor: " + may);
        System.out.println("nota menor; " + men);
        return alumnnos;
    }
}
