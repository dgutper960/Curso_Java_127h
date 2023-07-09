package ClasesWrapper;

import Arreglos.IntroduccionArreglos;

public class WraperInteger {
    public static void main(String[] args) {

        /** DECLARACIÓN RECOMENDADA POR LITERAL */

        /** Declaramos por autoboxing*/
        Integer num = 98253;

        /** Declaramos de forma estática */
        Integer num2 = Integer.valueOf(7519);

        /** Mediante un primitivo */
        int primitivo = 37;
        Integer num3 = Integer.valueOf(primitivo);

        /** Mediante un String */
        String s1 = "987";
        Integer num4 = Integer.valueOf(s1);
        Integer num5 = Integer.valueOf("457");

        /** Pasamos de Integer a int */
        Integer num6 = 1789;
        // de manera automática
        int i2 = num6;
        // de forma explícita
        int i3 = num6.intValue(); //método de una instancia de Integer

        /***
         * PODEMOS PASAR DE UN TIPO A OTRO SIN PROBLEMA
         * SIEMPRE Y CUANDO TENGAMOS EN CUENTA LAS CAPACIDADES
         * DE LOS RESPECTIVOS TIPOS PARA EVITAR LA AMBIGÜEDAD O PÉRDIDA DE INFORMACIÓN
         * */

        Integer num7 = 18;
        Byte b = num7.byteValue();
        Short s = num7.shortValue();
        Float f = num7.floatValue();
        Float f2 = f * 12.589f;
        Double d = Double.valueOf(89.82f) * f2 + s + b; // tener en cuenta la prioridad
        System.out.println("d = " + d);
        /** AL PASAR DE TIPOS GRANDES A TIPOS PEQUEÑOS
         * ASEGURARNOS DE EVITAR LA PERDIDA DE DATOS O AMBIGÜEDAD */

        /*** usamos las variables para que se resalten **/
        long suma = num+num2+num3+num4+num5+num6+num7+i2+i3;


    }
}
