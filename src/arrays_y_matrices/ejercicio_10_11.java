package arrays_y_matrices;
import java.util.Scanner;

public class ejercicio_10_11 {
    public static void main(String[] args) {
        //ejercicio 10
        Scanner sc = new Scanner(System.in);
        int filas , columnas ;
        do{
            System.out.println("ingresa cantidad de filas");
            filas = sc.nextInt();
        } while (filas < 1);
        do{
            System.out.println("ingresa cantidad e columnas");
            columnas = sc.nextInt();
        } while (columnas < 1);

        int [] [] A = new int [filas] [columnas];
        int [] [] B = new int [filas] [columnas];
        int [] [] C = new int [filas] [columnas];

        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("La suma de ambas matrices: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("Elemento ["+i+"]["+j+"] "+C[i][j]);
            }
        }

        //ejercicio 11 (re:vertir matriz)
        int [] [] D = new int [filas] [columnas];
        System.out.println("La matriz traspuuesta: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                D[i][j] = C[j][i];
                System.out.println(D[i][j]);
            }
        }

    }
}