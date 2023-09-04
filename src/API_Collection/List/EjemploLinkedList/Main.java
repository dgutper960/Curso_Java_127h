package API_Collection.List.EjemploLinkedList;

import API_Collection.Set.EjemploTreeSetComparable.Alumno;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /** CREAMOS UNA LISTA LinkedList */
        LinkedList<Alumno> lista = new LinkedList<>();

        // HACEMOS LAS MISMAS PREGUNTAS QUE EN LA CLASE EjemploArrayList
        System.out.println("El tamaño de la lista es de "+lista.size()+" elementos");
        System.out.println(lista);
        System.out.println("La lista está vacía? "+lista.isEmpty());

        lista.add(new Alumno("Francisco", 5.34));
        lista.add(new Alumno("Ramona", 8.7));
        lista.add(new Alumno("Pepita", 3.99));
        lista.add(new Alumno("Miriam", 6.76));
        lista.add(new Alumno("Martín", 7.55));

        System.out.println("El tamaño de la lista es de "+lista.size()+" elementos");
        System.out.println(lista);
        System.out.println("La lista está vacía? "+lista.isEmpty());

        /** Ahora tenemos los métodos propios de una LinkedList
         * --> Los elementos están enlazados en forma de cola **/
        System.out.println("\nMétodos addFirst y addLast ");
        lista.addFirst(new Alumno("Sephora", 7.78));
        lista.addLast(new Alumno("Amina", 9.3));
        System.out.println("El tamaño de la lista es de "+lista.size()+" elementos");
        System.out.println(lista);
        System.out.println("La lista está vacía? "+lista.isEmpty());

        /** Métodos get() de primero, último y por índice */
        System.out.println("\nMétodos get() de LinkedList ");
        System.out.println("Vemos el primero de la lista -> "+lista.getFirst());
        System.out.println("Vemos el último de la lista -> "+lista.getLast());
        System.out.println("Vemos el elemento según índice (2) -> "+lista.get(2));

        /** También podemos usar el método peekFirst y peekLast (no por índice)
         * --> Con la diferencia que si encuentra un null no devuelve excepción */
        System.out.println("\nMétodos peek() de LinkedList ");
        System.out.println("Vemos el primero de la lista -> "+lista.peekFirst());
        System.out.println("Vemos el último de la lista -> "+lista.peekLast());

        /** Para remove lo mismo que con get(), retorna exception si encuentra un null **/
        System.out.println("\nMétodos remove() de LinkedList ");
        System.out.println("Borramos el primero de la lista -> "+lista.removeFirst());
        System.out.println("Borramos el último de la lista -> "+lista.removeLast());
        System.out.println("Borramos el elemento por objeto -> "+lista.remove(new Alumno("Pepita", 3.99)));
        System.out.println("Borramos el elemento por índice -> "+lista.remove(2));
        System.out.println("El tamaño de la lista es de "+lista.size()+" elementos");
        System.out.println(lista);

        /** Para evitar la excepción al eliminar usamos poll(), solo para primer y último elemento */
        System.out.println("\nMétodos remove() de LinkedList ");
        System.out.println("Borramos el primero de la lista -> "+lista.pollFirst());
        System.out.println("Borramos el último de la lista -> "+lista.pollLast());
        System.out.println("El tamaño de la lista es de "+lista.size()+" elementos");
        System.out.println(lista);

        /** El método pop() es equivalente a removeFirst(), devuelve exception */
        System.out.println("Borramos el primero de la lista -> "+lista.pop());
        System.out.println("El tamaño de la lista es de "+lista.size()+" elementos");
        System.out.println(lista);

        /** Añadimos algunos elementos */
        Alumno julian = new Alumno("Julián", 5.88);
        Alumno pepa = new Alumno("Pepa", 8.2);
        Alumno manu = new Alumno("Manu", 7.99);
        lista.add(julian);
        lista.add(pepa);
        lista.add(manu);

        /** Si queremos obtener el índice de un elemento, usamos indexOf() */
        System.out.println("Vemos el índice de Pepa -> "+lista.indexOf(pepa));

        /** POR SUPUESTO QUE, TAMBIÉN TENEMOS LOS MÉTODOS set, contains, etc.**/
        julian.setNota(8.88);
        lista.set(2, new Alumno("Manu", 8d));
        System.out.println("¿Está la Pepa? "+lista.contains(pepa));
        System.out.println(lista);



    }
}
