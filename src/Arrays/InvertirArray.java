package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class InvertirArray {
    public static void main(String[] args) {
        /**
         * HEMOS VISTO QUE CON SORT PODEMOS ORDENAR DE FORMA NATURAL
         * ¿QUE PASA SI QUEREMOS INVERTIR EL ORDEN DEL ARRAY?
         * **/

        /** Usamos un array de clases anteriores */
        int[] numeros = {23, 57, 278, 1, 11, 109, 34, 98, 123, 15};
        System.out.println("\nNúmeros por inserción:");
        for (int n:numeros) {
            System.out.println(n);
        }

        /** LE VAMOS A DAR LA VUELTA */
        int max = numeros.length; // entre 2 para evitar el puto de encuentro entre 'i' y su inverso
        for (int i = 0; i < max/2; i++){ // entre 2 debe ser en el for (fuera no sirve  )
            //creamos una variable para el actual y otra para su respectivo inverso
            int actual = numeros[i];
            int inverso = numeros[max -1 -i];
            // vamos inicializando los valores con su respectivo inverso
            numeros[i] = inverso;
            numeros[max-1-i] = actual;
        }

        System.out.println("\nNúmeros invertidos:");
        for (int n:numeros) {
            System.out.println(n);
        }

        /**
         * TAMBIÉN PODEMOS USAR EL MÉTODO Collections.reverse()
         * TOMA COMO ARGUMENTO UN ARRAY LIST POR LO QUE DEBEMOS CONVERTIRLO CON Arrays.asList()
         * */

        /** Creamos array de frutas */
        String[] frutas = {"Melocotones", "Manzanas", "Peras", "Zarzamora", "Uvas", "Aguacates", "Limones", "Bananas"};
        // lo ordenamos con sort para que se vea más claro
        Arrays.sort(frutas);

        System.out.println("\nFrutas ordenadas alfabéticamente:");
        for (String fruta:frutas) {
            System.out.println("fruta = " + fruta);
        }

        /** Invertimos usando los métodos mencionados **/
        Collections.reverse(Arrays.asList(frutas));

        System.out.println("\nFrutas invertidas alfabéticamente:");
        for (String fruta:frutas) {
            System.out.println("fruta = " + fruta);
        }

    }
}
