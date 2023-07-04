package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        /**
         *         OPERADORES LÓGICOS
         *
         * --> AND -> (A && B) -> Todas deben cumplirse para true
         * --> OR  -> (A || B) -> Solo una debe cumplirse para true
         *
         * */

        // DEFINIMOS ALGUNAS VARIABLES
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        /** AND comparamos varias expresiones para ver si se cumplen todas */
        boolean b1 = (i < j ) && (k == 0); // la segunda no se cumple, return --> false
        System.out.println("(i < j ) && (k == 0) --> b1 = " + b1);

        b1 = (i != j) && (k > 0); // todas se cumplen, return --> true
        System.out.println("(i != j) && (k < 0) --> b1 = " + b1);

        /** OR basta con que se cumpla una de las opciones */
        b1 = (i < j ) || (k == 0); // solo una se cumple, return --> true
        System.out.println("(i < j ) || (k == 0) --> b1 = " + b1);


        /** COMBINACIÓN AND Y OR */
        b1 = (i < k) && (k == l) || (m == false); // true, ya que se cumple una de las condiciones del OR
        b1 = (i < k && k == l) || (m == false); // es lo mismo
        b1 = i < k && k == l || m == false; // es lo mismo
        System.out.println("(i < k) && (k == l) || (m == false) --> b1 = " + b1);

        /**
         * LOS PARÉNTESIS SON OPCIONALES, solo añaden facilidad visual
         * pero también se pueden usar para marcar la prioridad de las operaciones
         * */
        b1 = i < k && k == l || m == false;  // true, lo mismo de arriba
        b1 = i < k && (k == l || m == false); // false, ya que la primera no se cumple y el OR es un bloque a parte
        System.out.println("i < k && (k == l || m == false) --> b1 = " + b1);

        /**
         * PRIORIDAD ENTRE OPERADORES
         * --> AND siempre prioriza ante OR (si un AND no se cumple se retorna false directamente)
         * */

        // veamos un ejemplo
        /** primero evalúa el AND por lo que el resto del bloque es un OR */
        b1 = i < j || k < l && m == true; // el resultado es true
        // esta comparación es equivalente a esta
        b1 = i < j || (k < l && m == true); // vemos el true más claramente
        System.out.println("i < j || k < l && m == true --> b1 = " + b1);

        /** PODEMOS USAR LOS PARÉNTESIS PARA CAMBIAR LA PRIORIDAD DEL AND SOBRE EL FALSE */
        /** ejemplo */
        boolean b2 = true || true && false; // false
        boolean b3 = true || false && false || true; // true


        // comparación original que da true por el orden de prioridad del AND
        b1 = i < j || k < l && m == true; //--> true
        System.out.println("i < j || k < l && m == true --> b1 = " + b1);
        // cambiamos la prioridad al OR mediante uso de paréntesis
        b1 = (i < j || k < l) && m == true; //--> false
        System.out.println("(i < j || k < l) && m == true --> b1 = " + b1);








    }
}
