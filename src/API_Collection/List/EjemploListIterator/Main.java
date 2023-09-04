package API_Collection.List.EjemploListIterator;

import API_Collection.Set.EjemploTreeSetComparable.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        /** Para este ejemplo crearemos una ListIterator partiendo de una LinkedList **/

        /** Creamos la LinkedList */
        LinkedList<Alumno> lista = new LinkedList<>();

        lista.add(new Alumno("Francisco", 5.34));
        lista.add(new Alumno("Ramona", 8.7));
        lista.add(new Alumno("Pepita", 3.99));
        lista.add(new Alumno("Miriam", 6.76));
        lista.add(new Alumno("Martín", 7.55));
        Alumno julian = new Alumno("Julián", 5.88);
        Alumno pepa = new Alumno("Pepa", 8.2);
        Alumno manu = new Alumno("Manu", 7.99);
        lista.add(julian);
        lista.add(pepa);
        lista.add(manu);
        System.out.println("Lista\n"+lista+"\n");

        /** La convertimos a ListIterator */
        ListIterator<Alumno> iterator = lista.listIterator();

        /** Iniciamos un while que itera hacia adelante (mientras haya elemento siguiente) */
        System.out.println("\nCursor hacia adelante:");
        while (iterator.hasNext()){
            Alumno alumno = iterator.next();
            System.out.println(alumno);
        }

        /** Iniciamos un while que itera hacia atrás (mientras haya elemento anterior) */
        System.out.println("\nCursor hacia atrás:");
        while (iterator.hasPrevious()){
            Alumno alumno = iterator.previous();
            System.out.println(alumno);
        }

        /** PARA ESTAS OPERACIONES DEBEMOS TENER EN CUENTA
         * LA POSICIÓN DEL CURSOR ANTES DE INICIAR EL WHILE
         * --> Ej.- Si comentamos el 1.er while de este código
         *          el segundo no va a iterar,
         *          porque el cursor está al principio y no hay elemento anterior **/

    }
}
