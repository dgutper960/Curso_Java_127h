package ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1 = 1, num2 = 2;

        /** declaramos booleano primitivo y evaluamos */
        boolean primBoolean = num1 > num2; //false

        /** creamos objeto de Boolean con autoboxing*/
        Boolean objectBoolean = false; //

        /** creamos objeto Boolean de forma explícita */
        Boolean objectB1 = Boolean.valueOf(true);
        Boolean objectB2 = Boolean.valueOf("true");
        //tomar el valor de un primitivo
        Boolean objectB3 = primBoolean;

        /**
         * CON LOS BOOLEANOS PODEMOS COMPARA TANTO CON == COMO CON .equals
         * --> Siempre se toma el valor y no la referencia
         * **/

        System.out.println("Comparamos valores de objectB1 == objetB2 --> "+(objectB1 == objectB2)); //true
        System.out.println("Comparamos valores de objectB1.equals(objetB3) --> "+(objectB1 == objectB3)); //false
        System.out.println("Comparamos valores de objectB1.equals(objetB2) --> "+(objectB1 == objectB2)); //true


        /** Para tomar el valor primitivo de un Boolean usamos .booleanValue() */
        boolean primitivo = objectBoolean.booleanValue();
        /** El compilador lo hace automáticamente cuando usamos la variable Boolean */

    }
}
