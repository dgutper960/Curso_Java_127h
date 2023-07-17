package Arrays;

public class AgregarDesplazarArray {
    public static void main(String[] args) {
        /**
         * dado un array de números vamos a meter otro número en la primera posición
         * y desplazar el resto a la siguiente posición
         * **/

        int[] arrayOriginal = {1, 2, 3, 4, 5, 6, 7};
        int nuevoNumero = 58;

        // CREAMOS UN ARRAY CON UNA POSICIÓN MÁS
        int[] nuevoArray = new int[8];

        for (int i = 0; i < arrayOriginal.length; i++) {
            nuevoArray[i + 1] = arrayOriginal[i];
        }
        nuevoArray[0] = nuevoNumero;

        for (int n : nuevoArray) {
            System.out.println("n = " + n);
        }

        System.out.println("\n==========================\n");

        /**
         * AHORA VAMOS A DESPLAZAR TODOS LOS VALORES
         * CON UN ARRAY DEL MISMO TAMAÑO
         * */
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // resultado buscado [10,1,2,3,4,5,6,7,8,9]

        //respaldo del número
        int recambio = original[original.length - 1];

        int[] nuevo = new int[10];
        for (int i = 0; i < nuevo.length - 1; i++) {
            nuevo[i + 1] = original[i];
        }
        nuevo[0] = recambio;

        for (int n : nuevo) {
            System.out.println("n = " + n);
        }

        System.out.println("\n==========================\n");

        /** OTRA FORMA DE HACERLO SIN CREAR UN SEGUNDO ARRAY
         * ES CREAR EL RESPALDO E ITERAR HACIA ATRÁS **/
        int[] a = {1,2,3,4,5,6,7,8,9,10};

        int ultimo = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--){
            a[i+1] = a[i];
        }
        a[0] = ultimo;

        for (int n:a){
            System.out.println("n = " + n);
        }


    }
}
