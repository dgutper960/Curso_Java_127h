package Matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        /**
         * Hablamos de matrices cuando tenemos un array de más de una dimensión
         * es decir, cada elemento de la fila del array es otro array
         *
         * ej .-  int[][] matriz = new int[3][5];
         * --> El 1.er corchete representa el número de filas
         * --> El 2º corchete representa el número de columnas
         *
         * Los podemos inicializar con llaves
         * ej .- int[][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
         * --> El 1.er elemento representa el número en la fila
         * --> El 2º elemento representa el número en la columna columnas
         *
         * El número de elementos en la fila puede ser diferente en cada elemento de la columna
         * --> Para ver el nº de elementos de la fila
         * ej .- matriz.length;
         * --> Para ver el nº de elementos de la columna con índice 0
         * ej .- matriz[0].length;
         *
         * **/

        /** Inicializamos todas las columnas de la fila 0 **/
        int[][] matriz = new int[3][5];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5;

        /** Si queremos ver el número de filas **/
        int filas = matriz.length;
        System.out.println("filas = " + filas);

        /** Si queremos ver el número de columnas **/
        int columnas = matriz[0].length;
        System.out.println("columnas = " + columnas);

        /** Inicializamos todas las filas de la columna 0 **/
        matriz[0][0] = 1;  // fila cero del 1 al 5
        matriz[1][0] = 6;  // fila uno del 6 al 10
        matriz[2][0] = 11; // fila dos del 11 al 15
        //SIGUIENDO ESTA LÓGICA, EL ÚLTIMO ELEMENTO DE LA MATRIZ TENDRÍA VALOR 15

        /** Inicializamos la misma matriz con llaves **/
        int[][] matriz2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        /** cambiamos el elemento con valor 7 y lo actualizamos a 77 */
        matriz2[1][1] = 77;
        /** cambiamos el elemento con valor 13 y lo actualizamos a 33 */
        matriz2[2][2] = 33;

        /** vemos el último elemento de la columna 0 */
        int ultimoDeColum0 = matriz2[0][matriz2.length-1];
        System.out.println("ultimoDeColumna0 = " + ultimoDeColum0);

        /** vemos el último elemento de la fila 0 */
        int ultimoDeFila0 = matriz2[0][matriz2[0].length-1];
        System.out.println("ultimoDeFila0 = " + ultimoDeFila0);

        /** Vemos al último elemento de la matriz */
        int ultimo = matriz2[matriz2.length-1][matriz2[1].length-1];
        System.out.println("ultimo = " + ultimo);

        /**
         * PARA RECORRER UNA MATRIZ ES NECESARIO UN FOR ANIDADO
         * i --> Recorre las filas
         * j --> Recorre las columnas
         * **/

        /** Lo vemos con un for y con un foreach **/

        System.out.println("===================================================");

        for (int i =0; i< matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                System.out.println("matriz2 = " + matriz2[i][j]);
            }
        }

        System.out.println("===================================================");

        for (int[] fila:matriz2) {
            for (int columna:fila) {
                System.out.println("número = " + columna);
            }
        }

        System.out.println("===================================================");

        /** Lo vemos con un for y con un foreach **/
        String[][] nombres = {{"María", "José", "Maribel"},{"David", "Dani", "Paco"},{"Eva", "Camacho", "Celia"}};
        for (int i = 0; i< nombres.length; i++){
            for (int j = 0; j<nombres[i].length; j++){
                System.out.println(nombres[i][j]);
            }
        }

        System.out.println("===================================================");

        for (String[] fila:nombres) {
            for (String columna:fila){
                System.out.println("nombre = "+columna );
            }
        }


    }
}
