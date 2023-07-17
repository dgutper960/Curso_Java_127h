package Arrays;

public class EjemploArrayCopy {
    public static void main(String[] args) {

        /**
         * System.arrayCopy() MÉTODO ESTÁTICO DE USO DIRECTO
         * Tiene 5 parámetros de entrada
         * 1. Array entrada
         * 2. Posición de inicio array entrada
         * 3. Array salida
         * 4. Posición de inicio array salida
         * 5. número de índices a copiar
         *
         * VAMOS A REPLICAR ALGUNOS EJERCICIOS ANTERIORES
         * **/

        int[] array1 = {0,1,2,3,4,5,6,7,8,9,10};

        /** COPIAMOS UN ARRAY COMPLETO */
        int[] copy1 = new int[array1.length];
        System.arraycopy(array1, 0, copy1, 0, array1.length);

        for (int n:
             copy1) {
            System.out.println("n = " + n);
        }

        System.out.println("======================================================");

        /** COPIAMOS LA MITAD DEL ARRAY **/
        int[] copy2 = new int[array1.length];
        System.arraycopy(array1, 0, copy2, 0, array1.length/2);

        for (int n:
                copy2) {
            System.out.println("n = " + n);
        }

        System.out.println("======================================================");

        /** COPIAMOS DESDE LA MITAD DEL ARRAY **/
        int[] copy3 = new int[array1.length];
        System.arraycopy(array1, 6, copy3, 6, 5); //SE ESCRIBEN 5 ÍNDICES

        for (int n:
                copy3) {
            System.out.println("n = " + n);
        }

        System.out.println("======================================================");

        /** HACEMOS UNA COPIA CON UN ÍNDICE MENOS (eliminamos el 0 )*/
        int[] copy4 = new int[array1.length -1];
        System.arraycopy(array1, 1, copy4, 0, copy4.length);

        for (int n:
                copy4) {
            System.out.println("n = " + n);
        }

        System.out.println("======================================================");

        /** INVERTIMOS EL ARRAY DESDE UNA POSICIÓN DADA (índice 5) **/
        int[] array2 = new int[copy4.length];
        System.arraycopy(copy4, 5, array2, 0, array2.length/2);
        System.arraycopy(copy4, 0, array2, 5, array2.length/2);

        for (int n:
                array2) {
            System.out.println("n = " + n);
        }

    }
}
