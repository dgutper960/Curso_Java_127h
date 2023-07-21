package Matrices;

public class InvertirMatriz {
    public static void main(String[] args) {
        /**
         * PARA ESE EJEMPLO VAMOS A CREAR UNA MATRIZ DE 4X4
         * Y LA VAMOS A INVERTIR
         * **/

        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        /** Solo para comprobar vamos a imprimir la matriz tabulando los índices */
        for (int[] fila : matriz){
            for (int numero : fila){
                System.out.print(numero+"\t");
            }
            System.out.println();
        }

        /** Para invertirla ya necesitamos un for normal para controlar mejor los índices y los ciclos
         * como con el array necesitamos respaldar valores en una variable auxiliar */
        int aux;
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j < i; j++){ //recorremos solo la mitad de la matriz
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("\n==============================\n");

        /** VOLVEMOS A IMPRIMIR PARA VER LOS VALORES
         * lo hacemos con for normal para tener las dos versiones **/
        for (int i =0; i< matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\n==============================\n");

        /** Se han cambiado las filas por las columnas
         * Esto es posible porque el número de columnas y filas es el mismo
         * Cuando tenemos distinto número de filas y columnas necesitamos otra matriz **/

        /** tenemos la matriz a que es de 8x4 */
        int[][] a = new int[8][4];
        // La llenamos con números aleatorios y vemos los valores. Llenarlo con foreach no dio resultado
        for (int i = 0; i< a.length; i++) {
            for (int j = 0; j<a[i].length; j++){
                a[i][j] = 1+ (int) (Math.random()*9);
            }
            System.out.println();
        }

        for (int[] fila : a){
            for (int numero : fila){
                System.out.print(numero+"\t");
            }
            System.out.println();
        }

        System.out.println("\n==============================\n");

        /** Para transponerla necesitamos una matriz b de 4x8 **/
        int[][] b = new int[4][8];

        for (int i = 0; i <a.length; i++){ // IMPORTANTE RECORRER LA MATRIZ A
            for (int j = 0; j < a[i].length; j++){
                b[j][i] = a[i][j]; // IMPORTANTE ESTE ORDEN --> b[j][i] = a[i][j]
            }
        }

        for (int[] fila : b){
            for (int numero : fila){
                System.out.print(numero+"\t");
            }
            System.out.println();
        }



    }
}
