package practico_string;
import java.util.Scanner;


public class ejercicio8_9_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio 8
        String frase;
        System.out.println("ingrese una frase(terminar con punto): ");
        frase = sc.nextLine();
        int count=0;

        for(int x=0;x<frase.length();x++) {
            if (((frase.charAt(x)=='a')||(frase.charAt(x)=='e')||(frase.charAt(x)=='i')||(frase.charAt(x)=='o')||(frase.charAt(x)=='u'))&&((frase.charAt(x+1)==' ')||(frase.charAt(x+1)=='.'))){
                count += 1;
            }
        }
        System.out.println(count+" palabras terminan en vocal");

        //ejercicio 9
        String frase2;
        System.out.println("ingrese una frase(terminar con punto): ");
        frase2= sc.nextLine();
        String palabra = "";
        String palabralarge = "";
        for(int y=0;y<frase2.length();y++) {
            palabra+=frase2.charAt(y);
            if (frase2.charAt(y)==' '||frase2.charAt(y)=='.'){
                if (palabra.length() > palabralarge.length()){
                    palabralarge = palabra;
                }
                palabra="";
            }

        }
        System.out.println(palabralarge);

        //ejercicio 10
        String frase3;
        String palabra3="";
        int conosonante=0;
        count=0;
        String palabra3cnconso="";
        System.out.println("ingrresa una última frase: ");
        frase3 = sc.nextLine();
        for (int z=0; z < frase3.length(); z++){
            if (frase3.charAt(z)==' '){
                for (int zz=0;zz < palabra3.length();zz++){
                    count+=1;
                    if ((palabra3.charAt(zz)=='a')||(palabra3.charAt(zz)=='e')||(palabra3.charAt(zz)=='i')||(palabra3.charAt(zz)=='o')||(palabra3.charAt(zz)=='u')){
                        if (count > conosonante){
                            conosonante = count;
                            count=0;
                            palabra3cnconso = palabra3;
                        }
                    }
                }
                palabra3="";
            }else {
                palabra3+=frase3.charAt(z);
            }

        }
        System.out.println(palabra3cnconso);
    }
}