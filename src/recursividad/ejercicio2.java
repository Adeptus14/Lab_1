package recursividad;
/**
 * Author Enzo Rosso Hausberger
 * */
public class ejercicio2 {
    public static void main(String[] args) {
        //2)
        System.out.println("Decimal a Binario\n10");
        decBin(10);
        System.out.println("\n100");
        decBin(100);
        System.out.println("\n345");
        decBin(345);
    }

    public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
        }
    }
}
