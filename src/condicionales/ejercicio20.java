package condicionales;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your final score");
        int number = sc.nextInt();
        String condition;
        if (9 <= number && number <= 10) {
            condition = "Sobresaliente";
        } else if (7 <= number && number < 9) {
            condition = "Notable";
        } else if (6 <= number && number < 7) {
            condition = "Bien";
        } else if (5 <= number && number < 6) {
            condition = "Suficiente";
        } else if (0 <= number && number < 5) {
            condition = "Insuficiene";
        } else {
            condition = "Invalid score";
        }

        System.out.println("Condition: " + condition);
    }

}
