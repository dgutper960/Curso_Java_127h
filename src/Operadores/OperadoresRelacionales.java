package Operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        /**
         * LOS OPERADORES RELACIONALES SE USAN PARA COMPARAR VALORES PRIMITIVOS
         * RETORNAN UN BOOLEANO CON EL RESULTADO DE LA COMPARACIÓN
         * */

        // DEFINIMOS ALGUNAS VARIABLES PARA COMPARA CON LOS DIFERENTES OPERADORES
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        /** COMPARACIÓN DE IGUALDAD */
        //RECORDEMOS QUE ESTOS OPERADORES RETORNAN UN BOOLEANO
        boolean b1 = i == j; // b1 = false
        boolean b2 = i == 3; // b2 = true
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        // podemos negar directamente un booleano
        System.out.println("(b2 es true) --> !b2 = " + !b2);

        /** COMPARADOR DE DESIGUALDAD */
        b1 = i != j; // true --> i y j son diferentes
        b2 = j != 7; // false --> j vale 7, por lo tanto son iguales
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        /** COMPARACIÓN DE BOOLEANOS */
        boolean b4 = m == true; // false
        System.out.println("b4 = " + b4);
        b4 = m != false; // false
        System.out.println("b4 = " + b4);

        /**
         *  COMPARADORES MAYOR, MENOR, MAYOR IGUAL, MENOR IGUAL
         * */

        boolean b5 = i < j; // true
        boolean b6 = i >= 3; // true
        System.out.println("b5 ¿i < j? = " + b5);
        System.out.println("b6 ¿i >= 3? = " + b6);


        /**
         * SIEMPRE SE VAN A RESOLVER PRIMERO LOS OPERADORES RELACIONALES Y LUEGO LOS DE ASIGNACIÓN
         * OPCIONALMENTE SE PUEDE RECURRIR AL PARÉNTESIS PARA FACILITAR LA LECTURA VISUAL
         * */





    }
}
