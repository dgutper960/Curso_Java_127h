package API_Collection.Set;

import java.util.*;

public class EjemploTreeSet {
    public static void main(String[] args) {
        /**
         * LOS TREE SET SON COSTOSOS PORQUE ORDENAN EN TODAS LAS OPERACIONES
         * --> Elementos ordenados de forma natural en cada operación
         * --> Los elementos deben implementar Comparable
         * --> No se admiten duplicados
         * **/

        /** Los treeSet van a mantener el ORDEN NATURAL y no el de inserción */
        Set<String> cosas = new TreeSet<>();
        cosas.add("mesa");
        cosas.add("lavadora");
        cosas.add("nevera");
        cosas.add("zapato");
        cosas.add("arpa");
        cosas.add("silla");
        System.out.println("ver orden de cosas = " + cosas);

        /** Veamos un ejemplo con números aleatorios */
        Set<Byte> numOrdenados = new TreeSet<>();
        System.out.println("Array de números aleatorios");
        byte[] numbers = new byte[25];
        for (byte num: numbers){
            num = (byte)(Math.random()*100);
            System.out.print(num+" ");
            numOrdenados.add(num);
        }
        System.out.println("\nnumbers.length = " + numbers.length);
        System.out.println("\nLista TreeSet de números ordenados");
        System.out.println(numOrdenados);
        System.out.println("numOrdenados.size() = " + numOrdenados.size());

        /** Podemos invertir el orden **/
        Set<Byte> numRevertidos = new TreeSet<>(Comparator.reverseOrder());
        numRevertidos.addAll(numOrdenados);
        System.out.println("numRevertidos = " + numRevertidos);

        /** Con el método compareTo() podremos implementar el orden deseado **/

    }
}
