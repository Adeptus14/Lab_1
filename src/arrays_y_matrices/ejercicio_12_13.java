package arrays_y_matrices;
import java.util.Scanner;
public class ejercicio_12_13 {
    public static void main(String[] args) {
        System.out.println(" ");

System.out.println("12. Generar un cuadrado mágico.");
        int[][] num = array();
        square(num);
        matrix(num);

        System.out.println(" ");

System.out.println("13. Crear un cuadrado latino.");
        int num2 = read();
        int[][] mat = squareLat(num2);
        matrix2(mat);
    }

    //ejercicio12
    public static int[][] array() {
        Scanner sc = new Scanner(System.in);
        int row;
        do {
            System.out.println("Ingrese las dimensiones de la matriz cuadrada");
            System.out.print("Debe ser un valor impar: ");
            row = sc.nextInt();
            if (row % 2 == 0 || row < 0){
                System.out.println(" ");
                System.out.println("A ingresado un valor invalido");
                System.out.println("Por favor");
            }
        } while (row % 2 == 0 || row < 0);
        int[][] r = new int[row][row];
        return r;
    }
    public static void square(int[][] num) {
        int n = num.length;
        int i = 0, j = n / 2, coun = 1;
        boolean mul = false;
        num[i][j] = coun;
        for (coun = 2; coun <= n * n; coun++) {
            if (!mul) {
                i--;
                if (i < 0){ i = n - 1;}
                j++;
                if (j >= n){ j = 0;}
            } else {
                i++;
                if (i >= n){ i = 0;}
            }
            num[i][j] = coun;
            if (coun % n == 0){
                mul = true;
            } else {
                mul = false;
            }
        }
    }
    public static void matrix(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.printf("%5d", num[i][j]);
            }
            System.out.println(" ");
        }
    }

    //ejercicio13
    public static int read() {
        Scanner sc = new Scanner(System.in);
        int row2;
        do {
            System.out.println("Ingrese las dimensiones de la matriz cuadrada");
            System.out.print("Debe ser un valor mayor a 2: ");
            row2 = sc.nextInt();
            if (row2 <= 2){
                System.out.println(" ");
                System.out.println("A ingresado un valor invalido");
                System.out.println("Por favor");
            }
        } while (row2 <= 2);
        return row2;
    }
    public static int [][] squareLat(int num2) {
        int [][] dim = new int[num2][num2];
        for (int j = 0; j < dim.length; j++) {
            dim[0][j] = j + 1;
        }
        for (int i = 1; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                dim[i][j] = dim[i - 1][j];
            }
            moveRight(dim[i]);
        }
        return dim;
    }
    public static void moveRight(int[] dim) {
        int aux = dim[dim.length - 1];
        for (int i = dim.length - 1; i > 0; i--) {
            dim[i] = dim[i - 1];
        }
        dim[0] = aux;
    }
    public static void matrix2(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%5d", mat[i][j]);
            }
            System.out.println();
        }
    }
}
