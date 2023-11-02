package colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio3 {
    /**
     * Author Enzo Rosso Hausberger
    * */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //3
        fill(numbers);
        aPrinter(numbers);
        //a)
        System.out.println("\nMEDIA: " + media(numbers));
        //b)
        System.out.println("Numbers equals to average: " + equalToMedia(numbers));
        //c)
        System.out.println("Numbers larger than average: " + biggerThanMedia(numbers));
        //d)
        System.out.println("Numbers shorter than average: " + littleThanMedia(numbers));

    }

    public static void fill(ArrayList<Integer> al) {
        int i = 0;
        while(i < 20) {
            int num = (int) (Math.random() * 100) + 1;
            if (num % 2 == 0) {
                i++;
                al.add(num);
            }
        }
    }

    public static int media(ArrayList<Integer> al) {
        int add = 0;
        for (Integer num : al) {
            add += num;
        }
        return add/al.size();
    }

    public static int equalToMedia(ArrayList<Integer> al){
        return Collections.frequency(al, media(al));
    }

    public static int biggerThanMedia(ArrayList<Integer> al){
        int i = media(al);
        int j = 0;
        for (Integer num : al) {
            if (num >  i){
                j++;
            }
        }
        return j;
    }

    public static  int littleThanMedia(ArrayList<Integer> al){
        int i = media(al);
        int j = 0;
        for (Integer num : al) {
            if (num <  i){
               j++;
            }
        }
        return j;
    }

    public static void aPrinter(ArrayList<Integer> al){
        Collections.sort(al);
        System.out.print("List:\t");
        for (Integer n : al) {
            System.out.print(n + " ");
        }
    }
}
