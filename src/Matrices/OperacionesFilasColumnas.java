package Matrices;

import java.util.Random;

public class OperacionesFilasColumnas {
    public static void main(String[] args) {
        /**
         * PARA ESTE EJEMPLO VAMOS A ACUMULAR LOS VALORES DE LAS FILAS Y LAS COLUMNAS
         * */

        /** TIRAMOS DEL EJEMPLO ANTERIOR */
        int[][] a = new int[4][4], b = new int[4][4], c = new int[4][4];
        Random numer = new Random();
        int sumaFila;
        int sumaColumna;
        for (int i =0; i< a.length; i++){
            sumaFila = 0; // NECESITAMOS REINICIAR VALORES EN CADA VUELTA
            sumaColumna = 0;
            for (int j = 0; j< a[i].length; j++){
                a[i][j] = 10 + numer.nextInt(100-10);
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
                b[i][j] = sumaFila;
                c[i][j] = sumaColumna;
            }
            System.out.println("La suma de la fila "+i+" es "+sumaFila);
            System.out.println("La suma de la columna "+i+" es "+sumaColumna);
        }


    }
}
