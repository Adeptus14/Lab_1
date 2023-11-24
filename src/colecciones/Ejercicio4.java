package colecciones;
import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numList.add((int) (Math.random() * 100) +1);
            System.out.println("Position: "+ (i+1) +" nº:" + numList.get(i));
        }

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number you want to search."));
        int position = numFinder(number, numList);
        String condition = (position >= 0) ? "Found at the position: "+ position : "Not found";
        JOptionPane.showMessageDialog(null, condition);
    }

    public static Integer numFinder(int findNum, ArrayList<Integer> list){
        for (Integer num: list) {
            if (num == findNum){
                return list.indexOf(num);
            }
        }
        return -1;
    }
}
