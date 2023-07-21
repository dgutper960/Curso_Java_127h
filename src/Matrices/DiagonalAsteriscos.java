package Matrices;

public class DiagonalAsteriscos {
    public static void main(String[] args) {
        /**
         * LAS POSICIONES [i][j] QUE COINCIDEN EN UNA MATRIZ
         * CONFORMAN LA DIAGONAL DE LA MISMA
         * */

        /** Declaramos una matriz de 5x5 **/
        int[][] matriz1 = new int[5][5];

        /** Recorremos y cuando las posiciones de [i][j] sean iguales imprimimos un 1, si no será 0 **/
        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j<matriz1[i].length; j++){
               if (i == j){
                   matriz1[i][j] = 1;
               }
            }
        }

        for (int[] fila:matriz1) {
            for (int pos : fila){
                System.out.print(pos+"\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        /** NECESARIAMENTE, DEBE SER UN CUADRADO
         * Probamos con una matriz de diferentes dimensiones en filas y columnas
         * y no da resultado **/
        int[][] matriz2 = new int[5][8];
        for (int i = 0; i<matriz2.length; i++){
            for (int j = 0; j<matriz2[i].length; j++){
                if (i == j){
                    matriz2[i][j] = 1;
                }
            }
        }

        for (int[] fila:matriz2) {
            for (int pos : fila){
                System.out.print(pos+"\t");
            }
            System.out.println();
        }

    }
}
