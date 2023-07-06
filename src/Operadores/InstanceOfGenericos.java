package Operadores;

public class InstanceOfGenericos {
    public static void main(String[] args) {

        /**
         * VEAMOS EL CONCEPTO DE TIPO GENÉRICO
         * */

        /** Cogemos el Strin de antes y lo cambiamos a Objet */
//        String texto= "Esto es solo para crear un objeto de String";
        Object texto= "Esto es solo para crear un objeto de String";
        System.out.println("Objet texto = " + texto);


        /** Modificamos Integer a su genérico Number*/
        Number num = 98;

        // creamos booleano para preguntar
        Boolean b1 = texto instanceof String; // true
        System.out.println("texto instanceof String?? " + b1);

        //Ahora texto es de tipo Objet del que todos los objetos heredan
        b1 = texto instanceof Integer; // no da error
        System.out.println("texto instanceof Integer? " + b1); // false

        /** No podemos hacer un casting de String a Integer */
        //b1 = texto instanceof Integer; //ERROR DE SINTAXIS

        /**
         * TODOS LOS OBJETOS DE JAVA HEREDAN DE LA CLASE OBJET
         * */

        b1 = texto instanceof Object;
        System.out.println("texto instanceof Object? " + b1);

        /** ¿PODEMOS HACER CAST ENTRE TIPOS NUMÉRICOS DE REFERENCIA? **/
        /**al ser Numbre ya no da error */
        b1 = num instanceof Long;
        System.out.println("num instanceof Long? " + b1); // FALSE
        b1 = num instanceof Short;
        System.out.println("num instanceof Short? " + b1); // FALSE
        b1 = num instanceof Float;
        System.out.println("num instanceof Float? " + b1); // FALSE
        /** YA NO DA ERROR PUES TODAS HEREDAN DE NUMBER */
        b1 = num instanceof Number;
        System.out.println("num instanceof Number? " + b1);
        Float f1 = 8.88f;
        b1 = f1 instanceof Number;
        System.out.println("f1 instanceof Number? " + b1);

        /** Number es el genérico de los numéricos de referencia */
         // vamos a inicializar un Number con un entero
        Number i = 12;
        // preguntamos
        b1 = i instanceof Integer;
        System.out.println("i instaceof Integer?= " + b1);

        // vamos a probar con otro numérico
        Number d = 13.13e33;
        b1 = d instanceof Double;
        System.out.println("d instanceof Double? = " + b1);

        // concretamos que queremos un Float
        Number f = 33.33f;
        b1 = f instanceof Float;
        System.out.println("f instanceof Float? = " + b1);

        /** Ojo porque para números pequeños el por defecto es Integer*/
        Number s = 3;
        b1 = s instanceof Short; //false
        b1 = s instanceof Integer; //true
        System.out.println("b1 = " + b1);

        Number b = 13;
        b1 = b instanceof Byte; // false
        b1 = b instanceof Integer; // true
        System.out.println("b1 = " + b1);


        Long L = 9223372036854775807L;
        b1 = L instanceof Long;
        System.out.println("Long?? = " + b1);

        Number i2 = 214748364798L;
        b1 = i2 instanceof Long;
        System.out.println("i2 instanceof Long? = " + b1);

        /**
         * SI QUEREMOS DECLARAR UN NUMBER TENEMOS LAS OPCIONES
         * **/
        /** AUTO BOXER (recomendado) */
        Integer ent1 = 354; // La forma más habitual
        Number ent2 = 453; // Lo va a detectar por el literal

        /** DE FORMA EXPLÍCITA
         * --> Con operador new (DEPRECATED)
         * --> Método valueOf de Integer */
        Integer ent = Integer.valueOf(159); // La más común
        Number ent3 = Integer.valueOf(759); // versión para numérico
        Number ent4 = Integer.valueOf("486"); // versión para String

        Number flo1 = 89.36f;
        Number flo2 = Float.valueOf(569.32f);

        Number long1 = Long.valueOf(8546464L);





        /** Igualmente el Boolean */
        b1 = b1 instanceof Boolean;
//      b1 = b1 instanceof Number; //ERROR









    }
}
