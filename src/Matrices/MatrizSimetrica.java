package Matrices;

public class MatrizSimetrica {
    public static void main(String[] args) {

        /***
         * VEAMOS UN EJEMPLO DE MATRIZ SIMÉTRICA
         * --> Cuando el anverso de la matriz es igual que el reverso
         * --> Matriz[i][j] = Matriz[j][i]
         * **/

        /** Partimos de una matriz de 4x4
         * --> Los índices de las columnas forman los índices de las filas */
        int[][] matriz = {
                {1,2,3,4}, //ESTA FILA ES IGUAL A LA 1º COLUMNA
                {2,1,0,5}, //ESTA FILA ES IGUAL A LA 2º COLUMNA
                {3,0,1,6}, //ESTA FILA ES IGUAL A LA 3º COLUMNA
                {4,5,6,7}
        };            //ESTA COLUMNA ES IGUAL A LA ÚLTIMA FILA
        // OTRA FORMA ES VER LAS DIAGONALES

        boolean simetrica = true;



        /** RECORREMOS LA MATRIZ PARA VER SI ES SIMÉTRICA CON UN WHILE **/
        int i = 0;
        while (i < matriz.length && simetrica){
            int j = 0; // IMPORTANTE INICIALIZAR AQUÍ
            while (j < i && simetrica){ // j < i = RECORRE LA MITAD DE LA MATRIZ, DE LO CONTRARIO ITERA EL DOBLE DE MÁS
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }
        if (simetrica){
            System.out.println("La matriz es simétrica");
        }else {
            System.out.println("La matriz no es simétrica");
        }

        /** LO COMPROBAMOS CON UN FOR (para salir usamos etiquetas) */
        etiqueta:
        for (int i2 = 0; i2 < matriz.length; i2++){
            for (int j2 = 0; j2 < i2; j2++){
                if (matriz[i2][j2] != matriz[j2][i2]){
                    simetrica = false;
                    break etiqueta;
                }
            }
        }
        if (simetrica){
            System.out.println("La matriz es simétrica 2");
        }else {
            System.out.println("La matriz no es simétrica 2");
        }
    }
}
