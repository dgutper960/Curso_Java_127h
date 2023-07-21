package Matrices;

import java.util.Random;

public class OperacionesAritmeticas {
    public static void main(String[] args) {

        /**
         * VAMOS A SUMAR DOS MATRICES Y EL RESULTADO VAMOS A ALMACENARLO EN  UNA TERCERA MATRIZ
         * **/

        /** Inicializamos dos matrices y creamos otra (las 3 del mismo tamaño) **/
        int[][] a = new int[4][4], b = new int[4][4], c = new int[4][4];
        Random numer = new Random();
        // llenamos a y b con números aleatorios y sumamos los valores para inicializar b
        for (int i =0; i< a.length; i++){
            for (int j = 0; j< a[i].length; j++){
                a[i][j] = 10 + numer.nextInt(100-10);
                b[i][j] = 10 + numer.nextInt(100-10);
                c[i][j] = (a[i][j])+(b[i][j]);
                if (c[i][j] < 100){
                    c[i][j] += 100;
                }
            }
        }
        System.out.println("\nMatriz A");
        for (int[] fila:a) {
            for (int num:fila){
                System.out.print(num+"\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B");
        for (int[] fila:b) {
            for (int num:fila){
                System.out.print(num+"\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz C");
        for (int[] fila:c) {
            for (int num:fila){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }
}
