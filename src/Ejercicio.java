import java.util.Scanner;
public class Ejercicio {
    public static boolean compararVectores(int [] a, int[] b){
        boolean respuesta = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                respuesta = false;

                break; //rompe el siclo
            }
        }
        return respuesta;
    }


    public static boolean compararVectores2(int [] a, int[] b){
        int diferencia =0;
        for (int i = 0; i < a.length; i++) {
            diferencia = diferencia +(Math.abs(a[i] - b[i]));
        }
        return diferencia == 0;
    }

    public static int compararVectoresRecurcividad(int [] a, int []b,int i){
        int diferencia;
        if (i == b.length - 1){
            diferencia = Math.abs(a[i] - b[i]);
        }else{
            diferencia = Math.abs(a[i] - b[i]) + compararVectoresRecurcividad(a,b,i +1);
        }
        return diferencia;
    }

    public static boolean compararVectoresRecurcividad(int [] a, int []b){
        int diferencia = compararVectoresRecurcividad( a,b,0);

        return diferencia == 0;
    }

    //SECUENCIA DE FIBONACCI

   public static int funcionFibonacci(int num){
       if(num == 0 || num==1)
           return num;
       else
           return funcionFibonacci(num-1) + funcionFibonacci(num-2);
   }


   /*METODO RECURSIVO PRA CALCULAR EL MAX VALOR DE UN VECTOR
   * vector={2, 9, 6, 7, 6, 3, 4, 3}
   *
   * */

    private static int maximoVector(int[] vector,int indice,int maximo){

        if (indice==vector.length-1){
            if (vector[indice] > maximo){
                maximo= vector[indice];
            }
        }else {
            if (vector[indice] > maximo){
                maximo= vector[indice];
            }
            maximo= maximoVector(vector,indice + 1,maximo);
        }
        return maximo;
    }
    /*METODO AUXILIAR*/
    public static int maximoVector(int[] vector){
        return maximoVector(vector,0,0);
    }



}
