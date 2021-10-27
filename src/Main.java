import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*int[] a = {2, 9, 4};
        int[] b = {2, 9, 4};
        boolean diferencia = Ejercicio.compararVectoresRecurcividad(a,b);

        System.out.println(diferencia);*/


        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la series: ");
        int limite = teclado.nextInt();
        teclado.close();

        for(int i = 0; i<limite; i++){
            System.out.print(Ejercicio.funcionFibonacci(i) + ", ");
        }
        System.out.println(" ");*/

        //maximo de un vector
        int[] vector = {2, 9, 6, 7, 6, 3, 4, 3};
        System.out.println(Ejercicio.maximoVector(vector));


    }
}
