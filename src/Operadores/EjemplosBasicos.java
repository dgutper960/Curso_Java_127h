package Operadores;

public class EjemplosBasicos {
    public static void main(String[] args) {
        /**
         * OPERADORES LÓGICOS
         * */

        /** Podemos abreviar cuando un número opera sobre su propio valor */
        //asignamos valor de a
        int a = 4; //vale 4
        //opera sobre si mismo
        a = a + 2; //vale 6
        //abreviatura
        a += 1; //vale 7

        a -= 2; // hora vale 5
        a *= 2; // vale 10
        a /= 2; // vale 5
        System.out.println("a = " + a); // 5

        /** INCREMENTO Y DECREMENTO
         * --> Según se ponga a la izquierda o derecha sera:
         * --> (++a) --> Pre-incremento  1º incremento, 2º asignación
         * --> (--a) --> Pre-decremento  1º incremento, 2º asignación
         * --> (a++) --> Pos-incremento  1º asignación, 2º incremento
         * --> (--a) --> Pre-decremento  1º asignación, 2º incremento  */

        /** Ejemplos de incremento y decremento en 1  */
        // a++ --> abreviatura de a=a+1;
        int b = 1;
        int c = ++b; // vale 2; primero incrementa y luego asigna
        System.out.println("c = " + c);
        b--; // volvemos a poner a b en 1
        c = b++; // c vale 1; primero asigna b y luego incrementa b en 1
        System.out.println("c = " + c);
        // y b ahora vale 2, ya que antes incrementó después de asignar a c
        System.out.println("b = " + b);

        /** Ejemplo Operador Ternario o Condicional */
        /** Sintaxis --> (condición)? valor1:valor2 */
                    /* True = valor1 ; False = valor2*/

        // d vale 2 y pregunta si d es > 3, no lo es, se escoge la 2º opción
        int d = 2 >3? 1:2; //--> asigna 2 a d
        System.out.println("d = " + d);
        //repetimos cambiando los valores
        // partimos de que d vale 2
        int e = 1 >5? 2:7; //--> asigna 7
        System.out.println("e = " + e);

        /** OPERADORES CONDICIONALES
         * --> Comparan valores entre primitivos
         * --> Para objetos comparan la referencia
         *        >, <, >=, <=, ==, !=              */

        /** OPERADORES LÓGICOS
         * --> Evaluan expresiones lógicas
         * --> Operaciones lógicas
         *
         * --> AND -> A && B -> Cuando A y B son verdaderos (CONDICIONAL)
         * --> OR  -> A || B-> Cuando A o B son verdadero (CONDICIONAL)
         * --> NOT -> !A -> Verdadero cuando A es falso
         * --> AND -> A & B -> Verdadero cuando A y B son verdaderos
         * --> OR  -> A | B -> Verdadero cuando A o B son verdadero
         * --> XOR -> A ^ B -> Verdadero cuando A y B son diferentes
         * */

        /**
         * ORDEN DE PRIORIDAD DE LOS OPERADORES
         *
         * 1.- Operadores de incremento decremento  ++, --, +, - , !
         *
         * 2.- Paréntesis  ()
         *
         * 3.- Aritméticos  *, /, %
         *
         * 4.- Aritméticos +, -
         *
         * 5.- Aritméticos, De Tipo <, <=, >, >=, instanceof
         *
         * 6.- Booleano  ==, !=
         *
         * 7.- Booleano  &&
         *
         * 8.- Booleano  ||
         *
         * 9.- Booleano  ()?:
         *
         * 10.- Asignación y/o operación =, +=, -=, *=, /=, %=
         *
         * */















    }
}
