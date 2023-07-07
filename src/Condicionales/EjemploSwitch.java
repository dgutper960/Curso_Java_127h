package Condicionales;

public class EjemploSwitch {
    public static void main(String[] args) {
        /**
         * CONDICIONAL SWITCH
         *
         * --> Toma una variable para evaluarla en diferentes casos
         * --> Una vez que se cumpla una condición (case) hace un brake automático
         * --> Puede tener un caso por defecto por si no se cumple ninguna de las opciones
         *
         * **/

        /** SINTAXIS SWITCH */

        int vatiable = 8; // Este valor se toma de otra parte del código

        switch (vatiable){ /** Solo valores primitivos, enum y String NO EXPRESIONES BOOLEANAS */
            case 1: /** si el valor de la variable es 1 ejecutamos sentencia 1 */
                // sentencia para caso 1
                System.out.println("Sentencia 1");
                break; // indicamos que la sentencia ha terminado y salimos del bloque
            case 2:
                System.out.println("Sentencia 2");
                break;
            case 3:
                System.out.println("Sentencia 3");
                break;
            case 4:
                System.out.println("Sentencia 4");
                break;
            default: // Esta sentencia se activa si no se cumple ninguna de las anteriores
                System.out.println("Sentencia por defecto");
        }




    }
}
