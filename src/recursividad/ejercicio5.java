package recursividad;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n, coun = 0;
        System.out.print("Ingrese un numero: ");
        n=sc.nextInt();
        add(n,coun);
    }

    public static int add(int n, int coun) {
        coun+=n;
        if (n==0){
            System.out.println("Total: "+coun);
        }else{
            add(n-1,coun);
        }
        return coun;
    }
}
