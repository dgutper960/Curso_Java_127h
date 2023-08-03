package API_Collection.Set.EjemploSetComparable.set;

import API_Collection.Set.EjemploSetComparable.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparable {
    public static void main(String[] args) {

        /** Creamos un TreeSet de Alumnos **/
        Set<Alumno> alumnos = new TreeSet<>(/*Comparator.comparing(Alumno::getNombre)*/); // PODEMOS SOBREESCRIBIR EL compareTo
        alumnos.add(new Alumno("David", 8d));
        alumnos.add(new Alumno("Martin", 7.8));
        alumnos.add(new Alumno("María", 9.5));
        alumnos.add(new Alumno("Lucía", 5.8));
        alumnos.add(new Alumno("Vero", 6.9));
        alumnos.add(new Alumno("Tere", 4.95));
        alumnos.add(new Alumno("Felipe", 0d));

        /** Si imprimimos, nos va a dar error,
         * ya que los elementos de TreeSet deben implementar Comparable */
        System.out.println("alumnos = " + alumnos);
        /** Debemos implementar Comparable en alumno y definir su método compareTo
         * por ejemplo los podemos ordenar por nota */

    }
}
