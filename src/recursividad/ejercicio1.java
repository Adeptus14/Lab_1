package recursividad;

/**
 * Author Enzo Rosso Hausberger
 */
public class ejercicio1 {
    public static void main(String[] args) {
        //1)
        System.out.println(cociente(10, 7));
        System.out.println(cociente(7, 3));
        System.out.println(cociente(4, 3));
    }

    public static int cociente(int num1, int num2) {
        if (num1 > num2) {
            return cociente(num1 - 1, num2) + 1;
        } else {
            return 0;
        }
    }
}
