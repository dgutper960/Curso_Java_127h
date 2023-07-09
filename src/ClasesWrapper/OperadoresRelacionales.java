package ClasesWrapper;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        /** Inicializamos un objeto Integer de manera implícita o explícita */
        // explícita
        Integer num = Integer.valueOf(1999);
        // implícita
        Integer num1 = 1000;
        /** Tomamos cualquiera y lo usamos para inicializar otro objeto */
        Integer num2 = num1;
        /** Sabemos que tienen el mismo valor, pero,
         * ¿Son el mismo objeto? */
        System.out.println("mismoObjeto? (num1 == num2) --> "+ (num1 == num2)); // true
        /** Esto es porque ambos objetos tienen la misma referencia **/

        /** Tomamos num2 y lo actualizamos por literal con el mismo valor */
        num2 = 1000;
        /** vemos que ya no son el mismo objeto */
        System.out.println("mismoObjeto? (num1 == num2) --> " + (num1 == num2)); // false

        /**
         * CON EL OPERADOR == ESTAMOS COMPARANDO LA REFERENCIA
         * PARA COMPARA EL VALOR USAREMOS EL MÉTODO .equals()
         * **/

        System.out.println("¿Tienen el mismo valor (num1.equals(num2))? "+ (num1.equals(num2))); // true
        System.out.println("¿Tienen el mismo valor (num.equals(num1))? "+ (num.equals(num1))); // fale

        /** Otra forma de hacer lo mismo es convertirlos previamente a valores primitivos */
        System.out.println("¿Tienen el mismo valor num1 y num2? "+ (num1.intValue() == num2.intValue())); // true
        System.out.println("¿Tienen el mismo valor num y num1? "+ (num.intValue() == num1.intValue())); // false

        /**
         * UNA PARTICULARIDAD DE JAVA ES QUE CON VALORES INFERIORES A 128
         * VA A COMPARAR LA IGUALDAD SIEMPRE POR VALOR DE MODO QUE SI CAMBIAMOS
         * TODOS LOS VALORES ANTERIORES A 127, TODAS LAS RESPUESTAS VAN A SER TRUE
         *
         * # salida de consola co los valores a 127 #
         *
         * mismoObjeto? (num1 == num2) --> true
         * mismoObjeto? (num1 == num2) --> true
         * ¿Tienen el mismo valor (num1.equals(num2))? true
         * ¿Tienen el mismo valor (num.equals(num1))? true
         * ¿Tienen el mismo valor num1 y num2? true
         * ¿Tienen el mismo valor num y num1? true
         *
         * */

        /**
         * ESTO ES COMPARANDO LA IGUALDAD ( == / .equals )
         *
         * PARA EL RESTO DE OPERADORES ARITMÉTICOS
         * SE VA A INVOCAR POR DEBAJO A .intValue() POR LO QUE
         * VAMOS A TRABAJAR COMO SI FUESEN PRIMITIVOS SIN PROBLEMAS
         *
         * */

        System.out.println("¿num es mayor que num1? --> "+(num > num1)); // true
        System.out.println("¿num1 es menor o igual a num2? --> "+(num1 <= num2)); // true
        System.out.println("¿num es mayor igual a num2? --> "+(num >= num2)); // true
        /** cuando es mayor/igual no hay conflicto */
        num++; // 1999 + 1
        System.out.println(num);  // 2000
        /** REALIZA .intValue() DE FORMA AUTOMÁTICA */
    }
}
