package Arrays;

import java.util.Random;

public class AsignarValoresConFor {
    public static void main(String[] args) {
        /**
         * VAMOS A ASIGNAR VALORES A UN ARRAY USANDO EL FOR NORMAL
         * **/

        /** Declaramos un array con tamaño definido */
        int[] numeros = new int[1000];

        /** Le metemos al for algo para que rellene en cada iteración un índice
         * por ejemplo lo rellenamos con números aleatorios entre 1 y 100 (inclusive) */
        int max = numeros.length;
        Random num = new Random();
        for (int i = 0; i< max;i++ ){
            numeros[i] = 1+num.nextInt(100);
            System.out.println("Valor de numeros[i] = " + numeros[i]);
        }
    }
}
