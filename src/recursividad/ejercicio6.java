package recursividad;
import java.util.*;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("suma: " + suma(n1, n2));

    }
    public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);
        }
    }
}
