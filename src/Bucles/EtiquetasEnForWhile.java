package Bucles;

public class EtiquetasEnForWhile {
    public static void main(String[] args) {

        /**
         * CON LA ETIQUETA PODEMOS MARCAR SOBRE QUE BUCLE QUEREMOS
         * QUE ACTÚE UN BREAK O CONTINUE
         * CUANDO TENEMOS BUCLES ANIDADOS
         * */

        /** Ejemplo de for con un continue */
        for(int i = 0; i <= 4; i++){
            if(i == 2){ /** se va a saltar el 2 y el bucle continua */
                continue;
            }
            System.out.println("valor de i = " + i);
        }
        /** Aquí no hay problema, pero si tenemos un bucle anidado */


        /** marcamos el bucle con un ID: pegado al for por arriba o la izquierda */
       bucle1: // misma convención que para variables y métodos, seguido de dos puntos
        for (int i = 0; i <= 5; i++){

            System.out.println();//esto es para que se vea más claro
            for (int j = 0; j <=5 ; j++){
                if (i==2){
                    continue bucle1; /** marcamos que es para el bucle1*/
                } // queremos tener claro que el continue hace referencia al 1.er bucle
                System.out.println("[i = "+i+", j = "+j+"], ");
            }
        } /** VEMOS PERFECTAMENTE QUE EL BLOQUE DEL CONTINUE A ACTUADO SOLO SOBRE EL BUCLE 1
         --> Hemos quitado la marca y el bucle ha funcionado igual, pero entendemos que es un ejemplo  **/

        System.out.println("==================================================================");

        /** CON EL BRAKE EL FUNCIONAMIENTO ES EL MISMO
         * lo que con el break solo se van a ejecutar los bloques hasta i = 1 **/

        etiqueta1: // misma convención que para variables y métodos, seguido de dos puntos
        for (int i = 0; i <= 5; i++){

            System.out.println();//esto es para que se vea más claro
            for (int j = 0; j <=5 ; j++){
                if (i==2){
                    break etiqueta1; /** marcamos que es para etiqueta1*/
                } // queremos tener claro que el continue hace referencia al 1.er bucle
                System.out.println("[i = "+i+", j = "+j+"], ");
            }
        }

        /**
         *  TRAS ESTA SEGUNDA PRUEBA SI COMPROBAMOS QUE EFECTIVAMENTE,
         *  PUEDE HABER AMBIGÜEDAD SI NO MARCAMOS CORRECTAMENTE
         * --> El bloque if a actuado pero el brake no lo ha hecho
         * **/
    }
}
