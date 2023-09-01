package API_Collection.EjemploArrayList_ComparableComparator;

import API_Collection.Set.GestionarDuplicados.Alumno;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /** Creamos una List de Alumnos **/
        List<Alumno> alumnos = new ArrayList<>();
        /** Si creamos un LinkedList obtenemos una lista ordenada (por inserción) */
        //List<Alumno> alumnos = new LinkedList<>();
        alumnos.add(new Alumno("David", 8d));
        alumnos.add(new Alumno("Martin", 7.8));
        alumnos.add(new Alumno("María", 9.5));
        alumnos.add(new Alumno("Lucía", 5.8));
        alumnos.add(new Alumno("Vero", 6.9));
        alumnos.add(new Alumno("Tere", 4.95)); // nota repetida
        alumnos.add(new Alumno("Risco", 4.95));// nota repetida
        alumnos.add(new Alumno("Felipe", 0d)); // nombre y nota repetidos
        alumnos.add(new Alumno("Felipe", 0d)); // nombre y nota repetidos

        System.out.println(alumnos);

        System.out.println("\n=== Iteramos con Collection.forEach y expresión LAMBDA optimizada ===");
        alumnos.forEach(System.out::println);
        /** Tenemos un orden de inserción, que admite duplicados */

        /** Para ordenar vamos a usar el método sort de la clase Collections y pasamos la lista por argumento
         * --> Por defecto se aplica el orden que tengamos implementado en el compareTo de Alumno */
        Collections.sort(alumnos);


        System.out.println("\n# Elementos ordenados por compareTo de Alumno:");
        alumnos.forEach(System.out::println);
        /* Muestra un orden ascendente por nota */

        /** Podemos implementar un orden concreto que sobreescriba el compareTo **/
        System.out.println("\norden por nota descendente");
        Collections.sort(alumnos, (a, b) -> b.getNota().compareTo(a.getNota()));
        alumnos.forEach(System.out::println);
        /** Usando la recomendación del IDE */
        System.out.println("\norden por nombre con IgnoreCase");
        alumnos.sort((a, b) -> a.getNombre().compareToIgnoreCase(b.getNombre()));
        alumnos.forEach(System.out::println);

        /**
         * EL IDE nos sugiere que modifiquemos:
         * Collections.sort(alumnos, (a, b) -> b.getNota().compareTo(a.getNota()));
         *
         * se puede usar directamente el sort de ArrayList
         * alumnos.sort((a, b) -> b.getNota().compareTo(a.getNota()));
         * **/

        /** A PARTIR DE JAVA 8 SE PUEDE USAR EL MÉTODO COMPARING DE COMPARATOR **/
        // alumnos.sort(Comparator.comparing((Alumno a) -> a.getNombre())); // EXPRESIÓN LAMBDA SIN SIMPLIFIAR
        alumnos.sort(Comparator.comparing(Alumno::getNombre)); // EXPRESIÓN LAMBDA SIMPLIFICADA POR REFERENCIA
        /**  Y TAMBIÉN EL MÉTODO REVERSE */
        // alumnos.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed()); // EXPRESIÓN LAMBDA SIN SIMPLIFIAR
        alumnos.sort(Comparator.comparing(Alumno::getNota).reversed());

        /** LO IDEAL SERÍA HACER ESTO EN EL ARGUMENTO AL CREAR LA LISTA **/







    }
}
