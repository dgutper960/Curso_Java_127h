package Arrays;

import java.util.Arrays;

public class SortDeArray {
    public static void main(String[] args) {
        /**
         * LA CLASE ARRAYS DISPONE DE MUCHAS FUNCIONALIDADES
         * ENTRE ELLAS LA DE ORDENAR DE FORMA NATURAL
         * */

        /** Creamos un array de String con muchos productos */
        String[] frutas = {"Melocotones", "Manzanas", "Peras", "Zarzamora", "Uvas", "Aguacates", "Limones", "Bananas"};

        /** imprimimos */
        System.out.println("\nFrutas ordenadas por inserción:");
        for (String fruta:frutas) {
            System.out.println("fruta = " + fruta);
        }
        /** Vemos que se imprime en el orden de inserción,
         * pero como queremos las frutas en orden alfabético
         * tiramos del método .sort() de Arrays **/

        Arrays.sort(frutas);

        System.out.println("\nFrutas ordenadas alfabéticamente:");
        for (String fruta:frutas) {
            System.out.println("fruta = " + fruta);
        }

        /** El mismo ejemplo con arrays numérico o de cualquier tipo **/
        int[] numeros = {23, 57, 278, 1, 11, 109, 34, 98, 123, 15};

        System.out.println("\nNúmeros por inserción:");
        for (int n:numeros) {
            System.out.println(n);
        }

        Arrays.sort(numeros);


        System.out.println("\nNúmeros pasados por Arrays.sort():");
        for (int n:numeros) {
            System.out.println(n);
        }

    }
}
