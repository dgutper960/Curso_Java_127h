package Bucles;

public class SentenciasWhile {
    public static void main(String[] args) {

        /**
         * WHILE = MIENTRAS
         * SE EVALÚA UNA EXPRESIÓN BOOLEANA
         * EL BUCLE CONTINUA MIENTRAS SE CUMPLA LA CONDICIÓN
         * IMPORTANTE COLOCAR EL INCREMENTO DE MANERA CORRECTA
         * DEBEMOS EVITAR LOS BUCLES INFINITOS
         * */

        /** VEMOS UN EJEMPLO SENCILLO **/
        int num = 0;
        while (num < 5){ // a menor estricto va a llegar a 5 pero no lo va a imprimir
            System.out.println(num); // en la primera vuelta vale 0
            num++;//pos-incremento
        }
        // comprobamos el valor de num
        System.out.println("Valor de num "+num); // debería valer 5

        System.out.println();
        /** recordamos que num vale 5
         * vamos a cambiar el pos-incremento a pre-incremento*/
        while (num <= 10){ // queremos que imprima 10
            System.out.println(num);
            ++num;
        }
        // Ahora el valor de num debería ser 11
        System.out.println("Valor de num "+num);

        System.out.println("\n");
        /** TENEMOS RESULTADOS IDÉNTICOS
         * VAMOS A COLOCAR AHORA EL INCREMENTO DELANTE DE LA IMPRESIÓN */
        num = 0;
        while (num < 5){ // a menor estricto va a llegar a 5 pero no lo va a imprimir
            num++;//pos-incremento
            System.out.println(num); // en la primera vuelta vale 0
        }
        // comprobamos el valor de num
        System.out.println("Valor de num "+num); // debería valer 5

        System.out.println();
        /** recordamos que num vale 5
         * vamos a cambiar el pos-incremento a pre-incremento*/
        while (num <= 10){ // queremos que imprima 10
            ++num;
            System.out.println(num);
        }
        // Ahora el valor de num debería ser 11
        System.out.println("Valor de num "+num);

        /** VEAMOS OTRO EJEMPLO */

        boolean prueba = true;
        while (prueba){
            num++;
            if (num == 50){  /** en estos casos debemos tener muy en cuenta la condición para salir del bucle */
                prueba = false;
            }
          //  System.out.println("Valor de num --> "+num); --> imprimirá en cada iteración
        }
        System.out.println("Valor de num --> "+num);
        System.out.println("prueba = " + prueba); // --> false = el valor de prueba sigue modificado



    }
}
