package API_Collection.Set.IterandoSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /** Creamos una List, HashSet o TreeSet de Alumnos **/
        //List<Alumno> alumnos = new ArrayList<>();
        Set<Alumno> alumnos = new TreeSet<>(/*Comparator.comparing(Alumno::getNombre)*/); /** PODEMOS SOBREESCRIBIR EL compareTo */
        /** Si creamos un LinkedList obtenemos una lista ordenada */
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

        System.out.println("\n=== Imprimimos Directamente ===");
        System.out.println("alumnos = " + alumnos);

        System.out.println("\n=== Iteramos con foreach ===");
        for (Alumno alumno: alumnos ){
            System.out.println(alumno);
        }

        System.out.println("\n=== Iteramos con while e Iterator ===");
        // Creamos objeto de iterator
        Iterator<Alumno> iterator = alumnos.iterator();
        while (iterator.hasNext()){ // mientras exista un siguiente objeto
            // extraemos el alumno
            Alumno alumno = iterator.next();
            System.out.println(alumno); // imprimimos el tiString de Alumno (getNombre() + getNota())
        }

        System.out.println("\n=== Iteramos con Collection.forEach y expresión LAMBDA ===");
        alumnos.forEach(a -> System.out.println(a.toString()));

        System.out.println("\n=== Iteramos con Collection.forEach y expresión LAMBDA optimizada ===");
        alumnos.forEach(System.out::println);

        /** En el caso de List también podemos iterar con un for tradicional **/
//        for (int i =0; i< alumnos.size(); i++){
//            System.out.println(alumnos.get(i)); // .get() obtiene elemento por indice
//        } // El propio IDEA nos recomienda del cambio a foreach
        /** SOLO PARA LIST, LOS SET NO TIENEN .get() **/


    }
}
