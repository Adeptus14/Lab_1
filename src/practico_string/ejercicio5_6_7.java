package practico_string;

import javax.swing.*;

public class ejercicio5_6_7 {
    public static void main(String[] args) {

JOptionPane.showMessageDialog(null,"6 -Dado un texto terminado en un punto, contar la cantidad de vocales.");
        String text;
        boolean validPhrase = false;
        do {
            text = JOptionPane.showInputDialog("Ingrese la frase:");
            if (text.endsWith(".")) {
                validPhrase = true;
            } else {
                JOptionPane.showMessageDialog(null, "La frase debe terminar con un punto. Intentalo de nuevo.");
            }
        } while (!validPhrase);
        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                count++;
            }
        }
        JOptionPane.showMessageDialog(null, "LA CANTIDAD DE VOCALES EN EL TEXTO ES DE " + count);

JOptionPane.showMessageDialog(null,"7 -Dado un texto terminado en punto, contar la cantidad de palabras.");
        String text2;
        boolean validPhrase2 = false;
        do {
            text2 = JOptionPane.showInputDialog("Ingrese la frase:");
            if (text2.endsWith(".")) {
                validPhrase2 = true;
            } else {
                JOptionPane.showMessageDialog(null, "La frase debe terminar con un punto. Intentalo de nuevo.");
            }
        } while (!validPhrase2);
        String[] word = text2.split(" ");
        int count2 = word.length;
        JOptionPane.showMessageDialog(null, "LA CANTIDAD DE PALABRAS EN EL TEXTO ES DE " + count2);
    }
}
