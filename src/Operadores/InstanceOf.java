package Operadores;

import java.awt.geom.Arc2D;

public class InstanceOf {
    public static void main(String[] args) {

        /**
         * PODEMOS VER SI UN OBJETO ES REFERENCIA DE UN TIPO
         * */

        /** Creamos objetos de diferentes tipos */
        String texto= "Esto es solo para crear un objeto de String";
        // Integer num2 = new Integer(67); --> Descontinuado
        Integer num = 98;

        // creamos booleano para preguntar
        Boolean b1 = texto instanceof String; // true
        System.out.println("texto instanceof String?? " + b1);

        /** No podemos hacer un casting de String a Integer */
        //b1 = texto instanceof Integer; //ERROR DE SINTAXIS

        /**
         * TODOS LOS OBJETOS DE JAVA HEREDAN DE LA CLASE OBJET
         * */

        b1 = texto instanceof Object;
        System.out.println("texto instanceof Object? " + b1);

        /** ¿PODEMOS HACER CAST ENTRE TIPOS NUMÉRICOS DE REFERENCIA? **/
//        b1 = num instanceof Long;
//        b1 = num instanceof Short;
//        b1 = num instanceof Float;
        /** NOS DA ERROR PUES SON CLASES PARALELAS
         * PERO TODAS HEREDAN DE NUMBER */
        b1 = num instanceof Number;
        System.out.println("num instanceof Number? " + b1);
        Float f1 = 8.88f;
        b1 = f1 instanceof Number;
        System.out.println("f1 instanceof Number? " + f1);


        /** Igualmente el Boolean */
        b1 = b1 instanceof Boolean;
//      b1 = b1 instanceof Number; //ERROR









    }
}
