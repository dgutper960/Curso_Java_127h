package Arrays;

import java.util.Random;

public class ArreglosParesImpares {
    public static void main(String[] args) {
        /**VAMOS A RELLENAR LOS ARRAYS PARES E IMPARES SEGÚN EL RESULTADO DE ARRAY*/
        int[] array, pares, impares;
        /** Rellenamos el array de forma aleatorio */
        array = new int[100];
        Random num = new Random();
        int maxArray = array.length;
        int maxPares = 0;
        int maxImpares = 0;
        for (int i = 0; i < maxArray; i++) {
            array[i] = 1+ num.nextInt(10);
            if(array[i] % 2 == 0){
                maxPares++;
            }
            if (array[i] % 2 != 0){
                maxImpares++;
            }
        }
        pares = new int[maxPares];
        impares = new  int[maxImpares];
        int aux1 = 0;
        int aux2 = 0;
        for (int i = 0; i<maxArray; i++){
            if(array[i] % 2 == 0){
                pares[aux1++] = array[i];
            }
            if (array[i] % 2 != 0){
                impares[aux2++] = array[i];
            }
        }

        for (int par:pares) {
            System.out.println("par = " + par);
        }

        for (int impar: impares) {
            System.out.println("impar = " + impar);
        }


    }
}
