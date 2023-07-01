package HolaMundo;

public class PrimitivosBooleanos {
    public static void main(String[] args) {

        /**
         * LOS BOOLEANOS SOLO ADMITEN DATOS LÓGICOS TRUE / FALSE (1 bit)
         * en Java por defecto es false
         * */

        boolean datoLogico = true;
        System.out.println(datoLogico);
        /** Se usan básicamente en métodos para retornos, condicionales, bucles, etc
         * VEAMOS UN EJEMPLO--> */
        // inicializamos dos variables con notación científica
        float f = 2386237.98e-15f;
        double d = 0.00000238623798e-11;
        // comprobamos si f es menor a d
        datoLogico = (f < d);
        // vemos que el valor ha cambiado a false (ya que f es mayor a d)
        System.out.println("el valor de f es menor a d ?? "+datoLogico);

        /** VEAMOS OTRO EJEMPLO MÁS SENCILLO */
         boolean esIgual = (3-2) == 1;
        System.out.println("¿3 menos 2 es igual a 1? "+esIgual);





    }
}
