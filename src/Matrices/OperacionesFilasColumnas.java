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
        /** RELLENAMOS LA MATRIZ A CON NÚMERO RANDOM */
        for (int i =0; i< a.length; i++){
            for (int j = 0; j< a[i].length; j++) {
                a[i][j] = 1 + numer.nextInt(10);
            }
        }

        /** SUMAMOS LAS FILAS Y LAS COLUMNAS Y RELLENAMOS LAS MATRICES B Y C CON LOS RESULTADOS **/
        int sumaFila;
        int sumaColumna;
        for (int i =0; i< a.length; i++) {
            sumaFila = 0; // NECESITAMOS REINICIAR VALORES EN CADA VUELTA
            sumaColumna = 0;
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 1 + numer.nextInt(10);
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
                b[i][j] = sumaFila;
                c[i][j] = sumaColumna;
            }
            System.out.println("La suma de la fila " + i + " es " + sumaFila);
            System.out.println("La suma de la columna " + i + " es " + sumaColumna);


            System.out.println("\nIMPRIMIMOS A\n");
            for (int[] fila : a) {
                for (int num : fila) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }

            System.out.println("\nIMPRIMIMOS B\n");
            for (int[] fila : b) {
                for (int num : fila) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }

            System.out.println("\nIMPRIMIMOS C\n");
            for (int[] fila : c) {
                for (int num : fila) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
        }

    }
}
