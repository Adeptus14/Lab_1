package bucles_anidados;

/**
 * @author Enzo Rosso Hausberger
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        for (int i = 1; i < 1000 ; i++) {
            int answer = 0;
            for(int j = 1; j < i; j++) {
                if (i % j == 0){
                    answer += j;
                }
            }
            System.out.print((answer == i)? i + " " : "");
        }
    }

}
