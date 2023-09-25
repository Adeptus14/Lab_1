package funciones;

import java.util.Scanner;
/**
 * @author Enzo Rosso Hausberger
 */
public class EjerciciosFunciones6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //6) Comprobar si un número es perfecto con funciones.
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        System.out.println(itsPerfect(number));

        //7) Comprobar si dos números son amigos.

        System.out.println("Enter a number:");
        number = sc.nextInt();
        System.out.println("Enter another number:");
        int number2 = sc.nextInt();
        System.out.println(areFriends(number, number2));

        sc.close();
    }

    public static String itsPerfect(int eNum){
        int answer = 0;
        for(int i = 1; i < eNum ; i++) {
            answer += eNum % i == 0 ? i : 0;
        }
        return (answer == eNum)? "It's a perfect number." : "It isn't a perfect number.";
    }

    public static String areFriends(int eNum1, int eNum2){
        int answer = 0;
        int addA, addB;
        for (int i = 1; i < eNum1 ; i++) {
            answer += eNum1 % i == 0 ? i: 0;
        }
        addA = answer;

        answer = 0;
        for (int i = 1; i < eNum2 ; i++) {
            answer += eNum2 % i == 0 ? i: 0;
        }
        addB = answer;
        System.out.println("First number: " + eNum1 + " the sum of the proper divisors of " + eNum2 + ": " + addB
                + "\nSecond number: " + eNum2 + " the sum of the proper divisors of " + eNum1 + ": " + addA);

        return ((addA == eNum2) && (addB == eNum1)) ? "Are friends" : "Aren't Friends";
    }
}

