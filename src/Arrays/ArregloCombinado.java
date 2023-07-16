package Arrays;

public class ArregloCombinado {
    public static void main(String[] args) {
        /**
         * VAMOS A RELLENAR UN ARRAY COMBINANDO LOS DATOS DE OTROS DOS
         * */

        /** Declaramos 3 arrays de enteros */
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        /** rellenemos a con secuencia y b con múltiplos de 5
         * aprovechamos para rellenar c (2 índices por iteración)*/
        int aux = 0;
        for (int i = 0; i < 10; i++){
            a[i] = i+1;
            b[i] = (i+1)*5;
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        for (int n:c) {
            System.out.println("n = " + n);
        }

        /**
         * LO COMPLICAMOS UN POCO Y METEMOS TRES ELEMENTOS POR ITERACIÓN
         * A TENER EN CUENTA QUE
         * LOS ARRAY TIENEN QUE TENER TAMAÑOS QUE SEAN MÚLTIPLOS DEL NUMERO DE VECES (en este caso 3)
         * **/
        int[] x, y, z;
        x = new int[9];
        y = new int[9];
        z = new int[18];
        /** necesitamos tres for anidados (sea cual sea el número de elementos a insertar por vuelta)**/
        aux = 0;
        for (int i =0; i<x.length; i+=3 ) { // i debe iterar al mismo num de elementos que metemos cada vez
            for (int j = 0; j < 3; j++) {
                z[aux++] = x[i + j];
            }
            for (int j = 0; j < 3; j++) {
                z[aux++] = y[i + j];
            }
            System.out.println("z = " + z[i]);
        }


    }
}
