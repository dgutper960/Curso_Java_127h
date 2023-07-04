package Operadores;

public class IncrementelesDecrementales {
    public static void main(String[] args) {

        /**
         * PRE-INCREMENTO
         * */
        // iniciamos con una variable con valor de 1
        int i = 1;
        // operador ++ antepuesto --> 1ºIncremento, 2ºAsignación
        int j = ++i; // vale 2
        // Tanto i como j valen 2
        System.out.println("i = " + i); // 2
        System.out.println("j = " + j); // 2

        /**
         * POS-INCREMENTO
         * */
        // operador ++ pospuesto --> 1ºAsignación, 2ºIncremento
        //partíamos de que i vale 2
        i = 2;
        //asignamos con el operador pospuesto
        j = i++; //primero asigna y después incrementa
        System.out.println("i = " + i);  // 3
        System.out.println("j = " + j);  // 2

        /**
         * PRE-DECREMENTO
         * */
        // Partimos de que i vale 3
        i = 3;
        j = --i; // 1ºDecremento, 2ºAsignación
        System.out.println("i = " + i); // 2
        System.out.println("j = " + j); // 2

        /**
         * POS-DECREMENTO
         * */

        // Partimos de qu i vale 2
        i = 2;
        j = i--; // 1ºAsignación, 2ºDecremento
        System.out.println("i = " + i); // 1
        System.out.println("j = " + j); // 2

        /** Pre-incremento y Pos-decremento en una impresión */
        System.out.println("j pre-incremento = " + (++j)); // vale 3
        System.out.println("j pos-incremento = " + (j++)); // vale 3

        System.out.println("j = " + j); // vale 4




    }
}
