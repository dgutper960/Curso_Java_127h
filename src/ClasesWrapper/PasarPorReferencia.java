package ClasesWrapper;

public class PasarPorReferencia {
    public static void main(String[] args) {

        /**
         *      INSTANCIA POR REFERENCIA
         * --> Existe un puntero de memoria que referencia un objeto
         *
         *      LAS CLASES WRAPPER SON INMUTABLES
         *      POR LO QUE SU VALOR NO CAMBIA, se crea una nueva instancia del objeto
         *      PERO OTRAS NO LO SON, VAMOS A VERLO
         * **/

        /** CREAMOS EN MAIN UN ARRAY QUE, COMO SABEMOS, ES DE REFERENCIA */
        int[] edad ={10, 11, 12}; /** valores iniciales en el main (10, 11, 12)*/
        System.out.println("Edades iniciales en el main");
        for (int i:edad) {
            System.out.println(i);
        }
        /**llamamos a test */
        test(edad);
        /** vemos los valores finales */
        System.out.println("Edades finales en el main");
        for (int i:edad) {
            System.out.println(i);
        }
    }

    public static void test(int[] edadArray){
        System.out.println("Edades iniciales en el test");
        for (int i:edadArray) {
            System.out.println(i);
        }
        /** ALTERAMOS LOS VALORES DE LAS EDADES */
        for (int i= 0; i < edadArray.length; i++) {
           edadArray[i] = edadArray[i] + 20;
        }
        /** Vemos valores de edades */
        System.out.println("Edades finales en el test");
        for (int i:edadArray) {
            System.out.println(i);
        }

        /** SALIDA POR CONSOLA
         *
         * Edades iniciales en el test
         * 10
         * 11
         * 12
         * Edades finales en el test
         * 30
         * 31
         * 32
         * Edades finales en el main
         * 30
         * 31
         * 32
         *
         * VEMOS QUE EL OBJETO edades SE HA MODIFICADO */

    }


}
