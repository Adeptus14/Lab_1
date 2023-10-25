package busqueda_y_ordenamiento;
import java.util.Scanner;

public class busqueda_binaria {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese tamaño del arreglo: ");
            int tam = sc.nextInt();

            int[] arreglo = new int[tam];
            for (int i=0; i < arreglo.length; i++){
                System.out.println("Ingrese un numero para la posicion "+i+" del arreglo");
                arreglo[i]=sc.nextInt();
            }
            System.out.println("Contenido del arreglo");
            for (int y=0; y<arreglo.length;y++){
                System.out.println("arreglo["+y+"]="+arreglo[y]);
            }
            System.out.print("Ingrese el numero a buscar: ");
            int bus = sc.nextInt();

            int inf=0;
            int cen;
            int sup = tam -1;

            while (inf <= sup){
                cen =(sup+inf)/2;
                if (arreglo[cen]==bus){
                    System.out.println("El numero buscado esta en la posicion "+cen);
                    break;
                }else if (bus < arreglo[cen]){
                    sup = cen -1;
                }
            }
        }

}
