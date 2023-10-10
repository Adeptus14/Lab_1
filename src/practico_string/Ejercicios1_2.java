package practico_string;
import javax.swing.*;
import java.util.Arrays;

public class Ejercicios1_2 {
    /**
     * @author  Enzo Rosso Hausberger
     */
    public static void main(String[] args) {
        /*1) A partir de una frase ingresada por pantalla analizar:
        Su longitud.
        El carácter asociado a un índice ingresado por pantalla.
        Buscar una subcadena ingresada por pantalla.
        El índice que ocupa el carácter 'x'.
        La String transformada en mayúsculas.*/

        String quote = JOptionPane.showInputDialog("Please, enter a frase: ");
        JOptionPane.showMessageDialog(null, "Size of quote: " + quote.length());
        int index = Integer.parseInt(JOptionPane.showInputDialog("Enter a index: "));
        JOptionPane.showMessageDialog(null, quote.charAt(index));
        String subQuote = JOptionPane.showInputDialog("Enter a subfrase: ");
        if(quote.contains(subQuote)){
            JOptionPane.showMessageDialog(null, "Exist");
        }else{
            JOptionPane.showMessageDialog(null, "Dosn't exist");
        }
        char character = (JOptionPane.showInputDialog("Please, enter a char: ")).charAt(0);
        int num = quote.indexOf(character);
        String position = (num != -1) ? String.valueOf(num) : "Nowhere";
        JOptionPane.showMessageDialog(null, "This letter show in: " + position);
        JOptionPane.showMessageDialog(null, "Upper case: " + quote.toUpperCase());


        //2) Dado una secuencia de no nulos, calcular el mayor de los negativos y el promedio de los positivos.
        int[] numbers = new  int[10];
        int j = 0;
        int media = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog( "Please enter the value "+ (i+1) +" of the array: "));
            if(numbers[i] > 0){
                j++;
                media += numbers[i];
            }
        }
        Arrays.sort(numbers);
        String condition = (numbers[0] > 0)? "No negative numbers were found":String.valueOf(numbers[0]);
        JOptionPane.showMessageDialog(null, "Negative: " + condition +"\nMedia: " + (media/j));
    }

}
