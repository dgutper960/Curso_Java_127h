package POO.ArrayDeObjetos;

import POO.RelacionEntreClases.Deposito;
import POO.RelacionEntreClases.Motor;
import POO.RelacionEntreClases.TipoMotor;
import POO.RelacionEntreClases.*;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        /** CREAMOS OBJETOS DE COCHE CON SUS ELEMENTOS
         * POSTERIORMENTE CREAREMOS UN ARRAY DE COCHES**/



        /** Creamos conductores **/
        Persona david = new Persona("David","Gutiérrez");
        Persona manolo = new Persona("Manolo","Garcia");
        Persona pepe = new Persona("Pepe","Mendoza");
        Persona julia = new Persona("julia","Menacho");
        Persona rosa = new Persona("Rosa","Nuñez");

        /** Creamos coches */
        Coche renault5 = new Coche("Renault", "R5", Color.AMARILLO);
        Coche seatIbiza = new Coche("Seat", "Ibiza", Color.ROSA);
        Coche peugeot205 = new Coche("Peugeot", "205", Color.AZUL);
        Coche golf = new Coche("Volkswagen", "Golf", Color.VERDE);
        Coche citroenC4 = new Coche("Citroen", "C4", Color.SILVER);
        Coche fordFiesta = new Coche("Ford", "Fiesta", Color.BLANCO);
        Coche audiA3 = new Coche("Audi", "A3", Color.NEGRO);
        Coche toyotaRaw4 = new Coche("Toyota", "RAW4", Color.NEGRO);
        Coche astonMartin = new Coche("Aston Martin", "Classic", Color.VERDE);
        Coche jumpyPlus = new Coche("Citroen", "Jumpy Plus", Color.AMARILLO);
        Coche seatAlhambra = new Coche("Seat", "Alhambra", Color.GOLD);

        System.out.println("seatAlhambra.getId() = " + seatAlhambra.getId()); //tenemos 11 elementos

        /*** Creamos un array de coches con el número de elementos que tenemos **/
        int numCoches = Coche.getUltimo_id();
        System.out.println("numCoches = " + numCoches);

        Coche[] coches = new Coche[numCoches];

        /**  Lo rellenamos */
        coches[0] = renault5;
        coches[1] = seatIbiza;
        coches[2] = peugeot205;
        coches[3] = golf;
        coches[4] = citroenC4;
        coches[5] = fordFiesta;
        coches[6] = audiA3;
        coches[7] = toyotaRaw4;
        coches[8] = astonMartin;
        coches[9] = jumpyPlus;
        coches[10] = seatAlhambra;

        /** iteramos con el for y vemos los respectivos toString **/
        for (int i=0; i< coches.length; i++){
            System.out.println(coches[i]);
        }

        System.out.println("\n==============\n");

        /***
         * SI QUEREMOS ORDENAR ESTE ARRAY
         * DEBEMOS IMPLEMENTAR EN LA CLASE LA INTERFAZ COMPARABLE
         * E IMPLEMENTAR EN LA CLASE EL MÉTODO compareTo de Comparable
         *
         * --> Usamos ArraySort() para ordenar por marca (Implementación compareTo en Coche)
         * **/
        Arrays.sort(coches);
        for (Coche coch : coches) {
            System.out.println(coch);
        }









    }

}
