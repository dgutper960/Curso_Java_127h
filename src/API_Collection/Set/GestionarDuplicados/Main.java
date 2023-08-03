package API_Collection.Set.GestionarDuplicados;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /** Creamos un HashSet de Alumnos **/
        Set<Alumno> alumnos = new HashSet<>(/*Comparator.comparing(Alumno::getNombre)*/); /** PODEMOS SOBREESCRIBIR EL compareTo */
        alumnos.add(new Alumno("David", 8d));
        alumnos.add(new Alumno("Martin", 7.8));
        alumnos.add(new Alumno("María", 9.5));
        alumnos.add(new Alumno("Lucía", 5.8));
        alumnos.add(new Alumno("Vero", 6.9));
        alumnos.add(new Alumno("Tere", 4.95)); // nota repetida
        alumnos.add(new Alumno("Risco", 4.95));// nota repetida
        alumnos.add(new Alumno("Felipe", 0d)); // nombre y nota repetidos
        alumnos.add(new Alumno("Felipe", 0d)); // nombre y nota repetidos
        /** COMO HEMOS CAMBIADO A HASH_SET, PERDEMOS LA PROPIEDAD DE ORDENACIÓN
         * SI LO DEJAMOS EN TREE_SET NO PODEMOS REPETIR NO NOMBRE NI NOTA **/


        /** Si imprimimos, nos va a dar error,
         * ya que los elementos de TreeSet deben implementar Comparable */
        System.out.println("alumnos = " + alumnos);
        /** Debemos implementar Comparable en alumno y definir su método compareTo
         * por ejemplo los podemos ordenar por nota */

    }
}
