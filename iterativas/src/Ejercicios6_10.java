import java.util.Scanner;
/**
 * @author Enzo Rosso Hausberger
 */
public class Ejercicios6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //6. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for
        System.out.print("6) 100 to 1\n");
        for(int i = 100; i >= 1; i--){
            System.out.print(i + " ");
        }

        //7. Programa Java que muestre los números desde 1 hasta N utilizando las instrucciones for, while y do .. while
        System.out.println("\n7) To what integer number would you like to count?");
        int number  = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println("For");

        int j = 1;
        while (j <= number){
            System.out.print(j + " ");
            j++;
        }
        System.out.println("While");

        j = 1;
        do {
            System.out.print(j + " ");
            j++;
        }while (j <= number);
        System.out.println("Do - While");

        /* 8. Programa Java que muestre los numeros desde N hasta 1 utilizando las instrucciones for, while y do .. while */
        System.out.println("\n8) From what number would you like to begin the countdown?");
        number  = sc.nextInt();

        for (int i = number;  i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("For");

        j = number;
        while (j >= 1){
            System.out.print(j + " ");
            j--;
        }
        System.out.println("While");

        j = number;
        do {
            System.out.print(j + " " );
            j--;
        }while (j >= 1);
        System.out.println("Do - While");

        //9. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
        System.out.println("\n9) Numbers from the smallest to the largest");
        int number1, number2;
        System.out.println("Please enter a number: ");
        number1 = sc.nextInt();
        System.out.println("Please enter another number: ");
        number2 = sc.nextInt();

        int maxim = Math.max(number1, number2);
        int minim = Math.min(number1, number2);

        for (int i = minim; i <= maxim ; i++) {
            System.out.print(i + " ");
        }

        //10. Programa Java que lea dos números y muestre los números pares entre ellos;
        System.out.println("\n10) Even numers");
        System.out.println("Please enter a number: ");
        number1 = sc.nextInt();
        System.out.println("Please enter another number: ");
        number2 = sc.nextInt();

        if ((number1 % 2 == 1) && (number2 % 2 == 1)){
            System.out.println("Both are odd numbers");
        } else if ((number1 % 2 == 0) && (number2 % 2 == 1)) {
            System.out.printf("%d is an even number and %d is an odd number%n", number1, number2);
        } else if ((number1 % 2 == 1) && (number2 % 2 == 0)) {
            System.out.printf("%d is an even number and %d is an odd number%n", number2, number1);
        } else if ((number1 % 2 == 0) && (number2 % 2 == 0)) {
            System.out.println("Both are even numbers");
        }

        sc.close();
    }
}
