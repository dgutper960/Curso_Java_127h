package Bucles;

public class SentenciasDoWhile {
    public static void main(String[] args) {

        /**
         * A DIFERENCIA DE WHILE, SE VA A EJECUTAR AL MENOS UNA VEZ
         * DESPUÉS SEGÚN LA CONDICIÓN SE EJECUTA EL BUCLE O NO
         *
         * --> El código se va a ejecutar al menos una vez
         *
         * UTIL CUANDO NECESITAMOS REALIZAR ALGUNA ACCIÓN ANTES DE
         * EVALUAR SI DEBE HABER BUCLE O NO.
         * */

        /** EJEMPLO **/


        int i = 0;

        do{
            i++; /** ESTE BLOQUE EJECUTA ANTES DE EVALUAR LA CONDICIÓN */
            System.out.println(i); //--> la primera impresión fué 1
        } while ( i < 7); /** MIENTRAS SEA CIERTO SE EJECUTA EL BUCLE */
        System.out.println("Valor de i --> "+i); // 7

        System.out.println();

        boolean prueba = false;

        do{
            System.out.println(" ESTO SE IMPRIME SI O SI "+prueba);
        }while (prueba); /** como partimos de false y no cambia, no se ejecuta */
        System.out.println("Fuera del doWhile "+prueba);

        System.out.println();

        /** Veamos otro ejemplo **/
        prueba = true;
        int num = 0;

        do {
            if(num == 10){
                prueba = false; /** Debemos cambiar a false para que el bucle pare */
            }
            System.out.println(num);
            num++;
        }while(prueba); /** Mientras sea true ejecuta */

        System.out.println("prueba --> "+prueba); // false

        do{ // 1.ejecuta, 2.evalúa
            System.out.println("Bloque dentro doWhile2");
        }while (prueba); // es false no inicia el bucle

    }

}
