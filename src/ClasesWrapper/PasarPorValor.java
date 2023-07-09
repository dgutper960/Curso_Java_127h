package ClasesWrapper;

public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;
        /** miramos el valor de i en main */
        System.out.println("El valor de i en main es = " + i);
        /** llamamos a test() como tiene parámetro de entrada hay que dárselo */
        test(i); /** ahora la entrada de test tiene el valor de i en main */
        System.out.println("Finaliza el metodo main con i a valor de "+i);

        /** Si hacemos lo mismo con una clase Wrapper (String, Integer, Double, etc)
         * se va a crear una nueva instancia y va a ocurrir lo mismo, ya que,
         * LAS CLASES WRAPPER SON INMUTABLES
         * OTRAS CLASES COMO POR EJEMPLO LAS PROPIAS */

        Integer num = 10;
        System.out.println("El valor inicial de num en main es num = " + num);
        /** llamamos a test2() */
        test2(num);
        System.out.println("El valor final de num en main es = " + num);

    }

    /** COMO MAIN ES UN MÉTODO ESTÁTICO, NUESTRO MÉTODO DEBERÁ SER ESTÁTICO PARA PODER LLAMARLO **/
    public static void test(int i ){
        /** el valor inicial de i en test es el que llega por main */
        System.out.println("El valor inicial de i en test es = "+i);
        /** cambiamos el valor de i en test */
        i = 35;
        System.out.println("El valor de i en test ha cambiado a = "+i);
    }

    public static  void test2(Integer num){
        System.out.println("El valor inicial de num en test2 es = " + num);
        /** cambiamos el valor */
        num = 58;
        System.out.println("El valor final de num en test2 es = " + num);
    }

    /** SALIDA POR CONSOLA:
     *
     * El valor de i en main es = 10
     * El valor inicial de i en test es = 10
     * El valor de i en test ha cambiado a = 35
     * Finaliza el método main con i a valor de 10
     * El valor inicial de num en main es num = 10
     * El valor inicial de num en test2 es = 10
     * El valor final de num en test2 es = 58
     * El valor final de num en main es = 10
     *
     */
}
