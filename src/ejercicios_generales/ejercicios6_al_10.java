package ejercicios_generales;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

/**
 * @author Enzo Rosso Hausberger
 */
public class ejercicios6_al_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //6) Comprobar si un número es perfecto.
        int answer = 0;

        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        for (int i = 1; i < number ; i++) {
            answer += number % i == 0 ? i: 0;
        }
        String a = (answer == number)? "It's a perfect number." : "It isn't a perfect number.";
        System.out.println(a);

        //7) Comprobar si dos números son amigos.
        answer = 0;
        int addA, addB;

        System.out.println("Enter a number:");
        number = sc.nextInt();
        System.out.println("Enter another number:");
        int number2 = sc.nextInt();

        for (int i = 1; i < number ; i++) {
            answer += number % i == 0 ? i: 0;
        }
        addA = answer;

        answer = 0;
        for (int i = 1; i < number2 ; i++) {
            answer += number2 % i == 0 ? i: 0;
        }
        addB = answer;
        System.out.println("First number: " + number + " the sum of the proper divisors of " + number2 + ": " + addB
                + "\nSecond number: " + number2 + " the sum of the proper divisors of " + number + ": " + addA);

        a = ((addA == number2) && (addB == number)) ? "Are friends" : "Aren't Friends";
        System.out.println(a);

        //8) Mostrar los N primeros términos de la serie de Fibonacci
        System.out.println("Enter how many Fibonacci numbers you want to see: ");
        number = sc.nextInt();

        long[] fibonacci = new long[number];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Fibonacci first " + fibonacci.length + " numbers:\n" + Arrays.toString(fibonacci));

        //9)  Pasar de decimal a binario
        System.out.println("Enter the number you want to convert to binary: ");
        number = sc.nextInt();
        StringBuilder binary = new StringBuilder();

        while (number != 0) {
            binary.insert(0, (number % 2));
            number /= 2;
        }

        System.out.println("Binary number: " + binary);

        //10) Pasar de binario a decimal
        System.out.println("Enter a binary number you want to convert to decimal: ");
        String byNumber = sc.next();

        int decNumber = 0;
        for (int i = 0; i < byNumber.length(); i++){
            int num = Integer.parseInt(byNumber.substring(i, i+1));
            decNumber += (int) (num * pow(2, byNumber.length() - 1 - i));
        }

        System.out.println("Decimal number: " + decNumber);

        sc.close();
    }

}
