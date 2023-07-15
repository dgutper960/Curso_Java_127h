package ClaseMath;

import java.util.Random;

public class EjemploClaseRandom {
    public static void main(String[] args) {

        /**
         * PARA ESTE EJEMPLO VAMOS A USAR LA CLASE RANDOM
         * DISPONE DE MÁS VERSATILIDAD QUE EL MÉTODO .random DE MATH
         * PODEMOS CREAR NÚMEROS ALEATORIOS DE TODOS LOS TIPOS
         * GENERA ALEATORIOS EN UN GRAN RANGO ENTRE POSITIVOS Y NEGATIVOS
         * **/

        /** Creamos un objeto de tipo Random con operador new */
        Random numRandom = new Random();

        /** podemos crear un entero de forma automática
         * --> Genera un número positivo o negativo en un gran rango */
        int intRandom = numRandom.nextInt();
        System.out.println("intRandom = " + intRandom);
        long longRandom = numRandom.nextLong();
        System.out.println("longRandom = " + longRandom);

        /** Si pasamos por argumento un número devuelve un núm entre 0 y ese valor, no inclusive */
        int intRandom2 = numRandom.nextInt(30); //+1 INCLUSIVE
        System.out.println("intRandom2 = " + intRandom2);

        /** Si queremos números en un rango dado (entre 15 y 45 ambos inclusive) **/
        int intRandom3 = 15 + numRandom.nextInt((45+1)-15); // debemos partir de 15 y luego restar 15
        System.out.println("intRandom3 = " + intRandom3);

    }
}
