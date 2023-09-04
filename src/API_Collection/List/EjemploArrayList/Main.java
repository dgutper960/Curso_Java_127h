package API_Collection.List.EjemploArrayList;

import API_Collection.Set.EjemploTreeSetComparable.Alumno;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /** Creamos una lista de ArrayList de alumnos
         * --> Añadimos alumnos al vuelo (nombre y nota )
         * --> Antes y después de añadir elemento
         *      - Preguntamos el tamaño
         *      - Imprimimos la lista
         *      - Preguntamos si está vacía */

        List<Alumno> al = new ArrayList<>();
        System.out.println("El tamaño de la lista es de "+al.size()+" elementos");
        System.out.println(al);
        System.out.println("La lista está vacía? "+al.isEmpty());
        al.add(new Alumno("Francisco", 5.34));
        al.add(new Alumno("Ramona", 8.7));
        al.add(new Alumno("Pepita", 3.99));
        al.add(new Alumno("Miriam", 6.76));
        al.add(new Alumno("Martín", 7.55));
        System.out.println("El tamaño de la lista es de "+al.size()+" elementos");
        System.out.println(al);
        System.out.println("La lista está vacía? "+al.isEmpty());

        /** Añadimos un elemento indicando en el argumento de add() su índice
         * --> Vemos que el resto de elementos se han desplazado **/
        al.add(2, new Alumno("Sintia", 6.98));
        System.out.println("El tamaño de la lista es de "+al.size()+" elementos");
        System.out.println(al);

        /** Si usamos el método set() lo que ocurrirá será que se modifica el elemento en esa posición */
        al.set(3, new Alumno("Pepita", 5.99)); // El Alumno se ha sobreescrito
        System.out.println("El tamaño de la lista es de "+al.size()+" elementos");
        System.out.println(al);

        /** Con el método remove() podemos eliminar un elemento
         * --> Los valores deben ser idénticos al que queremos eliminar, ya que se usa equals() por detrás
         * --> Podríamos modificar equals() de Alumno, para que compare por nombre o nota, o lo que se quiera **/
        al.remove(new Alumno("Sintia", 6.98));
        System.out.println("El tamaño de la lista es de "+al.size()+" elementos");
        System.out.println(al);

        /** Podemos usar el índice en el argumento de remove() para borrar un elemento */
        al.remove(1); // Borramos a Ramona
        System.out.println("El tamaño de la lista es de "+al.size()+" elementos");
        System.out.println(al);

        /** Con el método contains() podemos verificar si existe un objeto en la lista
         * --> También se usará el método equals()
         * --> Devuelve expresión booleana **/
        boolean contSintia = al.contains(new Alumno("Sintia", 6.98));
        System.out.println("¿Está Sintia? "+contSintia); // false
        boolean contMartin = al.contains(new Alumno("Martín", 7.55));
        System.out.println("¿Está Martín? "+contMartin); // true

        /** Iteramos la lista con la función propia de ArrayList **/
        al.forEach(System.out::println);

        System.out.println("\n==== ==== ==== ==== ====\n");
        /** Iteramos con for previa conversión a Array */
        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        } // Se puede simplificar con foreach

    }
}
