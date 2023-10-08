package bucles_anidados;

public class ejercicio4 {
    public static void main(String[] args) {
        for (char let = 'Z'; let >= 'A'; let--) {
            for (char let2 = let; let2 >= 'A'; let2--) {
                System.out.print(let2);
            }
            System.out.println();
        }
    }
}