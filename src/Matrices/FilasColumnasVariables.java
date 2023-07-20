package Matrices;

public class FilasColumnasVariables {
    public static void main(String[] args) {
        /**
         * VAMOS A DEFINIR MATRICES CON DIFERENTE NÚMERO DE COLUMNAS POR FILA
         * **/

        /** definimos solo el número de filas **/
        int[][] matriz1 = new int[3][];
        /** a cada fila le damos un núm diferente de columnas */
        matriz1[0] = new int[2];
        matriz1[1] = new int[3];
        matriz1[2] = new int[4];
        // ESTO TIENE FORMA DE ESCALERA HACIA LA IZQUIERDA
        System.out.println("matriz1 = " + matriz1.length);
        System.out.println("fila[0] = " + matriz1[0].length);
        System.out.println("fila[1] = " + matriz1[1].length);
        System.out.println("fila[2] = " + matriz1[2].length);

        System.out.println();

        for (int[] fila:matriz1) {
            for (int columna:fila) {
                System.out.print(columna+"\t");
            }
            System.out.println();
        }

    }
}
