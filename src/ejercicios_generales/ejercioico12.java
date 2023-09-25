package ejercicios_generales;

import java.io.IOException ;
import java.util.Scanner ;
public class ejercioico12 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto ;
        int codigo ;
        char indi ;

        do {
            System.out.println("introduce ek texto");
            texto = sc.nextLine();
        } while (texto.isEmpty());
        do {
            System.out.println("introduce el código");
            codigo = sc.nextInt();
        } while (codigo < 1);

        do {
            System.out.println("introduce c para difrar o d para descifrar");
            indi = (char)System.in.read();
        } while (Character.toUpperCase(indi) != 'C' && Character.toUpperCase(indi) != 'D');
        if (Character.toUpperCase(indi) == 1){
            System.out.println("Texto cifrado: " + cifradoCesar(texto, codigo));
        }else {
            System.out.println("Texto descifrado: " + descifradoCesar(texto, codigo));
        }
    }

    public static String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }

    public static String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }
}