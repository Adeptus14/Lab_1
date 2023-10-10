/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringejercicios11y12;

import javax.swing.JOptionPane;

/**
 *
 * @author lauta
 */
public class StringEjercicios11y12 {

    public static void main(String[] args) {
        String cad;
        String fraseMay = "";
        String palabraMay = "";
        String aux;
        cad = JOptionPane.showInputDialog("Ingrese una cadena");
        cad = cad.replace(',','.');
        cad = cad.replace(';','.');
        cad = cad.replace('?','.');
        cad = cad.replace('!','.');
        int aux2;
        if (cad.lastIndexOf('.') == cad.length()); {

        while (cad.indexOf('.') + 1 != 0) {
            aux2 = cad.indexOf('.');
            aux = cad.substring(1, aux2);
            if (aux.length() > fraseMay.length()) {
                fraseMay = aux;
            }
            cad = cad.substring(aux2 + 1, cad.length());
        }
        
        System.out.println("La frase mayor es:'" + fraseMay + "'");
        if (fraseMay.contains(" ")) {
            while (fraseMay.indexOf(' ') + 1 != 0) {
                aux2 = fraseMay.indexOf(' ');
                aux = fraseMay.substring(0, aux2);
            if (aux.length() > palabraMay.length()) {
                palabraMay = aux;
            }
            fraseMay = fraseMay.substring(aux2 + 1, fraseMay.length());
            }
            System.out.println("La palabra mayor es '" + palabraMay + "'");
        } else {
            System.out.println("La palabra mayor es '" + fraseMay + "'");
        } 
        
        
    }
    }
}
